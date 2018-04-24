package com.vicesunrise.palmirov.naivedatastructure;

public class Stack {
    private int[] array;
    private int top;

    public Stack(int length){
        array = new int[length];
        top = -1;
    }

    public void add(int element){
        if(isFull()){
            extendArray();
        }
        array[++top] = element;
    }

    public boolean delete(){
        if(!isEmpty() && !(top > array.length)){
            --top;
            downscaleArray();
            return true;
        }
        return false;
    }

    public int read(){
        if(isEmpty()){
            return array[0];
        } else {
            return array[top];
        }
    }

    private void extendArray(){
        int[] tempArray = array.clone();
        array = new int[tempArray.length + 1];
      System.arraycopy(tempArray, 0, array, 0, tempArray.length);
    }

    private void downscaleArray(){
        int[] tempArray = array.clone();
        array = new int[tempArray.length - 1];
        System.arraycopy(tempArray, 0, array, 0, tempArray.length - 1);
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == array.length - 1;
    }

    public int indexOf(int number){
        int count;
        for(count = 0; count < array.length; count++){
            if(array[count] == number){
                return count;
            }
        }
        return -1;
    }
}