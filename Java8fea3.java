package com.Java8features;

interface In3 {
	public int squareit(int n);
}

public class Java8fea3 {

	public static void main(String[] args) {
		
//		In3 i =(n) -> n * n;
//			System.out.println(i.squareit(10));
		
		
		In3 i =(n) -> {
			return n*n;
		};
		System.out.println(i.squareit(100));
	}

}
