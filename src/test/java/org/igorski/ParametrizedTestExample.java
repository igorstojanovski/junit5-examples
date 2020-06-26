package org.igorski;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Example of JUnit 4 parameterised tests.
 */
@RunWith(Parameterized.class)
public class ParametrizedTestExample {

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "first", 1, 2, 3 }, { "second", 5, 6, 11 }, { "third", 10, 12, 22 }
        });
    }

    private String description;
    private int first;
    private int second;
    private int total;

    public ParametrizedTestExample(String description, int first, int second, int total) {
        this.description = description;
        this.first = first;
        this.second = second;
        this.total = total;
    }

    @Test
    public void shouldHaveCorrectTotal() {
        assertThat(first + second).isEqualTo(total);
    }
}