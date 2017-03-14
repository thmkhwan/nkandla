package com.bbd;

import org.junit.Before;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testEnumsPres()
    {
        assertEquals(0, PersonTypeEnums.personType.President.rank);
    }

    public void testEnumsLaw()
    {
        assertEquals(1, PersonTypeEnums.personType.Lawyer.rank);
    }

    public void testEnumsArc()
    {
        assertEquals(2, PersonTypeEnums.personType.Architect.rank);
    }

    Person daniel;
    Homestead nkandla;

    @Before public void initPerson()
    {
        daniel = new Person("Daniel", 10, "Male", PersonTypeEnums.personType.Architect);
    }

    @Before public void initHomestead()
    {
        nkandla = new Homestead("Nkandla", "9", "KZN", "South Africa");
    }

    public void testPersonName()
    {
        asserEquals("Daniel", daniel.getName());
    }

    public void testPersonAge()
    {
        asserEquals(10, daniel.getName());
    }

    public void testPersonGender()
    {
        asserEquals("Male", daniel.getGender());
    }

    public void testPersonType()
    {
        assertEquals(PersonTypeEnums.personType.Architect, daniel.getPersonType());
    }

    public void testHSName()
    {
        assertEquals("Nkandla", Homestead.getName());
    }

    public void testHSDist()
    {
        assertEquals("9", Homestead.getDistrict());
    }

    public void testHSProv()
    {
        assertEquals("KZN", Homestead.getProvince());
    }

    public void testHSCountry()
    {
        assertEquals("South Africa", Homestead.getCountry());
    }
}
