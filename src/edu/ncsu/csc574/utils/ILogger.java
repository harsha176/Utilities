package edu.ncsu.csc574.utils;

import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author doogle-dev
 *
 */
public abstract class ILogger {

	// Configure log4j.xml configuration file.
	static {
		DOMConfigurator.configure("log4j.xml");
	}
}