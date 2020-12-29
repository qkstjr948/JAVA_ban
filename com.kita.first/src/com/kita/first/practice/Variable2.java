package com.kita.first.practice;

public class Variable2 
{
	public static void main(String[]srgs) 
	{
		int num = 5_000_000; // 단위를 보기 편하다!
		System.out.println(num);
		///////////////////////////////////////////////
		int n1 = 10; long n2 = 20 , result2 = n1 + n2;
		System.out.println(result2);
		int result1 = (int)(n1 + n2); // 강제 타입 변화
		System.out.println(result1);
	}
}
