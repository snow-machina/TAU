package chapter5;
/*
VARIABLE SCOPE
Write a program that approves anyone who makes
more than $25,000 and has a credit score of 700 or better
 */

import java.util.Scanner;

public class InstantCreditCheck {

    //initialize what we know

    static int minimumSalary = 25000;
    static int minimumScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        double salary = getSalary();
        int score = getCreditScore();
        scanner.close();

        boolean qualified = isQualified(salary, score); //arguments
        notifyUser(qualified);

    }

    public static double getSalary(){
        System.out.println("Please enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Please enter your credit score:");
        int score = scanner.nextInt();
        return score;
    }

    public static boolean isQualified(double sal, int sco){ //parameters
        if (sal >= minimumSalary && sco >= minimumScore){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQua){
        if (isQua){
        System.out.println("You are approved!");
    }
    else {
            System.out.println("You do not meet the requirements");}
    }

}
