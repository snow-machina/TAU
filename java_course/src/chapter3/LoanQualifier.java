package chapter3;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    Nested Ifs
    To qualify for a loan, a person must make at least $30,000
    and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String args[]) {

        //initialize what we know
        int minimumSalary = 30000;
        int minimumYear = 2;

        //get what we don't know
        System.out.println("How much do you make in a year?: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How long have you been working at your current job?: ");
        double year = scanner.nextDouble();
        scanner.close();

        //make decision
        if (salary >= minimumSalary){
            if ( year >= minimumYear) {
                System.out.println("Congrats");
            }
            else {
                System.out.println("Your years is not enough");
            }
        }
        else {
            System.out.println("Your salary is not enough");
        }
    }

}
