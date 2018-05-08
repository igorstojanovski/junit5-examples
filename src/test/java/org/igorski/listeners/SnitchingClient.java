package org.igorski.listeners;

import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestIdentifier;

import java.util.Optional;

public class SnitchingClient implements LoggingClient {
    private long endTime;

    @Override
    public void registerTest(String uniqueId, String displayName) {

    }

    @Override
    public void setSessionEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public void registerDynamicTest(Optional<String> parentId, String displayName) {

    }

    @Override
    public void markSkipped(String uniqueId, String reason) {

    }

    @Override
    public void setStartTime(TestIdentifier testIdentifier, long l) {

    }

    @Override
    public void setEndTime(TestIdentifier testIdentifier, long l) {

    }

    @Override
    public void addReportingEntry(TestIdentifier testIdentifier, ReportEntry entry) {

    }
}
