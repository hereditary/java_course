package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        // Switch statement and variable grade
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "b":
                message = "Great job!";
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder!";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid Grade";
                break;
        }

        System.out.println(message);

    }
}
