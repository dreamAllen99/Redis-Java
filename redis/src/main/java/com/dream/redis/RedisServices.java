package com.dream.redis;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServices {
	
	
	@Resource
	private RedisTemplate redisTemplate;
	
	
	public void save(String key, String value){
		  redisTemplate.opsForValue().set(key,value);
	}
	
	public String get(String key){
		   return redisTemplate.opsForValue().get(key).toString();
	}
	

}
