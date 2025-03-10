package com.hexa.demo;

import java.util.Scanner;

public class LinearSearch {
	static int[] arr= {5,15,20,25,30,35,40};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		
         int key=sc.nextInt();
         int ind=linearSearch(key);
         if(ind>=0) {
        	 System.out.println("Found in index "+ ind);
         }
         else {
        	 System.out.println("Not found");
         }

	}
	

	public static int linearSearch(int searchKey) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==searchKey) return i;
		}
		return -1;
	}
}
