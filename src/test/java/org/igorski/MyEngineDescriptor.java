package org.igorski;

import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestEngine;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.descriptor.EngineDescriptor;

public class MyEngineDescriptor extends EngineDescriptor {
    /**
     * Create a new {@code EngineDescriptor} with the supplied {@link UniqueId}
     * and display name.
     *
     * @param uniqueId    the {@code UniqueId} for the described {@code TestEngine};
     *                    never {@code null}
     * @param displayName the display name for the described {@code TestEngine};
     *                    never {@code null} or blank
     * @see TestEngine#getId()
     * @see TestDescriptor#getDisplayName()
     */
    public MyEngineDescriptor(UniqueId uniqueId, String displayName) {
        super(uniqueId, displayName);
    }
}
