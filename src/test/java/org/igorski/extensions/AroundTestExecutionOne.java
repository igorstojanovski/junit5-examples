package org.igorski.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Extension that runs before and after test execution.
 */
public class AroundTestExecutionOne implements BeforeTestExecutionCallback,
        AfterTestExecutionCallback {

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        System.out.println("    Before Test execution - ONE");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception
    {
        System.out.println("    After Test execution - ONE");
    }
}
