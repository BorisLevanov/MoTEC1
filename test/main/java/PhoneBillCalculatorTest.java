package main.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PhoneBillCalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 12.123123, 12.13 },
                { 1, 1 },
                { 0, 0 },
                { 12123123.00000, 12123123 },
                { 12123123.00001, 12123123.01 },
                { -3123.2312, -3123.23 },
                {'2', 2}
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public /* NOT private */ double fInput;

    @Parameterized.Parameter(1)
    public /* NOT private */ double fExpected;

    @Test
    public void roundUpTestPositiveInteger() {
        assertEquals(fExpected, PhoneBillCalculator.roundUp(fInput), 0);
    }

    @Test
    public void roundUpTestNegativeInteger() {
        double actualRoundUp = PhoneBillCalculator.roundUp(12.123);
        double expectedRoundUp = 12.13;
        assertEquals(expectedRoundUp, actualRoundUp, 0);
    }

    @Test
    public void getTotalPayableTest() {
        double expectedTotal = 100;
        double actualTotal = PhoneBillCalculator.getTotalPayable(50, 50);
        assertEquals(actualTotal, expectedTotal, 0);
    }

    @Test
    public void getOverageChargeTest() {
    }
    @Test
    public void getDoubleTest() {
    }
}
