package com.git.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

	public void toFormatDate(long time){
		String d = new Date(time).toLocaleString();
		System.out.println(d);
	}
	
	public void run(){
		System.out.println("测试merge分支test");
		System.out.println("测试merge分支dev");
		System.out.println("aaaaaaaaa");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("a");
		list.parallelStream().forEach(c-> System.out.println(c));
	}

}
