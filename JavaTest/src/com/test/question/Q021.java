package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
//		요구사항
//		태어난 년도를 입력하면 나이를 출력하시오.
//
//		조건..
//		올해를 기준으로 나이를 계산하시오.
//		내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
//		우리나라 나이로 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		Calendar time = Calendar.getInstance();
		int inputTime;
		
		System.out.print("태어난 년도: ");
		inputTime=scan.nextInt();
		
		time.add(time.YEAR, -inputTime);
		
		System.out.printf("나이: %d세", time.get(Calendar.YEAR)+1);
		
		
		
	}
	
	
}




