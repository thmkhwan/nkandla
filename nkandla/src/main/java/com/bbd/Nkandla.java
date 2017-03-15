package com.bbd;

import java.io.IOException;

public class Nkandla extends Homestead
{
    private String swimmingPool;
    private String chickenRun;
    private String amphitheater;

    public Nkandla(String name, String district, String province, String country){
        super(name, district, province, country);
    }

//Sets
    public void setSwimmingPool(String sPool){
        this.swimmingPool = sPool;
    }

    public void setChickenRun(String cRun){
        this.chickenRun = cRun;
    }

    public void setAmphitheater(String aTheater){
        this.amphitheater = aTheater;
    }
//Gets
    public String getSwimmingPool(){
        return this.swimmingPool;
    }

    public String getChickenRun(){
        return this.chickenRun;
    }

    public String getAmphitheater(){
        return this.amphitheater;
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