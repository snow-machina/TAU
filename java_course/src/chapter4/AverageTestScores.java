package chapter4;

import java.util.Scanner;

/*
Nested Loops
Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String args[]){

        //given
        int numberOfStudents = 3;
        int numberOfTests = 4;

        //Process all students

        for (int i=0; i<numberOfStudents; i++){

                double total= 0;
            for( int j=0; j<numberOfTests; j++){
                System.out.println("Enter score for Test #" + (j+1) + " :");
                Scanner scanner = new Scanner(System.in);
                double score = scanner.nextDouble();

                total = total +score;
            }

             double average = total/numberOfTests;
            System.out.println("The average score for Student #" + (i+1) + " is " + average);
        }

    }
}
