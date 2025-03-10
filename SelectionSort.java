package com.hexa.demo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,8,1,6,2};
		
		for(int i=0;i<arr.length-1;i++) {
			int ind=findMin(arr,i,arr.length);
			int tmp=arr[i];
			arr[i]=arr[ind];
			arr[ind]=tmp;
			
		}
		display(arr,arr.length);
		
		

	}
	public static void display(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");	
			}
		}
	public static int findMin(int[] arr,int low,int high) {
		int min=arr[low];
		int ind=low;
		for(int i=low;i<high;i++) {
			if(min>arr[i]) {
				min=arr[i];
				ind=i;
				
			}
		}
		
		return ind;
	}

}
