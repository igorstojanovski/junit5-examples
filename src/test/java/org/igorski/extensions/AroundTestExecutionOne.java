package org.igorski.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extension that runs before and after test execution.
 */
public class AroundTestExecutionOne implements BeforeTestExecutionCallback,
        AfterTestExecutionCallback {

    private static final Logger LOG = LoggerFactory.getLogger(AroundTestExecutionOne.class);

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        LOG.info("    Before Test execution - ONE");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception
    {
        LOG.info("    After Test execution - ONE");
    }
}
