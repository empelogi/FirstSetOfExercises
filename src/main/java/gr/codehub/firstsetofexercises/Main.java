package gr.codehub.firstsetofexercises;

import gr.codehub.firstsetofexercises.firstsetofexercises.ExercisesOnCollections;
import gr.codehub.firstsetofexercises.firstsetofexercises.PasswordCriteria;
import gr.codehub.firstsetofexercises.firstsetofexercises.SimpleAlgorithms;

public class Main {

    public static void main(String[] args) {

        SimpleAlgorithms simpleAlgorithms = new SimpleAlgorithms();

        //Calls the menu to select which algorithm you want select
        //between exercises on simple algorithms (factorial, prime numbers etc)
        SimpleAlgorithms.myMenu();

        ExercisesOnCollections exercisesOnCollections = new ExercisesOnCollections();

        //Calls the menu to select which algorithm you want select
        //between exercises on arrays and collections
        exercisesOnCollections.myCollectionsExercisesMenu();

        PasswordCriteria passwordCriteria = new PasswordCriteria();
        //Calls the algorithm about validating a password
        //according to certain criteria

        passwordCriteria.myPasswordCriteria();


    }
}
