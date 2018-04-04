package com.git.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("a");
		list.parallelStream().forEach(c-> System.out.println(c));
	}

}
