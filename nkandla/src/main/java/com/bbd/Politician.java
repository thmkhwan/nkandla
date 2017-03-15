package com.bbd;

public class Politician extends Person{
	
	public int corruptionLevel;
	public String politicalParty;
	
	public Politician(int pCLvl, String pParty, String pName, int pAge, String pGender, PersonTypeEnums.personType pPersonType){
		
		super(pName, pAge, pGender, pPersonType);
		corruptionLevel = pCLvl;
		politicalParty = pParty;
		
	}
	
	//Sets
	public void setCorrLvl(int c)
	{
		this.corruptionLevel = c;
	}
	
	public void setParty(String p)
	{
		this.politicalParty = p;
	}
	
	//Gets
	public int getCorrLvl()
	{
		return this.corruptionLevel;
	}
	
	public String getParty()
	{
		return this.politicalParty;
	}
	
}