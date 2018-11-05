package org.igorski.listeners;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicListener implements TestExecutionListener {

    private static final Logger LOG = LoggerFactory.getLogger(BasicListener.class);

    public BasicListener() {
        LOG.info("Simple.");
    }

    public void testPlanExecutionStarted(TestPlan testPlan) {
        LOG.info("Test plan execution started.");
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        LOG.info("Test plan execution finished.");
    }

    public void dynamicTestRegistered(TestIdentifier testIdentifier) {
        LOG.info("Dynamic test registered.");
    }

    public void executionSkipped(TestIdentifier testIdentifier, String reason) {
        LOG.info("Skipped execution because of " + reason);
    }

    public void executionStarted(TestIdentifier testIdentifier) {
        LOG.info("Test execution STARTED of test: " + testIdentifier.getDisplayName());
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        LOG.info("Test execution FINISHED of test: " + testIdentifier.getDisplayName());
    }

    public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
        LOG.info("Reporting entry published.");
    }

}
