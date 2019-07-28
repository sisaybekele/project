package com.project.java.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        //Run Simulation

         orderingApp();
       //simulation();

    }
    //Simulation for testing



    private static void orderingApp() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        OrderTaker taker = new OrderTaker();
        taker.beginOrder();
        //System.out.println("Welcome to WAG CORPORATION ");
    }








    private static void simulation(){
        List<GadgetInterface> gadgetList=gadgetList=new ArrayList<>();
        gadgetList.add(new GadgetLarge());
        gadgetList.add(new GadgetLarge());
        gadgetList.add(new GadgetMedium(SurfaceColor.PLATED));
        gadgetList.add(new GadgetSmall(SurfaceColor.PAINTED));

        //TODO: send it to a receipt class.
        Receipt rec = new Receipt(gadgetList);
        rec.printReceipt();

    }

}





