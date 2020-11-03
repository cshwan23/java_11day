package javaEx;

import java.util.Scanner;

public class GradingTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100) : ");
				
		char grade;
		
		int score = scanner.nextInt(); //점수읽기
		
		if (score>=60) {
			
			grade = 'D';	
			
		}else if (score>=70) {	
			
			grade = 'C';		
			
		}else if (score>=80) {	
			
			grade = 'B';		
			
		}else if (score>=90) {	
			
			grade = 'A';		
			
		}else{			
			
			grade = 'F';
			
		}
		System.out.println("학점은 " + grade + "입니다.");

	}

}
