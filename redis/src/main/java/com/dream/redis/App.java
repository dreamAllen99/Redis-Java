package com.dream.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * REDIS sentinel mode testing code
 * It is all well and good.  the main test cases as follows:
 * 1. If we kill the sentinels process , the program does not work.
 * 2. If we kill the master node , the REDIS replications will rebuild it, and voted the new master and work well. 
 *    But need a few seconds to sync data.  
 *    (If there are big data in the REDIS REPLICATION, how we to calculate the time to sync data?)
 * 
 * so it is a good experience.
 * so easy !
 * 
 */

public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/all.xml");
    	
    	RedisServices rs = ctx.getBean("redisServices", RedisServices.class);
    	
    	rs.save("22testxx", "java-setVaue-sentinel-model");
    	
    	System.out.println(rs.get("22testxx"));
    	
    	
    	System.out.println("======okay=====");
    	
    	
//    	System.out.println("wait 10 seconds.........");
//    	
//    	int t = 120;
//    	while(t > 0){
//    		Thread.sleep(1000);
//    		System.out.println("remain secondes:"+t--);
//    	}
//    	
//    	System.out.println("start writing data into REDIS=====");
//    	
//    	rs.save("12", "1213");
//    	
//    	System.out.println(rs.get("12"));
//    	
//    	System.out.println("end");
    	
    	
    }
}
