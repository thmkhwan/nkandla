package com.bbd;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String type;

    Person(String name, int age, String gender, String personType) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = personType;

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

    public void setType(String t){
        this.type = t;
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
    
    public String getType(){
        return this.type;
    }     
}