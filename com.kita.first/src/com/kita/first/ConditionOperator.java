package com.kita.first;

public class ConditionOperator 
{
	public static void main(String[]args) 
	{// 조건 연산자 (삼항 연산자) A ? B : C // 
		int n1 = 3;
		int n2 = 4;
		boolean isOdd1 = (n1 % 2 == 1) ? true : false;
	    // A에 조건을 넣고,, B와C 2가지의 경우가 있다. 이 경우를 정해주는 것이다.
		System.out.println(isOdd1);
		boolean isOdd2 = (n2 % 2 == 1) ? true : false;
		System.out.println(isOdd2);
		
		String result1 = (n1 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(result1);
		String result2 = (n2 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(result2);
	}
}
