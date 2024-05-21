package com.operators;

public class OperatorsDemo {
	int a = 10;
	int b=  2;
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public void div()
	{
		System.out.println(a/b);
	}
	public void mod()
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		
		OperatorsDemo b = new OperatorsDemo();
		b.add();
		b.sub();
		b.mul();
		b.div();
		b.mod();
		
	}
}
