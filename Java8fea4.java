package com.Java8features;

interface In4 {
	void hello(String s);

}

public class Java8fea4 {

	public static void main(String[] args) {

		In4 i = (s) -> System.out.println(s.length());
		i.hello("Java is simple by srikanth");

	}

}
