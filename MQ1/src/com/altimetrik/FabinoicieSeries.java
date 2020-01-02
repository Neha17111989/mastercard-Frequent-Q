package com.altimetrik;

public class FabinoicieSeries {

	public static void main(String[] args) {
		int i = 0, j = 1, range = 10, sum = 0;
		for (int k = 0; k <=range; k++) {
			System.out.print(i + " + " );
			sum = i + j;
			i = j;
			j = sum;
		}

	}

}
