package com.bbd;

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

    @before
    public void testHSName()
    {
        assertEquals("Nkandla", Homestead.getName);
    }

    @before
    public void testHSDist()
    {
        assertEquals("9", Homestead.getDistrict);
    }

    @before
    public void testHSProv()
    {
        assertEquals("KZN", Homestead.getProvince);
    }

    @before
    public void testHSCountry()
    {
        assertEquals("RSA", Homestead.getCountry);
    }
}
