package com.array;

import java.util.Scanner;
// natural numbers and their sum and avg
public class SumOfNumbers {
public static void main(String[] args) {
	int i,n,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Input Number");
	n=sc.nextInt(); // 5
	System.out.println("the numbers are " +n);
	for(i=0;i<=n;i++)  // 1 2 3 4 5
	{
		System.out.println(i);
		sum +=i;  // sum = sum + i;
	}
	System.out.println("the sum of numbers are " + n + " "+ sum);
}
}
