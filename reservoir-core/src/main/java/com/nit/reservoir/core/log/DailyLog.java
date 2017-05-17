package com.nit.reservoir.core.log;

import org.apache.log4j.Logger;


/**
 * 每日一个文件的业务记录日志
 * 每天会生成一个新的log文件.请根据业务需要使用
 * @author Administrator
 *
 */
public class DailyLog {

	private static Logger log  = Logger.getLogger("DailyLog");

	public static Logger getLog() {
		return log;
	}			
	
}
