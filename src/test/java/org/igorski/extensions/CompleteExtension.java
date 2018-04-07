package org.igorski.extensions;


import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class CompleteExtension implements BeforeAllCallback, BeforeEachCallback,
        BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterEachCallback,
        AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext extensionContext) {
        System.out.println("    After all the tests finish.");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        System.out.println("    After each test.");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) {
        System.out.println("    After test execution.");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        System.out.println("    Before all tests start");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        System.out.println("    Before each test.");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        System.out.println("    Before test execution starts.");
    }
}
