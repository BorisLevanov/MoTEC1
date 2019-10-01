package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBillCalculator {
    static void getBasePlanCost() {
        Scanner scanner = new Scanner(System.in);

        double planCost = getDouble(scanner, "Enter the base cost of the plan: ");
        double overageMinutes = getDouble(scanner, "Enter overage minutes: ");

        double chargePerMinute = 0.25;
        double tax = 0.15;

        double overageCharge = getOverageCharge(overageMinutes, chargePerMinute);

        double totalPayable = getTotalPayable(planCost, overageCharge);
        double totalPayableAndTax = getOverageCharge(totalPayable, tax);
        double grandTotal = roundUp(totalPayable + totalPayableAndTax);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planCost);
        System.out.println("Overage: $" + overageCharge);
        System.out.println("Tax: $" + roundUp(totalPayableAndTax));


        System.out.println("Total: $" + grandTotal);

    }

     static double roundUp(double totalPayableAndTax) {
        return Math.ceil(totalPayableAndTax * 100) / 100;
    }

     static double getTotalPayable(double planCost, double overageCharge) {
        return planCost + overageCharge;
    }

     static double getOverageCharge(double overageMinutes, double chargePerMinute) {
        return overageMinutes * chargePerMinute;
    }

     static double getDouble(Scanner scanner, String inputText) {
        System.out.println(inputText);
        double number;
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error! Please enter a valid number as the second argument!");
            throw new InputMismatchException();
        }
        return number;
    }
}
