package org.igorski;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.igorski.client.GenericHttpClient;
import org.igorski.extensions.AroundTestExecutionOne;
import org.igorski.extensions.AroundTestExecutionTwo;
import org.igorski.extensions.CompleteExtension;
import org.igorski.extensions.WireMock;
import org.igorski.extensions.WireMockExtension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Simple test class with a single test that uses the {@link CompleteExtension}.
 * Define @BeforeAll, @BeforeEach, @AfterEach, and @AfterAll to demonstrate all lifecycle phases of a test.
 *
 */
@ExtendWith({AroundTestExecutionOne.class, AroundTestExecutionTwo.class, WireMockExtension.class})
public class MultipleExtensionTest {

    private static final Logger LOG = LoggerFactory.getLogger(AroundTestExecutionOne.class);

    private final GenericHttpClient httpClient = new GenericHttpClient();

    @BeforeAll
    public static void beforeAll() {
        LOG.info("@BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        LOG.info("@AfterAll");
    }

    @Test
    public void shouldSendGetRequest(@WireMock WireMockServer server) {
        server.stubFor(get(urlEqualTo("/some/thing"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Hello world!")));

        String response = httpClient.sendGetRequest("http://localhost:" + server.port() + "/some/thing");

        assertThat(response).isEqualTo("Hello world!");
    }

    @BeforeEach
    public void beforeEach() {
        LOG.info("@BeforeEach");
    }

    @AfterEach
    public void afterEach() {
        LOG.info("@AfterEach");
    }
}
