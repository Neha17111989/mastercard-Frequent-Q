package com.alti.ds;

import java.util.HashMap;
import java.util.Map;

public class SumOfBinaryNumber {

	public static void main(String[] args) {
		String string="111000010000110";
		longestConsecutiveZeroes(string);

	}

	private static void longestConsecutiveZeroes(String string) {
		char[] arr=string.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		System.out.println(arr.length);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == '0') {
				if(!map.containsKey(arr[i]))
					map.put(arr[i], 1);
				else {
					map.put(arr[i], map.get(arr[i])+1);
					
					
				}
				count++;
			}
			
			
		}
		
		System.out.println("printing all o and 1's : no of times o enter"+count);
		//Iteration of map
		for(Map.Entry<Character, Integer> xy: map.entrySet()) {
			System.out.println(xy.getKey()+" : "+xy.getValue());
		}
		
		
		
		
		
		
		
	}

}
