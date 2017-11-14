package com.lkg.test;

import java.util.HashMap;
import java.util.Map;

import com.lkg.bean.User;

public class TestUser {
	
	public static void main(String[] args) {
		Map<String, Object> userMap = getUser();
		User user = (User) userMap.get("user");
		System.out.println(userMap);
		System.out.println(user);
	}
	static Map<String, Object> getUser(){
		Map<String , Object> map = new HashMap<String, Object>();
		User user = new User();
		user.setName("ad");
		user.setAge(19);
		user.setSex("女");
		User user2 = new User();
		user2.setName("adc");
		user2.setAge(22);
		user2.setSex("男");
		map.put("user", user);
		map.put("user2", user2);
		return map;
	}
}
