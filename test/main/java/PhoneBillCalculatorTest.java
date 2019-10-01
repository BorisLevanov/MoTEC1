package main.java;

import org.junit.Test;

public class PhoneBillCalculatorTest {

    @Test
    public void roundUpTest() {
        assert PhoneBillCalculator.roundUp(12.123) == 12.12;
    }

    @Test
    public void getTotalPayableTest() {
    }
    @Test
    public void getOverageChargeTest() {
    }
    @Test
    public void getDoubleTest() {
    }
}
