package com.practice.mou;

public class MaxMinNo {
	
	public static void main(String[] args) {
		MaxMinNo ms=new MaxMinNo();
		
	}
	public static int max (int [] array) {
		int [] st= {20,60,80};
		int max1=0;
		for(int i=0;i<st.length;i++) {
			if (array[i]>max1) {
				max1=array[i];
			}
			
		}
		return max1;
		
		
	}
	
	

}
