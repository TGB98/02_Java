package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( (iNum1 / iNum2) ); // 2		iNum1 iNum2
		System.out.println( (int)dNum ); // 2	dNum
		
		System.out.println( (double)(2*iNum2)+(int)dNum ); // 10.0		iNum2 dNum
		System.out.println( (double)iNum1 ); // 10.0	iNum1
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5		iNum1 iNum2
		System.out.println( dNum ); // 2.5	dNum
		
		System.out.println( (int)fNum ); // 3	fNum
		System.out.println( (int)iNum1 / (int)fNum ); // 3	iNum1 fNum
		
		System.out.println( ch ); // 'A' 	ch
		System.out.println( (int)ch ); // 65 	ch
		System.out.println( (int)ch + iNum1); // 75		ch iNum1
		System.out.println( (char)(int)(ch+iNum1) ); // 'K'	ch iNum1
		
		
	}
}
