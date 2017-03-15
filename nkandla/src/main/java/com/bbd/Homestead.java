package com.bbd;

public class Homestead
{

    private String name;
    private String district;
    private String province;
    private String country;

    public Homestead(String name, String district, String province, String country)
    {
        this.name = name;
        this.district = district;
        this.province = province;
        this.country = country;
    }

    //Sets
    public void setName(String vName)
    {
        this.name = vName;
    }

    public void setDistrict(String vDist)
    {
        this.district = vDist;
    }

    public void setProvince(String vProv)
    {
        this.province = vProv;
    }

    public void setCountry(String vCountry)
    {
        this.country = vCountry;
    }
    
    //Gets
    public String getName()
    {
        return this.name;
    }

    public String getDistrict()
    {
        return this.district;
    }

    public String getProvince()
    {
        return this.province;
    }

    public String getCountry()
    {
        return this.country;
    }
	
	
	public boolean AcceptVisitor(Person peep)
	{
		if (peep.getType() == PersonTypeEnums.personType.President)
		{
			return true;
		} else {
			return false;
		}
		
	}
	
}