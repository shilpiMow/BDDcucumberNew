package com.opps.concept;

public class Runner {
	
	public static void main(String[]args) {
		Encapsulation en= new Encapsulation();
		en.setName("mow");
		en.setEmail("shilpimou@gmail.com");
		en.setAge(39);
		
		System.out.println(en.getName());
		System.out.println(en.getEmail());
		System.out.println(en.getAge());
	}

}
