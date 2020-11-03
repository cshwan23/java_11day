package javaEx;

public class BitwiseOperationTest {

	public static void main(String[] args) {
		
		
		byte flag = 0b00000010;
		
			System.out.println(flag);

		if ((flag & 0b00001000)==0)
			System.out.println("온도는 0도이하");
		else
			System.out.println("온도는 0도 이상");

		
		
	//피 연산자의 비트들을 이동연산
		
//	        8421	
//		00000000
		
		
//	byte a = 5;
//	byte b = (byte) (a << 2);
//	System.out.println(b);
	
	//
	short a = (short)0x55ff;//16진수의 값을 short형으로 강제합시다.
	//short형은 2바이트 짜리 . 바이트보다 1 크다. 
	short b = (short)0x00ff;
	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println();
	
	System.out.printf("%04x\n", (short)(a & b));
	System.out.printf("%04x\n", (short)(a | b));
	System.out.printf("%04x\n", (short)(a ^ b));
	System.out.printf("%04x\n", (short)(~a));

		
		
		
		
		
		
		

	}

}
