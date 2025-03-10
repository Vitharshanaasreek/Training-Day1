package com.hexa.demo;

import java.util.Scanner;

public class BinarySearch {
	static int[] arr= {5,15,20,25,30,35,40};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		
         int key=sc.nextInt();
         int low=0;
         int high=arr.length;
         binarySearch(arr,low,high,key);

	}
	public static void binarySearch(int[] arr,int low,int high,int key) {
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			System.out.println("found in index - "+mid);
		}
		else if(arr[mid]>key) {
			binarySearch(arr,low,mid-1,key);
		}
		else if(arr[mid]<key) {
			binarySearch(arr,mid+1,high,key);
		}
		else {
			System.out.println("Not found");
		}
	}

}
