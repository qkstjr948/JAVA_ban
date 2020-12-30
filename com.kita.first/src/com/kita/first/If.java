package com.kita.first;

public class If 
{
	public static void main(String[]args) 
	{
		int n1 = 3 , n2 = 4;
		boolean isOdd1 = (n1 % 2 == 1) ? true : false;
		String OddNum="짝수";
		if(n1%2==1) {OddNum="홀수";}
		//else {OddNum="짝수";}
		System.out.printf("%d은 %s입니다",n1,OddNum);
	}
}
