package org.igorski;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class DummyTestOne {
    private static final Random random = new Random();

    @Test
    public void dummyTestMethodOne() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
    }

    @Test
    @Disabled
    public void dummyTestMethodTwo() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
    }
}
