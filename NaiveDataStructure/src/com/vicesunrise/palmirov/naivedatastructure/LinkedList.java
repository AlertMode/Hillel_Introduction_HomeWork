package com.vicesunrise.palmirov.naivedatastructure;

public class LinkedList {
    private LinkedListElement head;
    private LinkedListElement tail;

    public void addInFront(int value){
        LinkedListElement element = new LinkedListElement();
        element.setValue(value);
        if(head == null){
            head = element;
            tail = element;
        } else {
            element.setPort(head);
            head = element;
        }
    }

    public void addToEnd(int value){
        LinkedListElement element = new LinkedListElement();
        element.setValue(value);
        if(tail == null){
            head = element;
            tail = element;
        } else {
            tail.setPort(element);
            tail = element;
        }
    }

    public String getInfo(){
        LinkedListElement temp = head;
        int counter = 0;
        String messageA = "";
        while(temp != null){
            String messageB = "Element's index: " + ++counter + " Value: " + temp.getValue() + "\n";
            messageA += messageB;
            temp = temp.getPort();
        }
        if(messageA.equals("")){
            return "There are no elements!";
        }
        return messageA;
    }

    public boolean deleteElement(int value){
        if(head == null){
            return false;
        }

        if(head == tail){
            head = null;
            tail = null;
            return true;
        }

        if(head.getValue() == value){
            head = head.getPort();
            return true;
        }

        LinkedListElement temp = head;
        while(temp.getPort() != null){
            if(temp.getPort().getValue() == value){
              if(tail == temp.getPort()){
                  tail = temp;
              }
                temp.setPort(temp.getPort().getPort());
                return true;
            }
            temp = temp.getPort();
        }
        return false;
    }

    public int getValue(int index){
        LinkedListElement tempList = head;
        for(int j = 1; tempList != null; ++j){
            if(j == index){
                return tempList.getValue();
            } else {
                tempList = tempList.getPort();
            }
        }
        return -1;
    }
}