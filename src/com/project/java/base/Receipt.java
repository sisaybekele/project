package com.project.java.base;

import com.project.java.singleton.SerialNumber;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Receipt {
    private List<GadgetInterface>gadgetList;
    private List<WidgetInterface>largeWidgetList;
    private List<WidgetInterface>mediumWidgetList;
    private List<WidgetInterface>smallWidgetList;
    private float priceTotal;

    Receipt(List<GadgetInterface>gadgetList){
        this.gadgetList = new ArrayList<>();
        this.gadgetList = gadgetList;
        getWidgetList();
    }

    private static void orderingApp() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        System.out.println("Welcome to WAG CORPORATION ");
    }





    void printReceipt(){
        System.out.println();
        System.out.println();
        System.out.println("===========================================");
        System.out.println("Wag Corporation");
        System.out.println();
        System.out.println("9525 NW 87th St \nGladstone, Missouri 64157");
        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println();
        System.out.println("Gadget");
        printGadgets();
        System.out.println();
        printWidgets();
        System.out.println();
       printAccessories();
       System.out.println("*********************************************************************");
       System.out.println(String.format("%-20s $%s","Total",priceTotal));
        System.out.println();
       System.out.println("/////////Thank you for shopping at WAG CORPORATION/////////////");
        System.out.println();
       System.out.println("Please visit our website for customer satisfaction survey at www.wagcorporation.com");

    }
    private void getWidgetList(){
        List<WidgetInterface>widgetList = new ArrayList<>();
        largeWidgetList  = new ArrayList<>();
        mediumWidgetList = new ArrayList<>();
        smallWidgetList = new ArrayList<>();

        for(GadgetInterface GadgetList: gadgetList){
            widgetList.addAll(GadgetList.getWidgets(GadgetList.getColor()));
        }
        for (int i = 0; i< widgetList.size();i++){

            if(widgetList.get(i).getClass().getSimpleName().equals("WidgetLarge")){
                largeWidgetList.add(widgetList.get(i));
            }
            if(widgetList.get(i).getClass().getSimpleName().equals("WidgetMedium")){
                mediumWidgetList.add(widgetList.get(i));
            }
            if(widgetList.get(i).getClass().getSimpleName().equals("WidgetSmall")){
                smallWidgetList.add(widgetList.get(i));
            }

        }


    }
    private void printGadgets(){
        for(GadgetInterface GadgetList: gadgetList){
            String type = GadgetList.getClass().getSimpleName();
            String color = GadgetList.getColor().toString();
            float price = GadgetList.getPrice();
            String serial = GadgetList.getSerialNumber();
            priceTotal += price;
            System.out.println(String.format("%s #%s %-20s $%s",color, serial, type,price));
        }
    }
    private void printWidgets(){
        System.out.println("Widgets");
        System.out.println("("+largeWidgetList.size()+")Large Widget");
        System.out.println("("+mediumWidgetList.size()+")Medium Widget");
        System.out.println("("+smallWidgetList.size()+")Small Widget");
    }
    private void printAccessories(){
        System.out.println("Accessories");
        if(getLights()> 0){
            System.out.println("("+ getLights() +")Lights");
        }
        System.out.println("("+ getSwitches() +")Switches");
        System.out.println("("+ getButtons() +")Buttons");
        for(GadgetInterface GadgetList: gadgetList){
            String Powersource = GadgetList.getPowerSource();
            System.out.println(Powersource);
        }
    }
    private  int getLights(){
        int totalLights = 0;
        for(GadgetInterface GadgetList : gadgetList){
            totalLights += GadgetList.getLights();
        }
        return  totalLights;
    }
    private  int getButtons(){
        int totalButtons = 0;
        for (GadgetInterface GadgetList : gadgetList){
            totalButtons += GadgetList. getButtons();
        }
        return totalButtons;
    }
    private  int getSwitches(){
        int totalSwitches = 0;
        for (GadgetInterface GadgetList : gadgetList){
            totalSwitches += GadgetList. getSwitches();
        }
        return  totalSwitches;
    }
}
