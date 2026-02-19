package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	static Logger log=LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		System.out.println("Hello World");
		log.info("This is INFO Log");
		log.error("This is Error Log");
		log.warn("This is Warning Log");
		log.fatal("This is FATAL Log");
		log.debug("This is DEBUG Log");
		
	}

}
