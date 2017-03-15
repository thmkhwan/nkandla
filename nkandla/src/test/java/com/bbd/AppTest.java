package com.bbd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    
    //Person daniel;
    Homestead nkandla;



    @BeforeClass 
    public void initPerson()
    {
        //daniel = new Person("Daniel", 10, "Male", PersonTypeEnums.personType.Architect);
    }

    @BeforeClass 
    public void initHomestead()
    {
        nkandla = new Homestead("Nkandla", "9", "KZN", "South Africa");
    }

    @test
    public void testEnumsPres()
    {
        assertEquals(0, PersonTypeEnums.personType.President.rank);
    }

    @test
    public void testEnumsLaw()
    {
        assertEquals(1, PersonTypeEnums.personType.Lawyer.rank);
    }

    @test
    public void testEnumsArc()
    {
        assertEquals(2, PersonTypeEnums.personType.Architect.rank);
    }
/*
    @test
    public void testPersonName()
    {
        assertEquals("Daniel", daniel.getName());
    }

    @test
    public void testPersonAge()
    {
        assertEquals(10, daniel.getName());
    }

    @test
    public void testPersonGender()
    {
        assertEquals("Male", daniel.getGender());
    }

    @test
    public void testPersonType()
    {
        assertEquals(PersonTypeEnums.personType.Architect, daniel.getPersonType());
    }
*/
    @test
    public void testHSName()
    {
        assertEquals("Nkandla", Homestead.getName());
    }

    @test
    public void testHSDist()
    {
        assertEquals("9", Homestead.getDistrict());
    }

    @test
    public void testHSProv()
    {
        assertEquals("KZN", Homestead.getProvince());
    }

    @test
    public void testHSCountry()
    {
        assertEquals("South Africa", Homestead.getCountry());
    }
}
