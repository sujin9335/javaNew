package com.test.question;

import java.util.Arrays;

public class Q063 {

	public static void main(String[] args) {
		
		int[] list=new int[4];
		
		list[0]=10;
		list[1]=20;
		list[2]=30;
		list[3]=40;
		
		String result=dump(list);
		System.out.printf("nums = %s\n", result);
	
	}

	private static String dump(int[] list) {
		String result=Arrays.toString(list);
		
		return result;
	}
	
	
	
}





