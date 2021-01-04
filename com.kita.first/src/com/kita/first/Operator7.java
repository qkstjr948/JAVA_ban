package com.kita.first;

public class Operator7 { // 문자 비교
	public static void main(String[] args) {
		
		/*
		int n1=3;
		int n2=5;
		
		
		boolean result1 = (n1 > n2);
		System.out.println(result1);
		*/
		
		String str1 = "안녕";
		String str2 = "안녕"; // str1과 내용물이 같기 때문에 주소는 같다라고 인식하게 됨
		String str3 = new String("안녕"); // NEW 가 들어가게 되면 내용물이 같아도 새로운 주소로 인식
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str3)); // 이퀄스는 내용물의 값을 비교하여 판단
		System.out.println(str1.contentEquals(str3)); // 다른 타입을 비교하여 판단하는 것 
		
		
		/*
		boolean result2 = (str1 == str2);
		System.out.println(result2);
		
		boolean result3 = "안녕1".equals(str1); // 문자를 비교하는 것
		System.out.println(result3);
		*/

	}
}

