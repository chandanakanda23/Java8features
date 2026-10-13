package com.Java8features;

public class Java8fea2 {

	public static void main(String[] args) {

		Runnable t = () -> {
			for (int i = 1; i < 10; i++) {
				System.out.println("run:" + i);
			}

		};

		Thread th = new Thread(t);
		th.start();

		for (int i = 1; i < 10; i++) {
			System.out.println("main:" + i);
		}

	}

}
