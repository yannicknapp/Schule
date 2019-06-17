package test;

import static org.junit.Assert.*;

import org.junit.Test;

import rechner.InvalidFormatException;
import rechner.Rechner;

public class testcalcSum {

	@Test
	public void validInputs() throws InvalidFormatException 
	{
		assertEquals(21, Rechner.add("4 7 5 5"," "));
	}
	
	@Test
	public void validInput() throws InvalidFormatException 
	{
		assertEquals(11, Rechner.add("4;7"));
	}
	
	@Test(expected=InvalidFormatException.class)
	public void invalidNumber2() throws InvalidFormatException
	{
		Rechner.add("7 "," ");
	}
		
	
	@Test(expected=InvalidFormatException.class)
	public void invalidDelimeter() throws InvalidFormatException
	{
		Rechner.add("4 7");
	}
	
	@Test(expected=InvalidFormatException.class)
	public void invalidNumber() throws InvalidFormatException
	{
		Rechner.add("4;a");
	}

}
