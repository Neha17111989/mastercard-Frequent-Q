package com.altimetrik;

public class DS2 {

	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7};
		DS2 obj=new DS2();
		int len=arr.length;
		obj.RotateArray(arr,2,len);
		obj.printArray(arr);
		
	}

	private void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private void RotateArray(int[] arr, int i, int len) {
		for(int d=0;d<i;d++) {
			rotateByOne(arr,len);
		}
		
	}

	private void rotateByOne(int[] arr, int len) {
		int i=0,temp;
		temp=arr[i]; //{1,2,3,4,5,6,7} //temp 1
		for(i=0;i<len-1;i++) {
			arr[i]=arr[i+1]; //2,3,4,5,6,7,1
		}
		arr[i]=temp;
		
	}

	
}
