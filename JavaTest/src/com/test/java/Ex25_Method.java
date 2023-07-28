package com.test.java;

public class Ex25_Method {

	public static void main(String[] args) {
		
		//재귀 메소드, Recursive Method
		//- 메소드 구현부에서 자기 자신을 호출하는 메소드
		//- 구조가 헷갈린다
		//- 파일 디레고리 구조에서 많이 사용
		
		
		
//		m1();
		
		int n=4;
		int result=m2(n);
		System.out.println(result);
		
		
		//팩토리얼
		//4! = 4x3x2x1=24
		
		n=4;
		result = factorial(n); //m2(4)
		
		System.out.printf("%d! = %d\n",n,result);
		
		
	}//main
	
	private static int factorial(int n) {
		
		
		return (n == 1) ? 1 : n * factorial(n-1);
	}

	public static int m2(int n) {
		
		System.out.println("n:"+n);
		
		int result = (n == 1) ? 1: m2(n-1);
		
		return result;
		
	}
	
	
	//재쉬 메소드
	public static void m1() {
		System.out.println("m1");
		m1(); //자기 자신, 재귀 호출, Recursive Call
	}
	
	
}


















