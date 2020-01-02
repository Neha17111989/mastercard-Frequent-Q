package com.altimetrik;

public class SortNoWithoutSorting {

	public static void main(String[] args) {
		int arr[]=new int[] {10, 7, 9, 2, 8,3, 5, 4, 6, 1};
		arr=sortit(arr,arr.length-1);
		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i]+",");
	}

	private static int[] sortit(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			arr[i]=i+0;
		}
		return arr;
		
	}

}
