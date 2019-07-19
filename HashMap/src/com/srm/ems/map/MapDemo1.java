package com.srm.ems.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("Book 1", "C#");
		map.put("Book 2", "Big Data");
		map.put("Book 3", "Java");
		map.put("Book 4", "Web");
		map.put("Book 5", "PHP");
		map.put("Book 6", "Data Science");
		//for each loop for getting key value pair
		for(Map.Entry<String,String>entry:map.entrySet()) {
			System.out.println("key = " + entry.getKey() + " " + "," + "value = " + entry.getValue());
			}
		//only key
		for(String name:map.keySet()) {
			System.out.println("key= " + name);
		}
		//only values
		for(String url:map.values()) {
			System.out.println("values =" + url);
		}

	}

}
