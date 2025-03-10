package com.hexa.demo;

import java.util.Scanner;

public class FactorionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		
         int num=sc.nextInt();
         int sum=sumFactorial(num);
         
         checkFactorial(num,sum);

	}
	public static int sumFactorial(int num) {
		int rem=0;
        int sum=0;
        while(num>0) {
       	 rem=num%10;
       	num=num/10;
       	 sum=sum+findFactorial(rem);
        }
        return sum;
		
	}
	public static int findFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void checkFactorial(int num,int fact) {
		if(num==fact) {
			System.out.println("Factorion");
		}
		else {
			System.out.println("Not Factorion");
		}
	}

}
