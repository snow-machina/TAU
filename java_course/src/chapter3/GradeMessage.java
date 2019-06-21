package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]) {

        //Get grade
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        //Decision
        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
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
                message = "Error, invalid input.";
                break;
        }

        //Output

        System.out.println(message);

    }
}
