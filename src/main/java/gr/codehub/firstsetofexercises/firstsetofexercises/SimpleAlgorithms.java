package gr.codehub.firstsetofexercises.firstsetofexercises;

import java.util.Random;
import java.util.Scanner;

public class SimpleAlgorithms {


    //simple method to compute a number's factorial
    static int factorial(int input) {
        int fact = 1;
        int i = 1;
        if (input == 0) {
            return 1;
        }
        for (i = 1; i <= input; i++) {
            fact *= i;
        }
        return fact;
    }

    //simple method to calculate if a number is a prime number
    static boolean isPrime(int input) {

        if (input == 1) {
            return false;
        }

        for (int i = 2; i < input; i++) {
            if ((input % i) == 0) {
                return false;
            }
        }
        return true;
    }

    //simple method to calculate 1+1/2+..+1/n
    static void iterativeDivision(int input) {
        if (input == 0) {
            System.out.println("There can be no division with the number zero.");
        }

        double result = 0;
        for (double i = 1; i <= input; i++) {
            result += (1 / i);
        }
        System.out.println("The result is: " + result);
    }

    //simple method to count the digits of a long number
    static void numberOfDigits() {
        long generatedLong = new Random().nextLong();
        long temp = generatedLong;
        int count = 0;
        while (generatedLong != 0) {
            generatedLong /= 10;
            count++;
        }
        System.out.println("The number of digits in: " + temp + " is " + count);
    }

    //simple method that prints the decimal part of a float number

    static void printFloatDecimals(float floatNumber) {
        String numberToString = String.valueOf(floatNumber);
        String[] splitDigits = numberToString.split("\\.");
        String decimal = "0." + splitDigits[1];
        System.out.println(decimal);
    }

    //method to simulate a menu for the user to choose calculations
    public static void myMenu() {

        System.out.println("Enter 1:\n if you want to calculate a numbers factorial\n" +
                "Enter 2: \n if you want know if the number is prime or not \n" +
                "Enter 3: \n if you want to calculate the sum of 1+1/2+..+1/n \n" +
                "Enter 4: \n if you want to count the digits in a long number \n" +
                "Enter 5: \n if you want to calculate the decimal part of a float \n");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1 || choice == 2 || choice == 3) {
            System.out.println("Enter an integer for your calculations.");
            Scanner in = new Scanner(System.in);
            int integerNumber = in.nextInt();
            if (choice == 1) {
                System.out.println("The factorial of " + integerNumber + " is " + factorial(integerNumber));
            } else if (choice == 2) {
                if (isPrime(integerNumber)) {
                    System.out.println("The number: " + integerNumber + " is a prime number");
                } else {
                    System.out.println("The number: " + integerNumber + " is not a prime number");
                }
            } else {
                iterativeDivision(integerNumber);
            }

        } else if (choice == 4) {
            numberOfDigits();
        } else if (choice == 5) {
            Scanner longInput = new Scanner(System.in);
            System.out.println("Enter your float must be comma (,) separated number");
            float number = longInput.nextFloat();
            printFloatDecimals(number);
        } else {
            System.out.println("Invalid option");
        }

    }

}
