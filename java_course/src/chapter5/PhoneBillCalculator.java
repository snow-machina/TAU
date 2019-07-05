package chapter5;
/*
Allow the user to input the plan fee and the number of overage minutes. And then you're going to charge 25 cents for
every minute that they've gone over, and then a 15% tax on the subtotal. I want you to create separate methods to calculate the tax, to calculate
 the overage fees, and to calculate and print the final total.
 */
import java.util.Scanner;

public class PhoneBillCalculator {

    static double extraCharge = .25;
    static double taxPercent = .15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
       double planFee = getPlanFee();
       int planOverage = getPlanOverages();
        scanner.close();

       double overageFee = calculateOverageFees(planOverage);
       double tax = getTax(planFee, overageFee, taxPercent);
       double total = getTotal(planFee, overageFee, tax);
        printBill(planFee, overageFee, tax, total);
    }

    public static double getPlanFee(){
        System.out.println("Please enter plan fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getPlanOverages(){
        System.out.println("Please enter overage minutes");
        int planOverage = scanner.nextInt();
        return planOverage;
    }

    public static double calculateOverageFees(int planOverage){
        double overageFee = planOverage * extraCharge;
        return overageFee;
    }

    public static double getTax (double planFee, double overageFee, double taxPercent){
        double tax = (planFee + overageFee) * taxPercent;
        return tax;
    }

    public static double getTotal (double planFee, double overageFee, double tax){
        double total = planFee + overageFee + tax;
        return total;
    }

    public static void printBill (double planFee, double overageFee, double tax, double total){
        System.out.println("Phone Bill Statement\n Plan: $" + planFee + "\n" + " Overage: $" + overageFee + "\n" +
                " Tax: $" + tax + "\n" +  " Total: $" + total);
    }
}
