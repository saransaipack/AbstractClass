package com.constructor;

public class FinalKeyword {
	final String name="saranya";
	String a="vasanth";
	public final void method1() {
		System.out.println(name);
		 String name="Shivaragav";
		System.out.println(a);
		System.out.println(name);
		a="shivanya";
		System.out.println(a);
	}
	public static void main(String[]args) {
		FinalKeyword k=new FinalKeyword();
		k.method1();
		
	}
		
		
	}


