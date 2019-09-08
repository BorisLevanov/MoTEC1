package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringConcatenatorTest {
    @Test
    public void assembleStringReturnsValue() {
        String actualReturnValue = StringConcatenator.assembleString("Summer", "warm", 5 );
        assertNotNull(actualReturnValue);
    }

    @Test
    public void assembleStringReturnsCorrectValue() {
        String expectedReturnValue = "On a Summer warm day, I drink a minimum of 5 cups of coffee.";
        String actualReturnValue = StringConcatenator.assembleString("Summer", "warm", 5 );
        assertEquals(expectedReturnValue, actualReturnValue);
    }
}