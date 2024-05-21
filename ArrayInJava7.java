package com.array;

public class ArrayInJava7 {
	static void methodOne(double[] d)
	{
		d[2]=25.45;
		d[5]=35.45;
	}
public static void main(String[] args) {
	double[]d=new double[8];
	
	d[2]=10.25;//changing the value of elements at index 2
	d[5]=15.25;
	//ArrayInJava7 ar= new ArrayInJava7();
	methodOne(d);
	System.out.println(d[2]);
	System.out.println(d[5]);
}
}
