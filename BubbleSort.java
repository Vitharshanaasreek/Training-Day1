package com.hexa.demo;

import java.util.Scanner;

public class BubbleSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr,n);
		display(arr,n);
		

	}
	public static void display(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");	
			}
		}
	public static void bubbleSort(int[] arr,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
	}
//	public static void swap(int )
	

}
