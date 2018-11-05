package org.igorski;

import org.igorski.extensions.CompleteExtension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple test class with a single test that uses the {@link CompleteExtension}.
 * Define @BeforeAll, @BeforeEach, @AfterEach, and @AfterAll to demonstrate all lifecycle phases of a test.
 *
 */
@ExtendWith(CompleteExtension.class)
public class SingleExtensionTest {

    private static final Logger LOG = LoggerFactory.getLogger(CompleteExtension.class);

    @BeforeAll
    public static void beforeAll() {
        LOG.info("@BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        LOG.info("@AfterAll");
    }

    @BeforeEach
    public void beforeEach() {
        LOG.info("@BeforeEach");
    }

    @Test
    public void shouldRunTheTest() {
        LOG.info("From inside the test.");
    }

    @Disabled
    public void shoulBeDisabled() {
        LOG.info("Disabled test.");
    }

    @AfterEach
    public void afterEach() {
        LOG.info("@AfterEach");
    }
}
