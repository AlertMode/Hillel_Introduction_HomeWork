package com.vicesunrise.palmirov.naivedatastructure;
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
            System.out.println("Naive Data Structure: Stack & LinkedList");
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

    public byte inputPortA(){
        boolean run = true;
        while(run){
            System.out.println("----------------------------------------------------");
            System.out.println("Choose the Data Structure Unit");
            System.out.println("[1] Stack");
            System.out.println("[2] LinkedList");
            System.out.println("[0] Exit");
            System.out.println("----------------------------------------------------");
            System.out.print("Option: ");
            option = checkForByte();
            System.out.println();
            if(option >= 0 && option <= 2){
                run = false;
            }
        }
        return option;
    }

    public int inputPortB() {
        boolean run = true;
        int quantity = 0;
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the quantity of slots, please.");
            System.out.println("----------------------------------------------------");
            System.out.print("Quantity: ");
            quantity = checkForInt();
            System.out.println();
            if(quantity >= 1){
                run = false;
            } else {
                System.out.println("Print-in a positive value!\n");
            }
        }
        return quantity;
    }

    public boolean inputOutputPortStack(Stack stack){
        int option;
        int number;
        System.out.println("----------------------------------------------------");
        System.out.println("Choose the Stack operation");
        System.out.println("[1] Add element to the Stack");
        System.out.println("[2] Delete element from the Stack");
        System.out.println("[3] Show the element by its index");
        System.out.println("[4] Show the last element in the Stack");
        System.out.println("[0] Exit");
        System.out.println("----------------------------------------------------");
        System.out.print("Operation: ");
        option = checkForInt();
        System.out.println();
        switch(option){
            case 1:
                System.out.print("Print-in the number: ");
                number = checkForInt();
                stack.add(number);
                System.out.println("The element has been added!");
                return true;
            case 2:
                if(stack.delete()){
                    System.out.println("The last Stack's element has been deleted!\n");
                } else {
                    System.out.println("There is nothing to delete!");
                }
                return true;
            case 3:
                System.out.print("Print-in the number of index: ");
                number = checkForInt();
                System.out.println();
                if(stack.indexOf(number) == -1){
                    System.out.println("There is no such a number!");
                } else {
                    System.out.println("The element's value: " + stack.indexOf(number) + "\n");
                }
                return true;
            case 4:
                System.out.println("The last element's value: " + stack.read() + "\n");
                return true;
            case 0:
                System.out.println("Exiting the menu...");
                return false;
            default:
                System.out.println("ATTENTION!");
                System.out.println("Out of the given options!");
                System.out.println("Please, choose among the given options!");
                System.out.println();
                return true;
        }
    }

    public boolean inputOutputPortLinkedList(LinkedList list){
        int option;
        int number;
        System.out.println("----------------------------------------------------");
        System.out.println("Choose the LinkedList operation");
        System.out.println("[1] Add element to the beginning of the list");
        System.out.println("[2] Add element of the end of the list");
        System.out.println("[3] Delete the element by the value");
        System.out.println("[4] Show the List");
        System.out.println("[5] Get value by the index");
        System.out.println("[0] Exit");
        System.out.println("----------------------------------------------------");
        System.out.print("Operation: ");
        option = checkForInt();
        System.out.println();
        switch(option){
            case 1:
                System.out.print("Print-in the number: ");
                number = checkForInt();
                list.addInFront(number);
                System.out.println();
                System.out.println("The element has been added!");
                return true;
            case 2:
                System.out.print("Print-in the number: ");
                number = checkForInt();
                list.addToEnd(number);
                System.out.println();
                System.out.println("The element has been added!");
                return true;
            case 3:
                System.out.print("Print-in the value to delete in the list: ");
                number = checkForInt();
                System.out.println();
                if(list.deleteElement(number)){
                    System.out.println("The element with the given value has been deleted!");
                } else {
                    System.out.println("There is no such an element in the list");
                }
                return true;
            case 4:
                System.out.println(list.getInfo());
                return true;
            case 5:
                boolean lock = true;
                number = 0;
                while(lock){
                    System.out.print("Print-in the index of the value: ");
                    number = checkForInt();
                    if(number < 0) {
                        System.out.println("\nWrong input: negative value.\n");
                        lock = true;
                    } else {
                        lock = false;
                    }
                }
                System.out.println();
                int index = list.getValue(number);
                if(index == -1){
                    System.out.println("Such index doesn't exist!\n");
                } else {
                    System.out.println("Element's value: " + number + " Index: " + index + "\n");
                }
                return true;
            case 0:
                System.out.println("Exiting the menu...\n");
                return false;
            default:
                System.out.println("ATTENTION!");
                System.out.println("Out of the given options!");
                System.out.println("Please, choose among the given options!");
                System.out.println();
                return true;
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