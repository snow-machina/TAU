package chapter2;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercisesMadLib {

    public static void main(String args[]){

        //Get season of the year
        System.out.print("What is your favorite season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Get whole number
        System.out.print("What is your favorite number:");
        int number = scanner.nextInt();
        scanner.close();

        //Get adjective
        System.out.print("Enter an adjective:");
        String adjective = scanner.next();

        //Display result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee." );
    }
}
