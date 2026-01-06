package com.fundamental;

import java.util.Scanner;

public class Palindrome_Number {
	
	static boolean isPalindrome(long num) {
		
		long rev=0;
		long temp=num;
		
		while(temp>0) {
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		return (rev==num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		long num=sc.nextInt();
		if(isPalindrome(num)==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		sc.close();

	}

}
