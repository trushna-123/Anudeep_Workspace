package com.accessspecifier;

class ABC
{
	int i;
	void methodABC()
	{
		System.err.println("parent method " +i);
	}
}
class MNC extends ABC
{
	int j;
	void methodMNC()
	{
		System.out.println("child method" +j);
	}
}
class XYZ extends ABC
{
	int k;
	void methodXYZ()
	{
		System.out.println(" great child method "+k);
	}
}
public class Inheritance {
public static void main(String[] args) {
	//ABC a=new ABC();
	//System.out.println(a.i);
	//a.methodABC();
	
	MNC m= new MNC();
	System.out.println(m.j);
	m.methodABC();
	m.methodMNC();
	
	XYZ x=new XYZ();
	System.out.println(x.i);
	//System.out.println(x.j);
	System.out.println(x.k);
	x.methodABC();
	x.methodXYZ();
}
}
