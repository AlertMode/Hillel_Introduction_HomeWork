package com.vicesunrise.xxxii;

public class Circle {
    private int radius;
    private int[] axis;

    public Circle(int radius, int[] axis){
        this.radius = Math.abs(radius);
        this.axis = axis.clone();
    }

    public int dotInCircle(Point object){
        int result = (int)(Math.pow(object.getAbscissa() - axis[0], 2) + Math.pow(object.getOrdinate() - axis[1], 2));
        if(result > radius * radius){
            return -1;
        } else if(result == radius * radius){
            return 0;
        } else {
            return 1;
        }
    }
}