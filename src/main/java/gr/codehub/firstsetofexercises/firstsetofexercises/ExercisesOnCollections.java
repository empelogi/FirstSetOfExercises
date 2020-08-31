package gr.codehub.firstsetofexercises.firstsetofexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


public class ExercisesOnCollections {

    //method to create a sub list containing only prime numbers
    static void ArrayListIsPrime() {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers to enter to ArrayList. Enter 0 when you want to stop");
        int numberForList = 1000000000;
        while (numberForList != 0) {
            numberForList = input.nextInt();
            if (numberForList != 0) {
                list.add(numberForList);
            }
        }
        System.out.println("The list before removing non prime numbers is: " + list);

        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (isPrime(list.get(i))) {
                primeList.add(list.get(i));
            }
        }
        System.out.println("The sublist containing only prime numbers is: " + primeList);
    }


    //method to check if a number is prime or not
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


    //method to remove duplicates from list
    static void removeDuplicates() {
        ArrayList<String> list = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter strings to create a list. Enter / to exit. ");
        String itemsForList = "";
        String exitCharacter = "/";
        while (!exitCharacter.equals(itemsForList)) {
            itemsForList = input.nextLine();
            if (!exitCharacter.equals(itemsForList)) {
                list.add(itemsForList);
            }
        }
        System.out.println("The list before removing duplicates is: " + list);

        ArrayList<String> listWithoutDuplicates = new ArrayList<>();
        for (String element : list) {
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }


        System.out.println("The list after removing duplicates is: " + listWithoutDuplicates);
    }

    //method to sort digits in descending order

    static void descendingOrder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to sort its digits in reverse order: ");
        int num = input.nextInt();

        ArrayList<Character> listOfDigits = new ArrayList<>();
        String numConverted = String.valueOf(num);
        char[] digits = numConverted.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            listOfDigits.add(digits[i]);
        }

        Collections.sort(listOfDigits, Collections.reverseOrder());

        System.out.println("The digits reversely sorted are: " + listOfDigits);
    }

    //reverse a String using a Stack
    static void reverseWithStack() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String startingWord = input.nextLine();

        Stack<Character> stack = new Stack<>();
        char[] array = startingWord.toCharArray();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            char ch = stack.pop();
            array[i] = ch;
        }

        String reverseWord = new String(array);
        System.out.println("The reversed word is: " + reverseWord);
    }


    //method for finding is a word is symmetric
    //case insensitive

    static void isSymmetric() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you want to check if it is symmetric: ");
        String word = input.nextLine();


        String allLowerCase = word.toLowerCase();
        boolean isSymmetricFlag = true;
        int i = allLowerCase.length() - 1;
        int j = 0;
        while (i > j) {
            if (allLowerCase.charAt(i) != allLowerCase.charAt(j)) {
                isSymmetricFlag = false;
            }
            i--;
            j++;
        }
        if (isSymmetricFlag) {
            System.out.println("The word " + word + " is symmetric");
        } else {
            System.out.println("The word " + word + " is not symmetric");
        }

    }

    //simulate a menu to choose method
    public void myCollectionsExercisesMenu() {

        System.out.println("Enter 1:\n if you want to calculate a sub list containing only prime numbers\n" +
                "Enter 2: \n if you want to calculate a list that eliminates duplicates \n" +
                "Enter 3: \n if you sort digits of a number in descending order \n" +
                "Enter 4: \n if you want to reverse a string using a stack \n" +
                "Enter 5: \n if you want to find if a word is symmetric (case insensitive)) \n");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            ArrayListIsPrime();
        } else if (choice == 2) {
            removeDuplicates();
        } else if (choice == 3) {
            descendingOrder();
        } else if (choice == 4) {
            reverseWithStack();
        } else if (choice == 5) {
            isSymmetric();
        } else {
            System.out.println("Invalid choice");
        }
    }
}
