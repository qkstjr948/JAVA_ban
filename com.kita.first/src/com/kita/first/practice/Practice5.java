package com.kita.first.practice;
import java.util.Scanner;
public class Practice5 {
	public static void main(String[] args) {
		
		//수학 응시 유형을 입력해 주세요 : (가/나)
		Scanner scan1 = new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해 주세요 : (가/나)");
		String mathType =scan1.next();
		
		//점수를 입력해 주세요 : 
		Scanner scan2 = new Scanner(System.in);
		int TestPoint = scan2.nextInt();	
		scan1.close();
		scan2.close();
		// 조건	가형 기준 60 나형 기준 70
		/*
		if("가".equals(mathType)) { // 문자를 비교하는 것 
			if(TestPoint==60) {
				//평균
				System.out.println("평균입니다.");
			}
			else if(TestPoint < 60) {
				//평균미만
				System.out.println("평균 미만입니다.");
			}
			else if(TestPoint > 60) {
				//평균초과
				System.out.println("평균 초과입니다.");
			}
		}
		else if("나".equals(mathType)) {
			if(TestPoint==70) {
				//평균
				System.out.println("평균입니다.");
			}
			else if(TestPoint < 70) {
				System.out.println("평균 미만입니다.");
				//평균미만
			}
			else if(TestPoint > 70) {
				System.out.println("평균 초과입니다.");
				//평균초과
			}
		}
		*/
		// 함축화 선생님이 하신 것
		int defaultScore = 70; // 70으로 지정하게 되면 경우가 1개가 줄어든다.
		if("가".equals(mathType) || "나".equals(mathType)) { // 문자를 비교하는 것
			if("가".equals(mathType)) {
				defaultScore = 60; // 가 타입이면 60으로 지정
			}
			if(TestPoint==defaultScore) {
				System.out.println("평균입니다.");
			}
			else if(TestPoint < defaultScore) {
				System.out.println("평균 미만입니다.");
			}
			else if(TestPoint > defaultScore) {
				System.out.println("평균 초과입니다.");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
