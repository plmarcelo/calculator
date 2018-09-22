package com.privalia.business;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {

    private ICalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @Parameters({"0, 0, 0", "1, 1, 2"})
    public void shouldReturnACorrectSum(int first, int second, int expectedResult) {
        int actualResult = calculator.sum(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Parameters({"4, 2, 2", "4, 1, 3"})
    public void shouldReturnACorrectSubstract(int first, int second, int expectedResult) {
        int actualResult = calculator.substract(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Parameters({"4, 6, 24", "3, 5, 15"})
    public void shouldReturnACorrectMultiply(int first, int second, int expectedResult) {
        int actualResult = calculator.multiply(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Parameters({"6, 2, 3", "10, 5, 2"})
    public void shouldReturnACorrectDivide(int first, int second, int expectedResult) {
        int actualResult = calculator.divide(first, second);
        assertEquals(expectedResult, actualResult);
    }
}