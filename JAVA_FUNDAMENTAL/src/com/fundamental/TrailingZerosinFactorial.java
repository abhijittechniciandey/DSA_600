package com.fundamental;

import java.util.Scanner;

public class TrailingZerosinFactorial {
	
	static long isFact(long num) {
		if(num==0)
			return 1;
		return num*isFact(num-1);
	}
	
	static long istrail(long fact) {
		
		long temp,count=0;
		while(fact>0) {
			temp=fact%10;
			if(temp==0) {
				count++;
				fact=fact/10;
			}
			else {
				break;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		long num=sc.nextInt();
		long factorial=isFact(num);
		System.out.println("The Factorial of num is: "+factorial);
		long count=istrail(factorial);
		System.out.println("the count is: "+count);
		

	}

}
