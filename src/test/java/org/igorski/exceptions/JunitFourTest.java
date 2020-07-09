package org.igorski.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JunitFourTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldUseRuleToTestForException() throws DummyException {
        expectedException.expect(DummyException.class);
        ComponentUnderTest component = new ComponentUnderTest();
        component.exceptionThrowingMethod(-1);
    }

    @Test(expected = DummyException.class)
    public void shouldTestForException() throws DummyException {
        ComponentUnderTest component = new ComponentUnderTest();
        component.exceptionThrowingMethod(-1);
    }

}
