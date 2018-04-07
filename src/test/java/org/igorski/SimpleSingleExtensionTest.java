package org.igorski;

import org.igorski.extensions.CompleteExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Simple test class with a single test that uses the {@link CompleteExtension}.
 * Define @BeforeAll, @BeforeEach, @AfterEach, and @AfterAll to demonstrate all lifecycle phases of a test.
 *
 */
@ExtendWith(CompleteExtension.class)
public class SimpleSingleExtensionTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void shouldRunTheTest() {
        System.out.println("From inside the test.");
    }

    @Disabled
    public void shoulBeDisabled() {
        System.out.println("Disabled test.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll");
    }
}
