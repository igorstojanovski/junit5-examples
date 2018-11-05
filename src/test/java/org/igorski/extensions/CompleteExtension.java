package org.igorski.extensions;


import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompleteExtension implements BeforeAllCallback, BeforeEachCallback,
        BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterEachCallback,
        AfterAllCallback {
    private static final Logger LOG = LoggerFactory.getLogger(CompleteExtension.class);

    public CompleteExtension() {
        LOG.info("Creating Complete extension instance.");
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) {
        LOG.info("    After all the tests finish.");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        LOG.info("    After each test.");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) {
        LOG.info("    After test execution.");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        LOG.info("    Before all tests start");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        LOG.info("    Before each test.");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        LOG.info("    Before test execution starts.");
    }
}
