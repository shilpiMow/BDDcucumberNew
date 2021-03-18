package com.practice.mou;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		IfElse.ifElse();
		
		
	}
	
	public static void ifElse() {
		String a="Weekdays start from";
		String b="Monday to Friday";
		String c="Weekends start from";
		String d="Saturday to Sunday";
		
				
		if(a.equals(b)) {
			System.out.println("we have no class");
			
			
		}
		else if(c.equals(d)) {
			System.out.println("we have class");
			
		}
		else {
			System.out.println("error in method making");
		}
		
		String joradicchi=a.concat(" "+b).concat("\n"+c).concat(" "+d);
		System.out.println(joradicchi);
		
		
	}

}
