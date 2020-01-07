package com.cimc.senheyun.utils;

import java.util.Locale;

public class ErrorMsg 
{
	private static String defaultMsg = "Uncaught Exception";
	
	public static String getMsg(String errorCode, Object[] args, Locale locale)
	{
		if(locale==null)
		{
			locale = Locale.getDefault();
		}
		return errorCode + "," + MessageSourceHelper.getMessage(errorCode, args, defaultMsg, locale);
	}
	
	public static String getMsg(String errorCode, Object[] args)
	{
		return errorCode + "," + MessageSourceHelper.getMessage(errorCode, args, defaultMsg, Locale.getDefault());
	}
	
	public static String getMsg(String errorCode)
	{
		return errorCode + "," + MessageSourceHelper.getMessage(errorCode, null, defaultMsg, Locale.getDefault());
	}
}
