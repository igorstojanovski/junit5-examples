package org.igorski.listeners;

import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestIdentifier;

import java.util.Optional;

public interface LoggingClient {
    void registerTest(String uniqueId, String displayName);

    void setSessionEndTime(long endTime);

    void registerDynamicTest(Optional<String> parentId, String displayName);

    void markSkipped(String uniqueId, String reason);

    void setStartTime(TestIdentifier testIdentifier, long l);

    void setEndTime(TestIdentifier testIdentifier, long l);

    void addReportingEntry(TestIdentifier testIdentifier, ReportEntry entry);
}
