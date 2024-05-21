package com.operators;

public class InstanceVEx {
	//int a=3;
		//int b=4;
		
		
		void add(int a,int b){
			
			//int a=2;
			//int b=3;
			System.out.println(a+b);
		}
		
		void sub(int a,int b) {
			//int a=3;
			//int b=4;
			System.out.println(a-b);
		}
		void mul(int a,int b) {
			//int a=3;
			//int b=4;
			System.out.println(a*b);
		}
		void div(int a, int b) {
			//int a=3;
			//int b=4;
			System.out.println(a/b);
		}
		void mod(int a, int b) {
			//int a=3;
			//int b=4;
			System.out.println(a%b);
		}




		public static void main(String[] args) {
			InstanceVEx i= new InstanceVEx();//object syntax
			//i.add();//calling method or invoking method
			i.add(2, 3);
			i.sub(4, 3);
			i.mul(4, 3);
			i.div(4, 2);
			i.mod(1, 1);
			//i.sub();
			//i.mul();
			//i.div();
			//i.mod();
			

		}
}
