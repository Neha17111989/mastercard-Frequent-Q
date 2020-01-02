package com.altimetrik;

public class SplitArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 10, 5, 6, 52, 36 };
		int len = arr.length;
		//System.out.println(len);
		splitArray(arr, 2, len);
		System.out.println("*****");
		for(int i=0;i<len-1;i++)
			System.out.println(arr[i]);

	}

	private static void splitArray(int[] arr, int defined, int len) {
		for (int i = 0; i <= defined; i++) {
			splitArrayByOne(arr, len);
		}

	}

	private static void splitArrayByOne(int[] arr, int len) {
		int i=0, temp;
		temp = arr[i];
		for (i = 0; i < len-1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

}
