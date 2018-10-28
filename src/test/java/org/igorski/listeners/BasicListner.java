package org.igorski.listeners;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

public class BasicListner implements TestExecutionListener {

    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("Test plan execution started.");
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        System.out.println("Test plan execution finished.");
    }

    public void dynamicTestRegistered(TestIdentifier testIdentifier) {
        System.out.println("Dynamic test registered.");
    }

    public void executionSkipped(TestIdentifier testIdentifier, String reason) {
        System.out.println("Skipped execution because of " + reason);
    }

    public void executionStarted(TestIdentifier testIdentifier) {
        System.out.println("Test execution STARTED of test: " + testIdentifier.getDisplayName());
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        System.out.println("Test execution FINISHED of test: " + testIdentifier.getDisplayName());
    }

    public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
        System.out.println("Reporting entry published.");
    }

}
