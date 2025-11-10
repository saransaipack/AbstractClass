package com.constructor;

public class Finalkey2 extends FinalKey {
	public void method() {
		super.method1(name);
		super.method2(100);
	}
	public static void main(String[]args) {
		Finalkey2 f2=new Finalkey2();
		f2.method();
	}

}
