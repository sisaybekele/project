package com.project.java;
import com.project.java.base.*;
import com.sun.glass.ui.Size;

import java.util.List;
import java.util.Scanner;
public class Main {
    private static float gadgetLarge_Price;
    private static float gadgetMedium_Price;
    private static float gadgetSmall_Price;

    public static void main(String[] args) {



        //orderingApp();


    }//end of main method




    private static void orderingApp() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        System.out.println("Welcome to WAG CORPORATION " + "! We have the following device:");


        System.out.println("GadgetLarge  $79.99");
        System.out.println("GadgetMedium  $59.99");
        System.out.println("GadgetSmall  $39.99");
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("How many GadgetLarge do you want?");
     int number = scanner.nextInt();
     System.out.println("Number "+number);

        Scanner scanner2 = new Scanner(System.in);
       System.out.println("How many GadgetMedium do you want?");
        int number2 = scanner.nextInt();
        System.out.println("Number "+number2);
        Scanner scanner3=new Scanner(System.in);
        System.out.println("How many GadgetSmall do you want?");
        int number3 = scanner.nextInt();
        System.out.println("Number "+number3);

        float numberGadgetLarge = scanner.nextFloat();
        float numberGadgetMedium = scanner.nextFloat();
        float numberGadgetSmall = scanner.nextFloat();


//new code below

float gadgetLargeTotal  = gadgetLarge_Price * numberGadgetLarge;
     float gadgetMediumTotal = gadgetMedium_Price * numberGadgetMedium;
  float gadgetSmallTotal = gadgetSmall_Price * numberGadgetSmall;
   float finalTotal = gadgetLargeTotal  + gadgetMediumTotal  + gadgetSmallTotal;
        System.out.println("Your total is: " + finalTotal);
        System.out.println("*****Thank you for shopping at WAG CORPORATION******");







    }
}
