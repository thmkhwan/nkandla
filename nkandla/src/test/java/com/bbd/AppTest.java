package com.bbd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;

//import junit.framework.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    
    static Person daniel;
    static Homestead nkandla;



    @BeforeClass 
    public static void initPerson()
    {
        daniel = new Person("Daniel", 10, "Male", PersonTypeEnums.personType.Architect);
        nkandla = new Homestead("Nkandla", "9", "KZN", "South Africa");
    }

    @Test
    public void testEnumsPres()
    {
        assertEquals(0, PersonTypeEnums.personType.President.rank);
    }

    @Test
    public void testEnumsLaw()
    {
        assertEquals(1, PersonTypeEnums.personType.Lawyer.rank);
    }

    @Test
    public void testEnumsArc()
    {
        assertEquals(2, PersonTypeEnums.personType.Architect.rank);
    }

    @Test
    public void testPersonName()
    {
        assertEquals("Daniel", daniel.getName());
    }

    @Test
    public void testPersonAge()
    {
        assertEquals(10, daniel.getAge());
    }

    @Test
    public void testPersonGender()
    {
        assertEquals("Male", daniel.getGender());
    }

    @Test
    public void testPersonType()
    {
        assertEquals(PersonTypeEnums.personType.Architect, daniel.getType());
    }

    @Test
    public void testHSName()
    {
        assertEquals("Nkandla", nkandla.getName());
    }

    @Test
    public void testHSDist()
    {
        assertEquals("9", nkandla.getDistrict());
    }

    @Test
    public void testHSProv()
    {
        assertEquals("KZN", nkandla.getProvince());
    }

    @Test
    public void testHSCountry()
    {
        assertEquals("South Africa", nkandla.getCountry());
    }

    @Test

    public void testVisit()
    {
        assertEquals(expected, actual);
    }
}