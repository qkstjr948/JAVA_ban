package com.kita.first.practice;

public class Practice6 {
	public static void main(String[]args) {
		// 1 ~ 6까지 랜덤 수를 생성	
		int rNum = (int)(Math.random() * 6+1); 
		System.out.println(rNum);
		
		//10 ~ 30
		int rNum2 = (int)(Math.random() * 21 + 10); 
		// 10 ~ 30은 20개이긴 하지만 30을 포함해야하기 떄문에 1을 더해서 시작해야한다
		System.out.println(rNum2);
		
		// 14 ~ 57
		int rNum3 = (int)(Math.random() * 44 + 14); //(최대값 - 최소값) + 시작 값
		System.out.println(rNum3);
	}
}
