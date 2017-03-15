package com.bbd;

import java.io.IOException;

public class Nkandla extends Homestead
{
    private SwimmingPool swimmingPool;
    private ChickenRun chickenRun;
    private Amphitheatre amphitheatre;

    public Nkandla(String name, String district, String province, String country, SwimmingPool swimmingPool, ChickenRun chickenRun, Amphitheatre amphitheatre){
        super(name, district, province, country);

        this.swimmingPool = swimmingPool;
        this.chickenRun = chickenRun;
        this.amphitheatre = amphitheatre;
    }

//Sets
    public void setSwimmingPool(SwimmingPool sPool){
        this.swimmingPool = sPool;
    }

    public void setChickenRun(ChickenRun cRun){
        this.chickenRun = cRun;
    }

    public void setAmphitheatre(Amphitheatre aTheatre){
        this.amphitheatre = aTheatre;
    }
//Gets
    public SwimmingPool getSwimmingPool(){
        return this.swimmingPool;
    }

    public ChickenRun getChickenRun(){
        return this.chickenRun;
    }

    public Amphitheatre getAmphitheatre(){
        return this.amphitheatre;
    }


    private void inError() throws IOException
    {
        throw new IOException();
    }

    public String AcceptVisitor(Person visitor)
	{
        try{
            if (visitor.getType() == PersonTypeEnums.personType.President)
            {
                return "Welcome";
            } else {
                inError();
            }
        } catch (IOException e)
        {
            return "You are not a President, Go Away";
        }

        return "";
	}
}