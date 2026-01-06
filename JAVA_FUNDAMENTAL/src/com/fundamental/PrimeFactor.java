package com.fundamental;

//Prime factor is the factor of the given number which is a prime number. Factors are the numbers
//you multiply together to get another number. In simple words, prime factor is finding which prime
//numbers multiply together to make the original number.

// While n is divisible by 2, print 2 and divide n by 2.
//After step 1, n must be odd. Now start a loop from i = 3 
//to square root of n. While i divides n, print i and divide n by i, increment i by 2 and continue.
//If n is a prime number and is greater than 2, then n will not become 1 by above two steps.
//So print n if it is greater than 2.

public class PrimeFactor {

	public static void primeFactors(int n) {

		// Print the number of 2s that divide n
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n /= 2;
		}
		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			// While i divides n, print i and divide n
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		// This condition is to handle the case when
		// n is a prime number greater than 2
		if (n > 2)
			System.out.print(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 315;
		primeFactors(n);
	}

}

//Time Complexity: O(sqrt(n))
//
//Auxiliary Space: O(1)
