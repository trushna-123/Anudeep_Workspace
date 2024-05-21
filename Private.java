package com.accessspecifier;
//Access modifier
//Access specifier
//visibility of data  membernfunction
// private, public,protected & default
//  a field or method or constructor can not be accessed outside the class.
//in class body { data members,member function,constructor,class}
// inheritance-
//{single, multiple,multi-level,hirachical,hibrid}
class A         //-> parent
{
	int i;
}
class B extends A      // ->child
{
	
}
{
	 private int i;
	void methodofA()
	{
		System.out.println(i);// private field can be within the class
		B b = new B();//private inner class can be used within the class
	}
	private class B
	{
		
	}
}
public class Private {
public static void main(String[] args) {
	
}
}
