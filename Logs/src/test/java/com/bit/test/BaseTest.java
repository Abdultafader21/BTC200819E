package com.bit.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;

public class BaseTest {
	
	Logger log = Logger.getLogger(BaseTest.class);
	@Before
	public void start() {
		
		DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void test1() {
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is warn");
		log.info("this is info");
		log.debug("this is debug");
		log.trace("this is trace");
	}
	//legacy class
	//1.vector 
	//2.Stack
	//3. hashTable
	//4. Properties
	//5. Dictionary
	//6. Enamuration
}
