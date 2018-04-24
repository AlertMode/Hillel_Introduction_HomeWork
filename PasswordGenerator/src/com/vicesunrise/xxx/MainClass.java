package com.vicesunrise.xxx;

public class MainClass {
    public static void main(String[] args){
        UserInterface display = new UserInterface();
        LogicalUnit generatorUnit = new LogicalUnit();
        UserInterface.loginDisplay();
        display.landingPage();
        while(!display.exit()){
            byte length = display.inputPort();
            generatorUnit.setLength(length);
            do {
                char[] password = generatorUnit.passwordGenerator();
                display.outputPort(password);
            }while(UserInterface.repeatTheOperation());
            display.landingPage();
        }
    }
}