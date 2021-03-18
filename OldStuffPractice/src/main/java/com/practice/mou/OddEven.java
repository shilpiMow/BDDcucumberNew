package com.practice.mou;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double a=input.nextDouble();
		if(a%2==0) {
			System.out.println("This is even no."+a);
		}else {
			System.out.println("This is odd no."+a);
		}
		
	}
	
	
	
}