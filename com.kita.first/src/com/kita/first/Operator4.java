package com.kita.first;

public class Operator4 
{
	public static void main(String[] args) 
	{ // 산술 연산자
		int n1 = 10;
		int n2 = 3;
		double result1 = (double)n1 / n2;
		System.out.println(result1);
		int result2 = n1 % n2; // 홀짝 구분에 사용, 및 값의 배수 등 ... 
		System.out.println(result2);
	}
}
