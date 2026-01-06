package com.fundamental;


//Naive Approach: A naive solution is to iterate through all numbers from 2 to sqrt(n) and for
//every number check if it divides n. If we find any number that divides, we return false.

public class PrimeNumber {
	
	static boolean isPrime(int num) {
		
		
		//Check num is equal to 1
		if(num<=1) {
			return false;
		}
		
		// Check num is equal to 2
		else if(num==2) {
			return true;
		}
		
		// Check if n is a multiple of 2
		else if (num % 2 == 0)
			return false;
		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
			}
					return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (isPrime(19))
			System.out.println("true");

		else
			System.out.println("false");

	}

}


//Time Complexity: O(sqrt(n))
//Auxiliary space: O(1)
