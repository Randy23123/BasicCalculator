package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Float numb1 = scanner.nextFloat();

        System.out.print("Enter a number: ");
        Float numb2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Choose a Possible Calculation \n (A)dd \n (S)ubtract \n (M)ultiply \n (D)ivide");
        String name3 = scanner.nextLine();




    }
}
