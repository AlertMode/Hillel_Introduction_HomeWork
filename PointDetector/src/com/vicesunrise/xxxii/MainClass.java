package com.vicesunrise.xxxii;

public class MainClass {
    public static void main(String[] args){
        UserInterface display = new UserInterface();
        UserInterface.loginDisplay();
        display.landingPage();
        while(!display.exit()){
            int radius = display.inputPortCircleRadius();
            int[]axis = display.inputPortCircleAxis();
            int[] coordinates = display.inputPortPoint();
            Circle circle = new Circle(radius, axis);
            Point point = new Point (coordinates[0], coordinates[1]);
            int result = circle.dotInCircle(point);
            display.outputPort(result);
            display.landingPage();
        }
    }
}