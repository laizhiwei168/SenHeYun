package com.cimc.senheyun.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPool {

	private static JedisPool pool;//jedis连接池
	private static Integer maxTotal =20; //最大连接数
	private static Integer maxIdle=10; // 在jedisPool中最大的idle状态（空闲的）的jedis实例的个数
	private static Integer minIdle=2; //在jedisPool中最小的idle状态（空闲的）的jedis实例的个数
	private static Boolean testOnBorrow = true;// 在borrow一个jedis实例的时候，是否要进行验证操作，如果赋值true。则得到的jedis实例肯定是可以用的。
	private static Boolean testOnReturn = true; // 在return一个jedis实例的时候，是否要进行验证操作，如果赋值true。则得到的jedis实例肯定是可以用的。
	
	private static String redisIp="134.175.143.254";//36.108.172.161   134.175.143.254
	private static Integer redisPort=6379;
	private static String password="123456";
	
	private static void initPool() {
		JedisPoolConfig config=new JedisPoolConfig();
		config.setMaxTotal(maxTotal);
		config.setMaxIdle(maxIdle);
		config.setMinIdle(minIdle);
		config.setTestOnBorrow(testOnBorrow);
		config.setTestOnReturn(testOnReturn);
		
		config.setBlockWhenExhausted(true);//连接耗尽的时候，是否阻塞，false会抛出异常，true阻塞直到超时，默认是true
		
		pool =new JedisPool(config,redisIp,redisPort,1000*2,password);
	}
	
	static {
		initPool();
	}
	
	public static Jedis getJedis() {
		return pool.getResource();
	}
	
	public static void returnBrokenResource(Jedis jedis) {
		pool.returnBrokenResource(jedis);
	}
	
	public static void returnResource(Jedis jedis) {
		pool.returnResource(jedis);
	}
	
	/*public static void main(String[] args) {
		Jedis jedis= pool.getResource();
		jedis.set("xiaoming", "xiaoming01");
		returnResource(jedis);
		
		pool.destroy();
		System.out.println("program is end ");
	}
	*/
}
