
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // EXPERIMENT 15 - MULTIPLICATION TABLE

    @Test
    void testMultiplicationTableCalculation() {
        int number = 5;
        int result = number * 10;

        assertEquals(50, result);
    }

    @Test
    void testMultiplicationFirstValue() {
        int number = 7;

        assertEquals(7, number * 1);
    }


    // EXPERIMENT 16 - SUM OF FIVE INTEGERS

    @Test
    void testArraySum() {
        ArraySum obj = new ArraySum();

        int[] numbers = {10, 20, 30, 40, 50};

        assertEquals(150, obj.calculateSum(numbers));
    }

    @Test
    void testArraySumWithNegativeNumbers() {
        ArraySum obj = new ArraySum();

        int[] numbers = {-1, 2, 3, 4, 5};

        assertEquals(13, obj.calculateSum(numbers));
    }


    // EXPERIMENT 17 - LARGEST OF THREE NUMBERS

    @Test
    void testLargestFirstNumber() {
        LargestOfThree obj = new LargestOfThree();

        assertEquals(50, obj.findLargest(50, 20, 30));
    }

    @Test
    void testLargestSecondNumber() {
        LargestOfThree obj = new LargestOfThree();

        assertEquals(80, obj.findLargest(10, 80, 30));
    }

    @Test
    void testLargestThirdNumber() {
        LargestOfThree obj = new LargestOfThree();

        assertEquals(90, obj.findLargest(10, 20, 90));
    }


    // EXPERIMENT 18 - CELSIUS TO FAHRENHEIT

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter obj = new TemperatureConverter();

        assertEquals(32.0, obj.convertToFahrenheit(0), 0.001);
    }

    @Test
    void testBoilingPointConversion() {
        TemperatureConverter obj = new TemperatureConverter();

        assertEquals(212.0, obj.convertToFahrenheit(100), 0.001);
    }

    @Test
    void testNegativeTemperatureConversion() {
        TemperatureConverter obj = new TemperatureConverter();

        assertEquals(14.0, obj.convertToFahrenheit(-10), 0.001);
    }
}
