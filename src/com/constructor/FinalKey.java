package com.constructor;

public class FinalKey {
	String name="saranya";
	String a="vasanth";
	int b=50;
	int c=100;
		public void method1(String name) {
			System.out.println(name);
			System.out.println(this.name);
			this.name="shivanya";
			System.out.println(a);
			this.a="shivaragav";
		}
		public void method2(int number) {
			System.out.println(a);
			this.a="kalai";
			System.out.println(number);
			System.out.println(name);
			System.out.println(a);
			System.out.println("add="+(b+c));
			System.out.println("sub="+(b-c));
		}
		public static void main(String[]args) {
			FinalKey k1=new FinalKey();
			k1.method1("arun");
			k1.method2(10);
	}

}
