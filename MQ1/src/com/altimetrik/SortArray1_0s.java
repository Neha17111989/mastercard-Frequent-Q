package com.altimetrik;

import java.util.Arrays;

public class SortArray1_0s {

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 1, 2, 0, 1, 2, 0 };
		//Arrays.sort(arr);
		

		sorting(arr);
		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i]+",");

	}

	private static int[] sorting(int[] arr) {
		// 2
		int zeroPointer = 0, onePointer = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 0) {
				zeroPointer++;
			}
			if (arr[i] == 1) {
				onePointer++;
			}

		}
		for (int i = 0; i < zeroPointer; i++) {
			arr[i] = 0;
		}
		for (int i = zeroPointer; i < (onePointer + zeroPointer); i++) {
			arr[i] = 1;
		}
		for (int i = (onePointer + zeroPointer); i < arr.length; i++) {
			arr[i] = 2;
		}
		return arr;

	}

}
