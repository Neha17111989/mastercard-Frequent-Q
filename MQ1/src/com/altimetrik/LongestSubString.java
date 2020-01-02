package com.altimetrik;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"geeks", "for", "geeksfor", "geeksforgeeks"};
		int len=0;
		int tempLen=0;
		
		for(int i=0;i<arr.length;i++) {
			len=arr[i].length();
			tempLen=len;
			if(len>tempLen) {
				tempLen=len;
			}
		}
		System.out.println("leargest len of string is "+len );

	}

}
