package com.test.java;

public class Ex35_String {

	public static void main(String[] args) {
		
		/*
		
			문자열
			- 물리적으로는 참조형이지만, 약간의 값형의 성질을 가진다
			1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다
			2. "문자열은 불변(immutable)이다" > 한번 만들어진 문자열은 절대 수정할수 없다
				- 힙영역의 만들어진 문자는 용량을 더 이상 늘릴수 없어서 새로 영영을 만들어 저장한다
					힙영역의 만들어진 문자열은 불변이라 새로 만든다
			3. 문자열은 참조형이다
			
		
		*/
		
//		m1();
//		m2();
		m3();
		
	}

	private static void m3() {

		//String vs StringBuilder
		//문자열에 짧은시간내 조작하고 싶으면 StringBuilder가 빠르다 
		
		
		String s1="홍길동"; // 문자열 리터럴 사용 > 특혜
		String s2=new String("홍길동");
		
		//StringBuilder s3="홍길동"; 안됨
		StringBuilder s3 = new StringBuilder("홍길동");
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		//StringBuilder > 수정작업에 강하다
		
		long begin=System.nanoTime();
		
		//작업
		String txt1="홍길동";
		
		for(int i=0; i<100000; i++) {
			txt1=txt1+"."; //수정 작업
		}
		
		
		
		
		long end=System.nanoTime();
		
		System.out.println(txt1.length());
		System.out.println(end-begin+"ns");
		
		
		begin=System.nanoTime();
		
		StringBuilder txt2=new StringBuilder();
		
		for(int i=0; i<100000; i++) {
			txt2.append("."); //txt2=txt2+"."
		}
		
		
		
		end=System.nanoTime();
		
		System.out.println(end-begin+"ns");
		
		
		
		
		
		
	}

	private static void m2() {

		//문자열은 불변이다 > 되도록 하지 말아야하는 행동
		//1. 문자열의 잦은 수정
		//2. 커다란 문자열의 수정
		
		String txt1 = "홍길동";
		
		
		for(int i=0; i<100; i++) {
			txt1 = txt1 + "님"; //수정
		}
		System.out.println(txt1);
		
		
		txt1 = "홍길동입니다. 홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다."
				+ "홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";
		txt1 = txt1 + "!";
		
		
	}

	private static void m1() {

		//** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다
		int n1=10;	//4btye
		int n2=200000000;//4byte
		
		
		//하나의 메소드안에서 선언된 상수는 같이 사용된다
		String s1 = "홍길동";
		String s2 = "안녀아세요. 홍길동입니다.";
		String s3 = "홍길동";
		String s4 = "홍";
		s4 = s4 + "길동";
		
		System.out.println(s1 == s3); //절대 사용 금지!!
		// true가 나오는 이유는 "홍길동"이라는 내용은 같은 힙영역내 사용
		// s1, s3는 힙영역의 같은 주소를 할당받아 사용해서 주소끼리의 비교가 된다
		System.out.println(s1 == s4); //false
		
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true
		
		s1 = s1+"님"; //홍길동 > 홍길동님
		
		System.out.println(s1);
		System.out.println(s3);
		
		
		
		
	}
}





