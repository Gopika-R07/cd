
package org.example;

import java.util.Scanner;

// ==================================================
// EXPERIMENT 15 - MULTIPLICATION TABLE (1 TO 10)
// ==================================================

public class Main {

    public void multiplicationTable(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Main obj = new Main();
        obj.multiplicationTable(number);
    }
}


// ==================================================
// EXPERIMENT 16 - SUM OF FIVE INTEGERS
// ==================================================

class ArraySum {

    public int calculateSum(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        ArraySum obj = new ArraySum();

        System.out.println("Sum = " + obj.calculateSum(numbers));
    }
}


// ==================================================
// EXPERIMENT 17 - LARGEST OF THREE NUMBERS
// ==================================================

class LargestOfThree {

    public int findLargest(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        LargestOfThree obj = new LargestOfThree();

        System.out.println("Largest = " + obj.findLargest(a, b, c));
    }
}


// ==================================================
// EXPERIMENT 18 - CELSIUS TO FAHRENHEIT
// ==================================================

class TemperatureConverter {

    public double convertToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        double celsius = sc.nextDouble();

        TemperatureConverter obj = new TemperatureConverter();

        System.out.println(
            "Temperature in Fahrenheit = "
            + obj.convertToFahrenheit(celsius)
        );
    }
}
