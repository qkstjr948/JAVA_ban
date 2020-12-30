package com.kita.first;

public class If 
{
	public static void main(String[]args) 
	{ // if문
		int n1 = 3 , n2 = 4;
		boolean isOdd1 = (n1 % 2 == 1) ? true : false;
		String OddNum="짝수";
		if(n1%2==1) {OddNum="홀수";}
		//else {OddNum="짝수";}
		System.out.printf("%d은 %s입니다\n",n1,OddNum);
		
		// if ~ else if ~ else 문
		
		if(n1 > n2) {System.out.println("n1이 n2보다 크다.");}
		else if(n1 == n2) {System.out.println("n1이 n2보다 같다.");}
		else {System.out.println("n1이 n2보다 작다.");}
		
	}
}
