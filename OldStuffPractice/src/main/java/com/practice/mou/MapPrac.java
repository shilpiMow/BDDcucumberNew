package com.practice.mou;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrac {
	
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(01, "Mow's son");
		map.put(02, "Mow's 2nd son");
		map.put(03, "Mow's sis");
		
				
	Set<Integer> st=map.keySet();
		
		for(Integer st1:st) {
			
		System.out.println(st1+"--"+map.get(st1));
		}
		
	//System.out.println(map.get(01));
		HashMap<String,String> happy= new HashMap<String,String>();
		happy.put("Name", "Mow");
		happy.put("Age", "39");
		
	}

}
