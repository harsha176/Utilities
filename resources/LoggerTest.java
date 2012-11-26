package edu.ncsu.csc575.utils.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import edu.ncsu.csc574.utils.ILogger;

public class LoggerTest {

	@Test
	public void test() {
		Logger logger = Logger.getLogger(getClass());
		logger.info("Trooper");
	}

}
