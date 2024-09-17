package test.code.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CeilingFan_Test {
	
	@Test
	void testSpeed1() {
		
		CeilingFan speed1 = new CeilingFan(true, false, false, false,false);
		
		boolean result = speed1.isIncreasedSpeed1();
		
		assertTrue(true == result);
	}
	
	@Test
	void testSpeed2() {
		CeilingFan speed2 = new CeilingFan(false, true, false, false, false);
		
		boolean result = speed2.isIncreasedSpeed2();
		
		assertTrue(true == result);
	}
	
	@Test
	void testSpeed3() {
		CeilingFan speed3 = new CeilingFan(false, false, true, false, false);
		
		boolean result = speed3.isIncreasedSpeed3();
		
		assertTrue(true == result);
	}
	
	@Test
	void testSpeedOff() {
		CeilingFan speedoff = new CeilingFan(false, false, false, true, false);
		
		boolean result = speedoff.isSpeedOff();
		
		assertTrue(true == result);		
	}
	
	@Test
	void testReverseSpeed() {
		CeilingFan reversespeed = new CeilingFan(false, false, false, false, true);
		
		boolean result = reversespeed.isReversedSpeed();
		
		assertTrue(true == result);
		
	}
}
