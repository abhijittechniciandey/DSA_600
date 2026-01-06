package com.fundamental;

//The idea is to consider prime factors of a factorial n. A trailing zero is always produced by prime factors 2 and 5.
//Our task is done if we can count the number of 5s and 2s.

//Trailing 0s in n! = Count of 5s in prime factors of n! = floor(n/5) + floor(n/25) + floor(n/125) + ....


import java.util.Scanner;

public class TrailingZerosinFactorialEfficient {
	
	static int findTrailingZeros(int n) {
		
		if(n<0)
			return -1;
		int count=0;
		
		// Keep dividing n by powers
		// of 5 and update count
		for(int i=5;n/i>1;i*=5) {
			count+=n/i;
		}
		return count;
		
	}
	
	

	public static void main(String[] args) {
		
		int n = 4;
		System.out.println("Count of trailing 0s in " + n
						+ "! is "
						+ findTrailingZeros(n));

	}

}
