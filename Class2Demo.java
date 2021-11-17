package com.venkat;

public class Class2Demo {

	public static void main(String[] args) {
		System.out.println("Interface methods..");
		InterfaceDemo in = new ClassDemo();
		in.a();
		in.b();
		
		System.out.println("Class methods..");
		ClassDemo cl =new ClassDemo();
		cl.a();
		cl.b();
		cl.c();

	}

}
