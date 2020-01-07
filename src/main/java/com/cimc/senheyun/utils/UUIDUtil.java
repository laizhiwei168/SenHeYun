package com.cimc.senheyun.utils;

import java.util.UUID;

public class UUIDUtil {
	
	/**
	 * 生成UUID32位
	 * 
	 * @return
	 */
	public static int NUMBERONE=1;
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
