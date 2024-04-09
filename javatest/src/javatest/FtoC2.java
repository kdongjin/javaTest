package javatest;

import java.util.Scanner;

public class FtoC2 {

	public static void main(String[] args) {
		//변수
		Scanner sc = new Scanner(System.in); 
		double f = 0.0;
		double c = 0.0;
		int no = 0; 
		
		//입력
		System.out.println("=====================================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("=====================================");
		System.out.print("번호를 선택하시오:");
		no = sc.nextInt();		

		//계산
		if(no == 1) {
			System.out.print("화씨>>");
			f = sc.nextDouble();
			c = 5.0/9.0 *(f - 32.0); 
		}else {
			System.out.print("섭씨>>");
			c= sc.nextDouble();
			f = 9.0/(5.0* c) + 32.0;
		}
		
		//출력
		if(no == 1) {
			System.out.println(""+c+" = 5.0/9.0 *( "+f+" - 32.0)");
		}else {
			System.out.println(""+f+" = 9.0/(5.0* "+c+") + 32.0");
		}
		System.out.println("The end");
	}

}
