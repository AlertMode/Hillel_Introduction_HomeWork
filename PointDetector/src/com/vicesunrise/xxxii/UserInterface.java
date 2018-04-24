package com.vicesunrise.xxxii;

import java.util.Date;
import java.util.Scanner;

public class UserInterface {
    private static byte option;
    private static byte operationCounter;

    public static void loginDisplay() {
        Date today = new Date();
        String userName = System.getProperty("user.name");
        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println("\n");
    }

    public void landingPage() {
        boolean run = true;
        Scanner reader = new Scanner(System.in);
        while(run) {
            System.out.println("Point Detector");
            System.out.println("====================================================");
            System.out.println("[1] Start");
            System.out.println("[0] Exit");
            System.out.print("Choose the option: ");
            option = checkForByte();
            System.out.println();
            switch(option) {
                case 0:
                    System.out.println("====================================================");
                    System.out.println("Cancelling the program...");;
                    return;
                case 1:
                    return;
                default:
                    System.out.println("ATTENTION!");
                    System.out.println("Out of the given options!");
                    System.out.println("Please, choose among the given options!");
                    System.out.println();
                    run = true;
            }
        }
    }

    public int inputPortCircleRadius(){
        boolean run = true;
        int radius = 0;
        while(run){
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the radius of the circle, please.");
            System.out.println("The radius' value must be no less than 3!");
            System.out.println("----------------------------------------------------");
            System.out.print("Radius: ");
            radius = checkForInt();
            System.out.println();
            if(radius >= 3){
                break;
            } else {
                System.out.println("Reprint-in the radius' value, please.");
            }
        }
        return radius;
    }

    public int[] inputPortCircleAxis() {
        boolean run = true;
        int[] coordinates = new int[2];
        System.out.println("----------------------------------------------------");
        System.out.println("Print-in the coordinates of the circle, please.");
        System.out.println("----------------------------------------------------");
        System.out.print("Abscissa: ");
        coordinates[0] = checkForInt();
        System.out.print("Ordinate: ");
        coordinates[1] = checkForInt();
        System.out.println();
        return coordinates;
    }

    public int[] inputPortPoint() {
        boolean run = true;
        int[] coordinates = new int[2];
        System.out.println("----------------------------------------------------");
        System.out.println("Print-in the coordinates of the point, please.");
        System.out.println("----------------------------------------------------");
        System.out.print("Abscissa: ");
        coordinates[0] = checkForInt();
        System.out.print("Ordinate: ");
        coordinates[1] = checkForInt();
        System.out.println();
        return coordinates;
    }


    public void outputPort(int result) {
        ++operationCounter;
        System.out.println("====================================================");
        switch(result){
            case 1:
                System.out.println("The point exists beyond the circle.");
                break;
            case 0:
                System.out.println("The point exists on the border of the circle.");
                break;
            case -1:
                System.out.println("The point exists inside the circle.");
                break;
        }
        System.out.println("====================================================");
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
    }

    public boolean exit(){
        boolean result = false;
        if(option == 0) {
            result = true;
        }
        return result;
    }

    public static byte checkForByte (){
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        byte number = 0;
        while (run) {
            if (scanner.hasNextByte()) {
                number = scanner.nextByte();
                break;
            }
            System.out.println("\nWrong input!");
            System.out.println("Reprint-in an integer number!");
            scanner.nextLine();
            System.out.print("\nData entry-field: ");
        }
        return number;
    }

    public static int checkForInt(){
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (run) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            System.out.println("\nWrong input!");
            System.out.println("Reprint-in an integer number!");
            scanner.nextLine();
            System.out.print("\nData entry-field: ");
        }
        return number;
    }

    public static boolean repeatTheOperation() {
        boolean run = true;
        boolean result = true;
        while (run) {
            byte option = 0;
            System.out.println("Do you want to repeat the operation?");
            System.out.println("0. No; 1. Yes;");
            System.out.print("Print-in the option: ");
            option = checkForByte();
            System.out.println();
            switch(option){
                case 0:
                    result = false;
                    run = false;
                    break;
                case 1:
                    run = false;
                    break;
                default:
                    System.out.println("Wrong data input!");
                    System.out.println("Repeat the operation!\n");
                    run = true;
            }
        }
        return result;
    }
}