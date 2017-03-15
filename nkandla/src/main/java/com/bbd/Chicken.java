package com.bbd;

public class Chicken {

    private String name;
    private int age;
    private String gender;
    private String color;

    Chicken(String name, int age, String gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;

    }

    public String cluck(){
        return this.name + " goes cluck";
    }

    public void setName(String n){
        this.name = n;
    }

    public void setAge(int a){
        this.age = a;
    }

    public void setGender(String g){
        this.gender = g;
    }

    public void setColor(String c){
        this.color = c;
    } 

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }
    
    public String getColor(){
        return this.color;
    }     
}