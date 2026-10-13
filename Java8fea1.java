package com.Java8features;

@FunctionalInterface
interface In1 {
	public void m1(int a, int b);
}

public class Java8fea1 {

	public static void main(String[] args) {

		In1 t = (a,b) -> {
			System.out.println("hello " + (a+b));

		};

		t.m1(100,200);

	}

}
