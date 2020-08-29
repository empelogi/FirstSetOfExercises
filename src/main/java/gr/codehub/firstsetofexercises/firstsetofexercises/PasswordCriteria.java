package gr.codehub.firstsetofexercises.firstsetofexercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCriteria {


    public void myPasswordCriteria() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password ");
        String userPassword = input.nextLine();

        while (userPassword.length() < 8) {
            System.out.println("Password must have a length of at least 8 characters");
            userPassword = input.nextLine();
        }

        isPasswordValid(userPassword);

    }

    static void isPasswordValid(String password) {

        String criteriaOne = "(?=.*[A-Z])";
        String criteriaTwo = "(?=.*[a-z])";
        String criteriaThree = "(?=.*[0-9])";
        String criteriaFour = "(?=.*[@#$%^&+])"; //there is a problem with this condition
        String criteriaSix = "(?i)(?:([a-z0-9])\\1{2,})";

        Pattern pattern1 = Pattern.compile(criteriaOne);
        Matcher matcher1 = pattern1.matcher(password);

        Pattern pattern2 = Pattern.compile(criteriaTwo);
        Matcher matcher2 = pattern2.matcher(password);

        Pattern pattern3 = Pattern.compile(criteriaThree);
        Matcher matcher3 = pattern3.matcher(password);

        Pattern pattern4 = Pattern.compile(criteriaFour);
        Matcher matcher4 = pattern4.matcher(password);

        Pattern pattern6 = Pattern.compile(criteriaSix);
        Matcher matcher6 = pattern6.matcher(password);

        if (matcher1.find() && matcher2.find() && matcher3.find() && matcher4.find() && !matcher6.find()) {
            System.out.println("Very strong password");
        } else if (matcher3.find() && !matcher6.find()) {
            System.out.println("Password ok");
        } else if (matcher4.find() && !matcher6.find()) {
            System.out.println("Password ok");
        } else {
            System.out.println("Invalid password");
        }

    }
}

