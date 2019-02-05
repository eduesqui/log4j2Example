package com.eduesqui.exampleLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App {
	
	
	private static Logger LOG = LogManager.getLogger(App.class);
	
    public static void main( String[] args )    {
    	LOG.trace("Message trace");
    	LOG.debug("Message debug");
    	LOG.info("Message info"); 
    	LOG.error("Message error");
    }
}
