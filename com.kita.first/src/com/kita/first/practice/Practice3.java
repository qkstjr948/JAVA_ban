package com.kita.first.practice;

public class Practice3 
{
	public static void main(String[]args) 
	{//+-x/% 에 대한 연습
		int n1 = 10;
		int n2 = 3;
		n1 += n2;
		int result1 = n1;
		n1 = 10;
		n1 -= n2;
		int result2 = n1;
		n1 = 10;
		n1 *= n2;
		int result3 = n1;
		n1=10;
		double result4 = n1 / (double)n2;
		n1=10;
		n1%=n2;
		int result5 = n1;
		
		System.out.println(result1); // 값을 증가 
		System.out.println(result2); // 값의 감소
		System.out.println(result3); // 값의 곱셈
		System.out.println(result4); // 값의 나눗셈
		System.out.println(result5); // 값의 몫
	}
}
