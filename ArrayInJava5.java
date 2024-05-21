package com.array;

public class ArrayInJava5 
{
	// assignment operator
	// using for lop
	// clone()
public static void main(String[] args) 
{
	int[] a = {12,21,0,5,7};//declaring and initializing an array of ints
	int[] b = a.clone();
	// printing the array elements of b
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	a[2]= 56;
	System.out.println(b[2]);
	a[4]= 100;
	System.out.println(b[4]);
}
}
