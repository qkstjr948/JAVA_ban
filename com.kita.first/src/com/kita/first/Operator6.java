package com.kita.first;

public class Operator6 
{
	public static void main(String[] args) 
	{ // 논리 !, & , | . && , ||
	 //  비교 == , !=,> , < , >= , <=
		int n1= 5;
		int n2= 5;
		int n3= 6;
		// boolean은 참 OR 거짓을 판단하는 Type
		boolean result1 = (n1 == n2 && n1 == n3 && n2 == n3); // 조건 all 참
		System.out.println(result1);
		System.out.println(!result1); // !는 값을 반대로 하라 입니다.
		System.out.println(!!result1); // !는 값을 반대로 하라 입니다. x2
		boolean result2 = (n1 == n2 || n1 == n3 || n2 == n3); // 조건 one 참
		System.out.println(result2);
	}
}
