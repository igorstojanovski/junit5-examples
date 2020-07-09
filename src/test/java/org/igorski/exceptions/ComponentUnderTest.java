package org.igorski.exceptions;

public class ComponentUnderTest {

    public void exceptionThrowingMethod(int i) throws DummyException {
        if(i < 0) {
            throw new DummyException();
        }
    }

}
