package org.igorski.exceptions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JunitFiveTest {

    @Test
    void shouldThrowException() {
        ComponentUnderTest componentUnderTest = new ComponentUnderTest();
        DummyException dummyException =
                assertThrows(DummyException.class, () -> componentUnderTest.exceptionThrowingMethod(-1));
        // Use different asserts on the exception object.
    }

    @Test
    public void testException() {
        ComponentUnderTest componentUnderTest = new ComponentUnderTest();
        assertThatThrownBy(() -> componentUnderTest.exceptionThrowingMethod(-1))
                .isInstanceOf(DummyException.class)
                .hasMessageContaining("dummy")
                .hasNoCause();
    }
}
