package com.srm.ems.map;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(10);
		Employee e2=new Employee(10);
		
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(e1, "vinay");
		map.put(e2, "vinay");
		System.out.println(map.size());
		 System.out.println(map.get(e2));
		System.out.println(map.remove(e2));
	}

}
