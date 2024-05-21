package com.modifier;


class A // outer class
{
	private int i ;// data member
	
		private void methodOfA() //method
		{
			System.out.println(i);// private field can be used within class
			B b=new B();// private inner class can be used within class
		}
		private class B //inner class
		{
			
		}
	}
class C extends A
{
	void methodOfB()
	{
		A a=new A();
	}
}
public class PrivateDemo 
{
public static void main(String[] args) {
	
}
}

