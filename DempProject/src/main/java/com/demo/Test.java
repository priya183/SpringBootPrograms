package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	Logger log=LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		Test t=new Test();
		
		t.processData();
	}
	public void processData()
	{
		log.trace("From TRACE Method");
		 log.debug("From DEBUG Method");
		/*
		 * log.debug("From DEBUG Method"); log.info("From INFO Method");
		 * log.warn("From WARN Method"); log.error("From ERROR Method");
		 */
		}
}
