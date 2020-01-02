package com.alti.ds;

public class PrintFirstLastNumber {

	public static void main(String[] args) {
		String data="12345";
		
		find(data);

	}

	private static void find(String data) {
		char [] arr=data.toCharArray();
		int len=data.length();
		for(int i=0;i<len;i++) {
			if(i==0) {
				//int zero=arr[0];	
				System.out.println("First element is : "+arr[i]);
			}
			
			
		}
		System.out.println("last element is :"+arr[len-1]);
		
		
	}

}
