package javatest;

import java.util.Scanner;

public class FtoC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//변수선언(디폴트값을부여한다)
		double c = 0.0;
		double f = 0.0;
		
		//입력
		System.out.print("화씨입력(23.0)>>");
		f = scanner.nextDouble(); 
		
		//계산 5.0/9.0*(f-32.0)
		c = 5.0/9.0*(f-32.0); 
		
		//출력 c = 5.0/9.0*(f-32.0)
		System.out.println(""+c+" = 5.0/9.0*("+f+"-32.0)"); 
		
	}

}
