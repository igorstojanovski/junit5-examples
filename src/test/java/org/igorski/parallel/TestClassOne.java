package org.igorski.parallel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Class One")
public class TestClassOne {

    @Test
    @DisplayName("Test One")
    void testOne() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Test class one, test one: " + System.currentTimeMillis());
    }

    @Test
    @DisplayName("Test Two")
    void testTwo() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Test class one, test two: " + System.currentTimeMillis());
    }
}
