package com.constructor;

public class Demo {
	public Demo() {                        //default constructor
		
		System.out.println("Saranya");
	}
	public void method1() {
		System.out.println("BE");
	
	}public void method2() {
		System.out.println("TSM college");
	}public Demo (String Name){             //parameterized constructor
		System.out.println("shivanya");	
		} public Demo(int valuenumber) {
			System.out.println(valuenumber);
		}
	public static void main(String[]args) {
		Demo d=new Demo();
		d.method1();
		d.method2();
		Demo d1=new Demo("name");
		d1.method2();
		d1.method1();
d1.method1();

	
		
}}

