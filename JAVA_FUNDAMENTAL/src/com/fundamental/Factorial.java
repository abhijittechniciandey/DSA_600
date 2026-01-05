package com.fundamental;

import java.util.Scanner;

public class Factorial {
	
	
	static void isfact(int num) {
		
		int res=1;
		int temp=num;
		
		while(temp>0) {
			res=res*temp;
			temp--;
		}
		System.out.println("The facorial number of "+num+" is "+res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		isfact(num);
		sc.close();

	}

}
