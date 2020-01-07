package com.cimc.senheyun.utils;

import redis.clients.jedis.Jedis;

public class RedisPoolUtil {

	public static Long expire(String key, int exTime) {
		Jedis jedis= null;
		Long result= null;
		
		try {
			jedis = RedisPool.getJedis();
			result = jedis.expire(key, exTime);
		} catch (Exception e) {
			System.out.println(e);
			RedisPool.returnBrokenResource(jedis);
			return result;
		}	
		RedisPool.returnResource(jedis);
		return result;
	}
	
	// exTime的单位是秒
	public static String setEx(String key, String value ,int exTime) {
		Jedis jedis= null;
		String result= null;
		
		try {
			jedis = RedisPool.getJedis();
			result = jedis.setex(key, exTime,value);
		} catch (Exception e) {
			System.out.println(e);
			RedisPool.returnBrokenResource(jedis);
			return result;
		}	
		RedisPool.returnResource(jedis);
		return result;
	}
	
	public static String set(String key, String value) {
		Jedis jedis= null;
		String result= null;
		
		try {
			jedis = RedisPool.getJedis();
			result = jedis.set(key, value);
		} catch (Exception e) {
			System.out.println(e);
			RedisPool.returnBrokenResource(jedis);
			return result;
		}	
		RedisPool.returnResource(jedis);
		return result;
	}
	
	public static String get(String key) {
		Jedis jedis= null;
		String result= null;
		
		try {
			jedis = RedisPool.getJedis();
			result = jedis.get(key);
		} catch (Exception e) {
			System.out.println(e);
			RedisPool.returnBrokenResource(jedis);
			return result;
		}
		RedisPool.returnResource(jedis);
		return result;
	}
	
	public static Long del(String key) {
		Jedis jedis= null;
		Long result= null;
		
		try {
			jedis = RedisPool.getJedis();
			result = jedis.del(key);
		} catch (Exception e) {
			System.out.println(e);
			RedisPool.returnBrokenResource(jedis);
			return result;
		}	
		RedisPool.returnResource(jedis);
		return result;
	}
	
	/*public static void main(String[] args) {
		RedisPoolUtil.set("keyTest", "value");
		System.out.println(RedisPoolUtil.get("keyTest"));;
		RedisPoolUtil.setEx("keyex", "valueex", 60*10);
		RedisPoolUtil.expire("keyTest", 60*20);
		//RedisPoolUtil.del("keyTest");
	}*/
	
}
