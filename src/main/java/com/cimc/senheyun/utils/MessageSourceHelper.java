package com.cimc.senheyun.utils;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;


public class MessageSourceHelper 
{
	private static MessageSource messageSource;  
    
    public void setMessageSource(ResourceBundleMessageSource messageSource) 
    {  
        MessageSourceHelper.messageSource = messageSource;  
    }  
      
    public static String  getMessage(String code, Object[] args, String defaultMessage, Locale locale) 
    {  
        String msg = messageSource.getMessage(code, args, defaultMessage, locale);  
        return msg != null ? msg.trim() : defaultMessage;  
    }

}
