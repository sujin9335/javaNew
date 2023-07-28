package com.test.java;

public class Ex22_LocalVariable {

	//멤버 변수
	int b;
	
	public static void main(String[] args) {
		
		//지역 변수
		int a;
		
		
		/*
		
			자바 변수의 종류
			1. 멤버 변수, Member Variable
				- 클래스 수업
						
			2. 지역 변수, Local Variable
				- 여태까지 수업 변수
			
			지역 변수
			- 메소드내에서 선언한 변수
			- 변수의 선언 위치(***)
			
			지역 변수의 생명 주기, Life Cycle
			- 언제 태어나서(메모리에 생성) ~ 언제 죽는지(메모리에 소멸)
			- 생성 > 변수 선언문이 실행되는 순간
			- 소멸 > 변수 선언문이 포함된 자신의 영역에서 제어가 벗어나는 순간(main 끝나는순간)
		
			
			지역 변수의 영역(Scope)
			- 선언문이 포함된 블럭({})
			
			
		*/
		
		int c;
		
		
		String name="홍길동";
		//String name="아무개";
		
		m1();
		
		//System.out.println(age); // m1 age에서 못가져옴
		
		
		//*** 지역 변수는 초기화를 하지 않으면 사용이 불가능하다.
		int num;
		
		//int result=num+10;
		
//		The local variable num may not have been initialized
//		System.out.println(num);
		
		
		
		
	}//main
	
	public static void m2(String gender) {
		
		//매개변수 == 지역변수
		//String gender; //못함
		
	}
	
	
	public static void m1() {
		
		String name="아무개";
		int age=20;
		System.out.println(age);
		
		
	}
	
	
	
}
