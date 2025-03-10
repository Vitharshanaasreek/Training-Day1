package com.hexa.demo;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 10, 12, 5 };
		 
		for (int i = 1; i < 5; ++i) {
			int key = arr[i];
			int j = i - 1;
 
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				--j;
 
			}
 
			arr[j + 1] = key;
		}
		display(arr);

	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

}

	
 