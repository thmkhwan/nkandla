package com.bbd;

import java.util.ArrayList;

public class ChickenRun {

    private ArrayList<Chicken> chickens;

    ChickenRun(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void setChickens(ArrayList<Chicken> c){
        this.chickens = c;
    }

    public Chicken getChicken(int index){
        return this.chickens.get(index);
    }

    public int getNumChickens(){
        return this.chickens.size();
    }  
}