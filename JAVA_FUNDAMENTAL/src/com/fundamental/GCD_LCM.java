package com.fundamental;

public class GCD_LCM {
	
	static int gcd1(int a, int b)
	{
	if (b == 0)
		return a;
	return gcd(a, a % b);
	}
	
	static int gcd(int a, int b) {
		if (a==0)
		 return b;
		
		if(b==0)
		 return b;
		
		if(a==b)
			return a;
		
		if(a>b)
			return gcd(a-b, b);
		
		return gcd(a, b-a);
	}

	public static void main(String[] args) {
		{
			int a = 98, b = 56;
			System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
			
			
			System.out.println("GCD of " + a +" and " + b + " is " + gcd1(a, b));
			
			System.out.println("LCM of " + a +" and " + b + " is " + ((a*b)/gcd1(a, b)));
		}

	}

}

//Time Complexity: O(max(a,b))
//Auxiliary Space: O(max(a,b))


//static int gcd1(int a, int b)
//Time Complexity: O(log(min(a,b))|
//Auxiliary Space: O(log(min(a,b))

