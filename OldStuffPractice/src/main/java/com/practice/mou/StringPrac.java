package com.practice.mou;

public class StringPrac {
	public static void main(String[] args) {
		
	
	String st="Shilpi";
	
	String[]st1=st.split("");
	//char[]st1=st.toCharArray();
	//StringBuilder st1=new StringBuilder();
	//st1.reverse();
	for(int i=st1.length-1; i>=0; i--) {
		
		System.out.print(st1[i]);
	}

}
}