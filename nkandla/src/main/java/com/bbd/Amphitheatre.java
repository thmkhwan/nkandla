package com.bbd;

public class Amphitheatre {

    private String numSeats;

    Amphitheatre(String numSeats) {
        this.numSeats = numSeats;
    }

    public void setNumSeats(String n){
        this.numSeats = n;
    }

    public String getNumSeats(){
        return this.numSeats;
    }  
}