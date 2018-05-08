package org.igorski;

import org.junit.jupiter.engine.discovery.DiscoverySelectorResolver;
import org.junit.platform.engine.EngineDiscoveryRequest;
import org.junit.platform.engine.ExecutionRequest;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestEngine;
import org.junit.platform.engine.UniqueId;

import java.util.Set;

public class MyCustomEngine implements TestEngine {
    @Override
    public String getId() {
        return "my-custom-engine";
    }

    @Override
    public TestDescriptor discover(EngineDiscoveryRequest engineDiscoveryRequest, UniqueId uniqueId) {

        MyEngineDescriptor engineDescriptor = new MyEngineDescriptor(uniqueId, "my-custom-engine");
        new DiscoverySelectorResolver().resolveSelectors(engineDiscoveryRequest, engineDescriptor);
        return engineDescriptor;

    }

    @Override
    public void execute(ExecutionRequest executionRequest) {
        TestDescriptor descriptor = executionRequest.getRootTestDescriptor();
        Set<? extends TestDescriptor> children = descriptor.getChildren();

        System.out.println(children);
    }
}
