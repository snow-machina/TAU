package chapter3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercisesOneDollar {

    public static void main(String args[]) {

        //Asks the user to enter the quantities for the following coins
        double pennie = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;

        System.out.println("How many pennies?: ");
        Scanner scanner = new Scanner(System.in);
        int pennieCount = scanner.nextInt();
        System.out.println("How many nickels?: ");
        int nickelCount = scanner.nextInt();
        System.out.println("How many dimes?: ");
        int dimeCount = scanner.nextInt();
        System.out.println("How many quarters?: ");
        int quarterCount = scanner.nextInt();
        scanner.close();

        //Count up the value of all of the change that they answered
        double totalMoney = pennie*pennieCount + nickel*nickelCount + dime*dimeCount + quarter*quarterCount;

        //Decision
        if (totalMoney == 1) {
            System.out.println("You win!");
        }
        else if (totalMoney < 1){
            double shortMoney = 1-totalMoney;
            System.out.println("Your money is under $" + shortMoney);
        }
        else if (totalMoney > 1){
            double excessMoney = totalMoney - 1;
            System.out.println("Your money is over $" + excessMoney);
        }
        else {
            System.out.println("invalid input.");
        }



        //Message
    }
}
