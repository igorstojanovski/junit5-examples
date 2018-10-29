package org.igorski.extensions;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class WireMockExtension implements AfterEachCallback, ParameterResolver {

    private ThreadLocal<WireMockServer> wireMockLocal = new ThreadLocal<>();

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        wireMockLocal.get().stop();
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().isAnnotationPresent(WireMock.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        WireMockServer wireMockServer = new WireMockServer(options().dynamicPort());
        wireMockLocal.set(wireMockServer);
        wireMockServer.start();

        return wireMockServer;
    }
}
