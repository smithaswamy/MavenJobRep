package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.Calculator;

public class TestCalculator {

	Calculator cal;
	@Before
	public void createObject()
	{
		cal=new Calculator();
	}
	
	@Test
	public void testAdd() {
		int actual=cal.add(4, 4);
		int expected=8;
		assertTrue(actual==expected);
	}

	
	@Test
	public void testSub() {
		int actual=cal.sub(5, 4);
		int expected=11;
		assertTrue(actual==expected);
	}
}
