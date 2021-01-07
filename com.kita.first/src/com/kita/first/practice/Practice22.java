package com.kita.first.practice;

public class Practice22 {
	public static void main(String[]args){
		
		int[] array_number = new int[100]; // 정수 배열 100 선언
		
		for(int i=0;i<100;i++) { // 정수 배열에 i씩 더해가는 것
			array_number[i] = i+1;
		}
		for(int i=0;i < array_number.length;i++) { // 배열 길이 만큼 i 증가
			System.out.print(array_number[i]); 
			if(i < (array_number.length-1)) { // 배열 길이 -1 즉, 99까지 조건 성립
				System.out.print(","); // 숫자출력은 100개를 하지만 ,출력은 99개를 하는 원리
			}
		}
	}
}
