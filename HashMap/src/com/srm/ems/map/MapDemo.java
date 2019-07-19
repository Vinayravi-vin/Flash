package com.srm.ems.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("CS001","Vinay");
		m1.put("CS002", "Vidya");
		m1.put("CS003","Jaya");
		m1.put("CS004", "Ravi");
		m1.put("CS005","Abc");
		m1.put("CS006", "Xyz");
		//System.out.println(m1);
		for(Map.Entry<String, String>entry:m1.entrySet()) {
			System.out.println("key = " + entry.getKey() + "  " + "value = " + entry.getValue() );
		}

	}

}
