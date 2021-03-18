package com.practice.mou;

import java.util.Scanner;

public class Scannerprac {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What's your name?") ;
		String name=scan.next();
		
		System.out.println("How old you are?");
		int age=scan.nextInt(); 
		
		System.out.println("Where are you from?");
		String country=scan.next();
		
		System.out.println("Her name is " + name+ " She is "+ age + " and she is from Bangladesh which is a beautyful country");
		
	}

}
