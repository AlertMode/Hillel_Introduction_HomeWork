package com.vicesunrise.palmirov.naivedatastructure;


public class LinkedListElement {
    private int value;
    private LinkedListElement port;

    public void setValue(int value){
        this.value = value;
    }

    public void setPort(LinkedListElement port){
        this.port = port;
    }

    public int getValue() {
        return value;
    }

    public LinkedListElement getPort(){
        return port;
    }
}
