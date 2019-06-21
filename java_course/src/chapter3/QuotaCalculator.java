package chapter3;

import java.util.Scanner;

/*
IF- ELSE
    All sales people are expected to make at least 10 sales a week
    For those who do, they receive a congratulatory message
    For those who don't, they are informed of how many sales they were short
 */
public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        int quota=10;


        //Get unknown values
        System.out.println("How many sales did the employee make:");
        Scanner scanner= new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make decision
        if(sales>=quota){
            System.out.println("Congrats");
        } else {
            int salesShort= quota - sales;
            System.out.println("You are short by " + salesShort);
        }

    }

}
