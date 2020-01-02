package com.altimetrik;
// Java program to rotate an array by 
// d elements 

class RotateArray { 
	/*Function to left rotate arr[] of size n by d*/
	//2  to len
	void leftRotate(int arr[], int d, int n) 
	{
		//d is starting pt ie 2 and N =len
		for (int i = 0; i < d; i++) {
			leftRotatebyOne(arr, n); 
			System.out.println("calling : "+i);
		}
		
	} 

	void leftRotatebyOne(int arr[], int n) 
	{ 
		 //{ 1, 2, 3, 4, 5, 6, 7 };
		//n=7
		int i, temp; 
		temp = arr[0]; // 1 temp contain 1
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];//a[i]=3,4,5,6,7,1,2
		}// a[0]=2
		arr[i] = temp; //1
	} 

	/* utility function to print an array */
	void printArray(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		RotateArray rotate = new RotateArray(); 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.leftRotate(arr, 2, 7); 
		rotate.printArray(arr, 7); 
	} 
} 


