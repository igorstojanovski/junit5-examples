package org.igorski;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class DummyTestTwo {
    private static final Random random = new Random();

    @Test
    public void dummyTestMethodOne() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
    }

    @Test
    public void dummyTestMethodTwo() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
    }
}
