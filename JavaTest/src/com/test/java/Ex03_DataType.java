package com.test.java;

public class Ex03_DataType {

	public static void main(String[] args) {
		
		/*
			
			변수, Variable
			- 개발자가 명령어를 사용해서 메모리에 할당받은 공간
			
			변수 생성하기
			- 공간을 할당 받는 방법
			
			1. 생성하기
				-
		
			학생 1명의 국어 점수를 저장한 후 > 화면에 출력하시오
			1. 데이터의 성질을 파악
				a. 형태 파악 > 정수 > byte, short, int, long
				b. 길이 파악 > 0~100 > byte
		
		*/
		
		//변수 생성, 변수 선언
		//- 변수명 : 메모리 주소 번지의 별명
		byte kor;
		
		//변수 초기화
		//- 변수 =값 
		//- = (대입 연산자, 할당 연산자)
		kor = 100;
		
		//변수 호출, 변수 사용
		System.out.println(kor+" "+System.identityHashCode(kor));
		
		
		
		
	}
	
}
