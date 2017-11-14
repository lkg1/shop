package com.lkg.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lkg.bean.User;
import com.lkg.service.UserService;
import com.lkg.service.impl.UserServiceImpl;

public class TestUser {
	
	public static void main(String[] args) {
		Map<String, Object> userMap = getUser();
		User user = (User) userMap.get("user");
		System.out.println(userMap);
		System.out.println(user);
		
		UserService userService = new UserServiceImpl();
		List<String> message2 = new ArrayList<String>();
		User user3 = new User();
		user3.setName("ad");
		user3.setAge(19);
		user3.setSex("女");
		message2.add("我是个女孩儿");
		user3.setMessage(message2);
		List<String> messageList = userService.returnUser(user3).getMessage();
		System.out.println(messageList);
	}
	public static Map<String, Object> getUser(){
		Map<String , Object> map = new HashMap<String, Object>();
		User user = new User();
		user.setName("ad");
		user.setAge(19);
		user.setSex("女");
		List<String> message = new ArrayList<String>();
		message.add("我是个女孩儿");
		user.setMessage(message);
		System.out.println(user);
		User user2 = new User();
		user2.setName("adc");
		user2.setAge(22);
		user2.setSex("男");
		List<String> message3 = new ArrayList<String>();
		message3.add("我是个男孩儿");
		user2.setMessage(message3);
		map.put("user", user);
		map.put("user2", user2);
		return map;
	}
}
