package javaEx;

public class Practice02_201103 {

	public static void main(String[] args) {
	
		char a = 'A';
		char b = '글';
		char c = 0x0041;
		char d = '\uae00';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		
		int price = 20_100;
		long cardNumber = 1234_5678_12357_9998L;
		long controlBits = 0b10110100_01011011_10110011;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2_______5;
		
		
		System.out.println(price);
		System.out.println(cardNumber);
		System.out.println(controlBits);
		System.out.println(maxLong);	
		System.out.println(age);
		
		final double PI = 3.14;
		
		double radius = 10.0;
		
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = " + circleArea);		
		
		System.out.println("원의 면적 = " + circleAreaCalc(5.0));	

		System.out.println("원의 면적 = " + circleAreaCalc(10.0));	

		System.out.println("원의 면적 = " + circleAreaCalc(12.3));		
	
	}
	
	public static double circleAreaCalc(double rad) {
		
		final double PI = 3.14;
		
		double circleArea;
		
				circleArea = rad*rad*PI;
		
		return circleArea;
	}

	String str = null;
	
	
	
}
