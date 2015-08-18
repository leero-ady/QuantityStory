package thoughtworks;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuantityTest {
	
	QuantityinMeters tenMeters = new QuantityinMeters(10);
	
	QuantityinMeters oneMeter = new QuantityinMeters(1);
	
	QuantityinCentimeters oneCentimeter = new QuantityinCentimeters(1);						
		
	QuantityinNanoMeters tenMillionNanoMeters = new QuantityinNanoMeters(10000000.0);
	
	QuantityinCentimeters hundredCentimeters = new QuantityinCentimeters(100);
	
	QuantityinMeters twoMeters  = new QuantityinMeters(2); 
	
	@Test
	public void testConvertToBase(){
						
		assertEquals(tenMillionNanoMeters.equals(oneCentimeter.convertToBase()),0.0);		
	}
	
	@Test
	public void testAddition(){
		
		assertEquals(twoMeters.getValue(),oneMeter.addInMeters(hundredCentimeters).getValue(),0.0);		
	}
	
	@Test
	public void testEquality(){
								
		assertEquals(oneMeter.getValue(),QuantityinMeters.convertBaseToMeter(hundredCentimeters.convertToBase()),0.0);
		
	}

}
