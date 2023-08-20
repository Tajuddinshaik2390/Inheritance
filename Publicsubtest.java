package Inheritance;

import accessModifiers.Demo1;

public class Publicsubtest  extends Demo1{
	public void test() {
		System.out.println(value);
		printValue();
	}
	public static void main(String args[]) {
		Publicsubtest p=new Publicsubtest();
		p.test();
	}



}
