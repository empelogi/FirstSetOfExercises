package gr.codehub.firstsetofexercises;

import gr.codehub.firstsetofexercises.firstsetofexercises.ExercisesOnCollections;
import gr.codehub.firstsetofexercises.firstsetofexercises.PasswordCriteria;
import gr.codehub.firstsetofexercises.firstsetofexercises.SimpleAlgorithms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        myMainMenu();
    }

    static void myMainMenu(){

        Scanner input = new Scanner(System.in);
        System.out.println("This is the main menu\n"+
                "Enter 1: To do Simple Algorithms calculations\n"+
                "Enter 2: To do Collections and Arrays calculations\n"+
                "Enter 3: To do password validation\n");
        int numberOfChoice = input.nextInt();

        if(numberOfChoice == 1){

            SimpleAlgorithms simpleAlgorithms = new SimpleAlgorithms();

            //Calls the menu to select which algorithm you want select
            //to perform calculations on simple algorithms
            simpleAlgorithms.myMenu();

        }else if(numberOfChoice == 2){

            ExercisesOnCollections exercisesOnCollections = new ExercisesOnCollections();

            //Calls the menu to select which algorithm you want select
            //between exercises on arrays and collections
            exercisesOnCollections.myCollectionsExercisesMenu();


        }else if(numberOfChoice == 3){

            PasswordCriteria passwordCriteria = new PasswordCriteria();
            //Calls the algorithm about validating a password
            //according to certain criteria

            passwordCriteria.myPasswordCriteria();

        }else{
            System.out.println("Invalid choice!");
        }

    }
}
