package com.vicesunrise.palmirov.naivedatastructure;

public class MainClass {
    public static void main(String[] args){
        UserInterface display = new UserInterface();
        UserInterface.loginDisplay();
        display.landingPage();
        while(!display.exit()){
            int option = display.inputPortA();
            int length = 1;
            Stack stack = new Stack(length);
            LinkedList list = new LinkedList();
            boolean lock = true;
            switch(option){
                case 1:
                    while(lock){
                        lock = display.inputOutputPortStack(stack);
                    }
                    break;
                case 2:
                    while(lock){
                        lock = display.inputOutputPortLinkedList(list);
                    }
            }
        }
        display.landingPage();
    }
}
