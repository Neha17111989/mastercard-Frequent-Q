package com.alti.ds;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 45, 1, 5, 7, 90, 89, 8 };
		System.out.println("Before Sorting...");
		printArray(arr);
		sort(arr);
		System.out.println("after Sorting...");
		printArray(arr);

	}

	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " , ");
		}

	}

	private static void sort(int[] arr) {
		 int n = arr.length;//{ 12, 45, 1, 5, 7, 90, 89, 8 };
	      int temp = 0;

		/*
		 * for(int i = 0; i < n; i++) { //outer loop for(int j=1; j < (n-i); j++) {
		 * //inner loop if(arr[j-1] > arr[j]) { //0>1 temp = arr[j-1]; arr[j-1] =
		 * arr[j]; arr[j] = temp; } } }
		 */
	      
	      for(int i=0;i<n;i++) { 
	    	  
	    	  for(int j=1;j<(n-i);j++) { //n-1
	    		  if(arr[j-1]>arr[j]) {
	    			  temp=arr[j-1];
	    			  arr[j-1]=arr[j];
	    			  arr[j]=temp;
	    			  
	    		  }
	    		  
	    	  }
	      }

	}}
