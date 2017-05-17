package com.nit.reservoir.core.log;

import org.apache.log4j.Logger;


/**
 * 系统错误日志
 * 记录各种异常错误,只提供error和warn
 * @author Administrator
 *
 */
public class ErrorLog {

	private static Logger log  = Logger.getLogger("ErrorLog");

	public static Logger getLog() {
		return log;
	}			
	
}
