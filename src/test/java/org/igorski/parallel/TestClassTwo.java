package org.igorski.parallel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Class Two")
public class TestClassTwo {

    @Test
    @DisplayName("Test One")
    void testOne() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Test class two, test one: " + System.currentTimeMillis());
    }

    @Test
    @DisplayName("Test Two")
    void testTwo() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Test class two, test two: " + System.currentTimeMillis());
    }
}
