package com.Java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8fea5 {

	public static void main(String[] args) {

//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(30);
//		al.add(3);
//		al.add(10);
//		al.add(15);
//		al.add(20);

		List<Integer> al = Arrays.asList(30,3,10,15,20);
		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		Collections.sort(al);
		System.out.println(al);

	}

}
