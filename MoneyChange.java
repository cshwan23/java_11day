package javaEx;

import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {
	
		
//수(금액)를 입력 받아서 오만원권,만원권,오천원권,천원권,500원,100원,10원,1원 메시지 출력.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
//		String money = scanner.next();
		int myMoney = scanner.nextInt(); //점수읽기
		
		int one = 0;
		int ten = 0;
		int fifty = 0;
		int hund = 0;
		int fiveHund = 0;
		int thou = 0;
		int fiveThou = 0;
		int tenThou = 0;
		int fifyThou = 0;
	
		fifyThou = myMoney/50000;
		tenThou = (myMoney%50000)/10000;
		fiveThou = ((myMoney%50000)%10000)/5000;
		thou = (((myMoney%50000)%10000)%5000)/1000;
		fiveHund = ((((myMoney%50000)%10000)%5000)%1000)/500;
		hund = (((((myMoney%50000)%10000)%5000)%1000)%500)/100;
		fifty = ((((((myMoney%50000)%10000)%5000)%1000)%500)%100)/50;
		ten = (((((((myMoney%50000)%10000)%5000)%1000)%500)%100)%50)/10;
		one = ((((((((myMoney%50000)%10000)%5000)%1000)%500)%100)%50)%10)/1;
		
		System.out.println(myMoney + "를 입력하셨습니다.");
		System.out.println("오만원권 " + fifyThou + "장");
		System.out.println("만원권 " + tenThou + "장");
		System.out.println("오천원권 " + fiveThou + "장");
		System.out.println("천원권 " + thou + "장");
		System.out.println("오백원 " + fiveHund + "장");
		System.out.println("백원 " + hund + "개");
		System.out.println("오십원 " + fifty + "개");
		System.out.println("십원 " + ten + "개");
		System.out.println("일원 " + one + "개");

	}
	
//	
//	public static int moneyChanged() {
//		
//		
//		
//		return tenThou
//		
//		
//	}	
//		
		
		
		

		
		

}
