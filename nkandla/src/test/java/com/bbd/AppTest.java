package com.bbd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import java.util.ArrayList;
import java.util.Arrays;

//import junit.framework.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    
    static Person daniel;
	static Person rob;
    static Homestead nkandla;
    static Chicken henryTheChicken;
    static SwimmingPool mainPool;
    static ChickenRun chickenRun;

    @BeforeClass 
    public static void initPerson()
    {
        Chicken henryTheChicken = new Chicken("Henry", 47, "Male", "Brown");
        Chicken bobTheChicken = new Chicken("Bob", 10, "Male", "White");
        Chicken billTheChicken = new Chicken("Bill", 73, "Male", "Black");
        Chicken jennyTheChicken = new Chicken("Jenny", 12, "Female", "Purple");
        ArrayList<Chicken> chickens = new ArrayList<Chicken>(Arrays.asList(henryTheChicken, bobTheChicken, billTheChicken, jennyTheChicken));
        daniel = new Person("Daniel", 10, "Male", PersonTypeEnums.personType.Architect);
        nkandla = new Homestead("Nkandla", "9", "KZN", "South Africa");
		rob = new Person("Robert", 107, "Male", PersonTypeEnums.personType.President);
        mainPool = new SwimmingPool(true, "Colossal");
        chickenRun = new ChickenRun(chickens);
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
    public void testChickenName()
    {
        assertEquals("Henry", henryTheChicken.getName());
    }

    @Test
    public void testChickenAge()
    {
        assertEquals(47, henryTheChicken.getAge());
    }

    @Test
    public void testChickenGender()
    {
        assertEquals("Male", henryTheChicken.getGender());
    }

    @Test
    public void testChickenColor()
    {
        assertEquals("Brown", henryTheChicken.getColor());
    }

    @Test
    public void testChickenCluck(){
        assertEquals("Henry goes cluck", henryTheChicken.cluck());
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
	public void testHSEntryPres()
	{
		assertEquals(true, nkandla.AcceptVisitor(rob));
	}
	
	@Test
	public void testHSEntryNonPres()
	{
		assertEquals(false, nkandla.AcceptVisitor(daniel));
	}

    @Test
    public void testSwimmingPoolNeedsHTH()
    {
        assertEquals(true, mainPool.getNeedsHTH());
    }

    @Test
    public void testSwimmingPoolSize()
    {
        assertEquals("Colossal", mainPool.getSize());
    }

    @Test
	public void testChickenRunSecondChicken()
	{
		assertEquals("Bill", chickenRun.getChicken(2).getName());
	}

    @Test
    public void testChickenRunNumChickens()
    {
        assertEquals(4, chickenRun.getNumChickens());
    }
}
