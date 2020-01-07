package com.cimc.senheyun.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

public class DefaultExceptionHandler implements HandlerExceptionResolver
{
 private static Logger logger = LogManager.getLogger(DefaultExceptionHandler.class.getName());

 public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) 
 {
  ModelAndView mv = new ModelAndView();
  
  FastJsonJsonView view = new FastJsonJsonView();
  Map<String, Object> object = new HashMap<String, Object>();
  String errorCode = null;
  String errorMsg = null;
  if(ex.getMessage() != null)
  {
	  String[] errorCodeMsg = ex.getMessage().split(",");
	  if(errorCodeMsg.length != 2)
	  {
		  errorCode = errorCodeMsg[0];
		  errorMsg = errorCodeMsg[0];
	  }
	  else {
		  errorCode = errorCodeMsg[0];
		  errorMsg = errorCodeMsg[1];
	  }
	  object.put("status", new MyStatus("500", errorCode, errorMsg));
	  object.put("content", "");
	  
	  view.setAttributesMap(object);
	  mv.setView(view);
	  //mv.addObject(object);
	  logger.debug("异常: " + ex.getMessage(), ex);
  }
  return mv;
 }
}
