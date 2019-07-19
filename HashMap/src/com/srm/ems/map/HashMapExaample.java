package com.srm.ems.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExaample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("9742193535", "Vinay");
		map.put("9742184185", "Vinita");
		map.put("9740081186", "Ravi");
		map.put("9663927599", "Jaya");
		map.put("8147889374", "Vidya");
		map.put("9742184183", "Priya");
		map.put("7019223508", "likitha");
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator(); 
		while(itr.hasNext()) {
			Map.Entry<String, String>entry =itr.next();
			System.out.println("key = " + entry.getKey() + " " + "value = " + entry.getValue());
		}
		
	}
}

