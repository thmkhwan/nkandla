package com.bbd;

public class Person {

    private String name;
    private int age;
    private String gender;
    private PersonTypeEnums.personType type;

    Person(String name, int age, String gender, PersonTypeEnums.personType personType) {
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

    public void setType(PersonTypeEnums.personType t){
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
    
    public PersonTypeEnums.personType getType(){
        return this.type;
    }     
}