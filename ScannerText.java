package javaEx;

import java.util.Scanner;

public class ScannerText {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String city = scanner.next();

		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();

		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(single);
		
	int time = scanner.nextInt();
	int second = time % 60;
	int minute = (time/60)%60;
	int hour = (time/60)/60;
		
	System.out.print(time + "초는 ");
	System.out.print(second + "시간 ");
	System.out.print(minute + "분 ");
	System.out.print(hour + "초입니다. ");
		
	
	
	
	
	
	
	
		

	}

}
