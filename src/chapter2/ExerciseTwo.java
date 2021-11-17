package chapter2;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for the season of the year

        System.out.println("Enter as season of the year");
        String season = scanner.next();

        // Enter a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();


        // Ask for adjective
        System.out.println("Enter in an adjective");
        String adjective = scanner.next();

        scanner.close();


        // Display result
        System.out.println("On a " + adjective +  " " + season + " day, I drink a minimum of " +  number +
                " cups of coffee.");

    }



}
