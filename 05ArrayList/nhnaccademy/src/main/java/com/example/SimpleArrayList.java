package com.example;

public class SimpleArrayList {
    private int id;
    private String[] ArrayL;

    
    SimpleArrayList(){
        id = 0;
        this.ArrayL = new String[1];
    }

    public void addoncomplete() {
        String[] tempArr = new String[ArrayL.length+1];
        for(int i = 0; i < ArrayL.length ; i++){
            tempArr[i] = ArrayL[i];
        }
        ArrayL = tempArr;
    }

    public void add(String item){
        if(id >= ArrayL.length){
            addoncomplete();
        }
        ArrayL[id]= item;
        id++;
    }


}
