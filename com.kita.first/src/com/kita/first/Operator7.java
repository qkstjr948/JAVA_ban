package com.kita.first;

public class Operator7 { // 문자 비교
	public static void main(String[] args) {
		int n1=3;
		int n2=5;
		
		boolean result1 = (n1 > n2);
		System.out.println(result1);
		
		String str1 = "안녕";
		String str2 = "안녕";
		boolean result2 = (str1 == str2);
		System.out.println(result2);
		
		boolean result3 = "안녕1".equals(str1); // 문자를 비교하는 것
		System.out.println(result3);
	}
}
