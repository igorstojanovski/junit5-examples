package org.igorski.listeners;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import java.util.Set;

public class RestEasySnitcher implements TestExecutionListener {

    private final SnitchingClient snitchingClient = new SnitchingClient();

    public void testPlanExecutionStarted(TestPlan testPlan) {
        Set<TestIdentifier> roots = testPlan.getRoots();

        for(TestIdentifier testIdentifier : roots) {
            Set<TestIdentifier> children = testPlan.getChildren(testIdentifier.getUniqueId());
            printInfo(children, testPlan);
        }
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        snitchingClient.setSessionEndTime(System.currentTimeMillis());
    }

    public void dynamicTestRegistered(TestIdentifier testIdentifier) {
        snitchingClient.registerDynamicTest(testIdentifier.getParentId(), testIdentifier.getDisplayName());
    }

    public void executionSkipped(TestIdentifier testIdentifier, String reason) {
        snitchingClient.markSkipped(testIdentifier.getUniqueId(), reason);
    }

    public void executionStarted(TestIdentifier testIdentifier) {
        snitchingClient.setStartTime(testIdentifier, System.currentTimeMillis());
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        snitchingClient.setEndTime(testIdentifier, System.currentTimeMillis());
    }

    public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
        snitchingClient.addReportingEntry(testIdentifier, entry);
    }

    private void printInfo(Set<TestIdentifier> children, TestPlan testPlan) {
        for(TestIdentifier child : children) {
            if(child.isTest()) {
                snitchingClient.registerTest(child.getUniqueId(), child.getDisplayName());
            }
        }
    }
}
