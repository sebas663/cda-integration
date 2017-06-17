import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class TestJedis {
	
	@Autowired
	private static JedisPool jedisPool;
	
	public static void main(String[] args) throws InterruptedException {
		t();
//		t1();
	}
	private static void t() throws InterruptedException{
		
		String cacheKey = "cachekey";
		Jedis jedis = new Jedis("172.16.1.64",6379);
		jedis.auth("fleni#123");
	    System.out.println("Connected to Redis");
		// adding a new key
		jedis.set(cacheKey, "cached valueeeeee");
//		// setting the TTL in seconds
		jedis.expire(cacheKey, 8);
//		// Getting the remaining ttl
//		System.out.println("TTL:" + jedis.ttl(cacheKey));
//		Thread.sleep(1000);
//		System.out.println("TTL:" + jedis.ttl(cacheKey));
		// Getting the cache value
		System.out.println("Cached Value:" + jedis.get(cacheKey));

		// Wait for the TTL finishs
		Thread.sleep(5000);
		
		System.out.println("TTL:" + jedis.ttl(cacheKey));
		
		// trying to get the expired key
		System.out.println("Expired Key t:" + jedis.get(cacheKey));
	}
	
	private static void t1() throws InterruptedException {

		Jedis jedis = new Jedis("172.16.1.152", 6379);
		jedis.auth("fleni#123");
		// trying to get the expired key
		System.out.println("TTL-werr:" + jedis.ttl("v"));
		System.out.println("Expired Key t1 :" + jedis.get("v"));
	}

}
