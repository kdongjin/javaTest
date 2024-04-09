package javatest;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//변수
		Scanner sc = new Scanner(System.in); 
		int age = 0; 
		String result = null; 
		
		//입력
		System.out.print("당신나이는>>");
		age = sc.nextInt();
		
		//계산(성인인지 청소년인지 구분한다)
		if(age >= 19) {
			result = new String("성인입니다");
		}else {
			result = new String("청소년입니다");
		}
	
		//출력  당신의 age는 성인입니다.  당신의 age는 청소년입니다.
		System.out.println("당신의 "+age+"는 "+result+"");
	}

}






