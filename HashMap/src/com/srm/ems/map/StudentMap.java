package com.srm.ems.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>map=new HashMap<String,String>();
		map.put("S001", "PESITM");
		map.put("S002", "JNNCE");
		map.put("S003", "GMCE");
		map.put("S004", "RVCE");
		map.put("S005", "RMZE");
		map.put("S001", "PESITM");
		

		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String>entry=itr.next();
			System.out.println("key= " + entry.getKey() + " " + " value = " + entry.getValue());
		}
		
	}
}