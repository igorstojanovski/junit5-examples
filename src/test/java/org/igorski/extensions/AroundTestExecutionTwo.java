package org.igorski.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extension that runs before and after test execution.
 */
public class AroundTestExecutionTwo implements BeforeTestExecutionCallback,
        AfterTestExecutionCallback {
    private static final Logger LOG = LoggerFactory.getLogger(AroundTestExecutionTwo.class);

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        LOG.info("    Before Test execution - TWO");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) {
        LOG.info("    After Test execution - TWO");
    }
}
