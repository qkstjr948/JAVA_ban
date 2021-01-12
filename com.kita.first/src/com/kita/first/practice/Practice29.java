package com.kita.first.practice;
import java.util.Scanner;
public class Practice29 {
	public static void main(String[]args) {
		/////////////////////////////////////////
		// 선언 //
		final int LEN=3;
		int[] randomArr=new int[LEN];
		int[] inputArr=new int[LEN];
		Scanner scan=new Scanner(System.in);
		
		int strike=0;
		int ball=0;
		int out=0;
		
		int same_ball=0;
		/////////////////////////////////////////
	
		
		
		/////////////////////////////////////////
		// 랜덤숫자 생성 * 중복x //
		System.out.println("숫자야구게임 시작!");
		for(int i=0;i<LEN;i++) {
			randomArr[i]=(int)(Math.random()*9)+1;		
			for(int k=0;k<i;k++) {
				if(randomArr[i]==randomArr[k]) {
					i--;
					break;
				}	
			}
		}
		/////////////////////////////////////////
		

		while(true) {
			/////////////////////////////////////////
			// 숫자 입력 //
			System.out.println("숫자를 입력해 주세요.");
			for(int i=0;i<randomArr.length;i++) {
				inputArr[i] = scan.nextInt();
				if(inputArr[i] > 9) { //범위 벗어났을 때 알람
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
					i--;
				}
			}
			/////////////////////////////////////////
			
			
			
			/////////////////////////////////////////
			// 랜덤 숫자 값 출력 //
			for(int i=0;i<LEN;i++) {
				System.out.print(randomArr[i]+" ");
				if(i==(LEN-1)) {
					System.out.println();
				}
			}
			/////////////////////////////////////////
			// 숫자 입력 값 출력 //
			for(int i=0;i<LEN;i++) {
			System.out.print(inputArr[i]+" ");
				if(i==(LEN-1)) {
					System.out.println();
				}
			}
			/////////////////////////////////////////
		
		
		
		
			/////////////////////////////////////////
			// 조건 //
			//스트라이크//
			for(int i=0;i<LEN;i++) {
				if(randomArr[i]==inputArr[i] && randomArr[i]!=0) {
					randomArr[i]=0; //중복방지
					strike++;
				}
			}
			//볼 조건//
			//
			/* 중복 해제하는 조건
			
			ball++ 될때에 
			inputArr 값을 same에 저장 
			그 후 ball의 조건에 same과 다를 때를 넣으면 될 거 같다
			*/ 
			for(int i=0;i<LEN;i++) {
				for(int k=0;k<LEN;k++) {
					if(randomArr[i]==inputArr[k] && randomArr[i]!=0) {
						if(same_ball!=inputArr[k]) {
							same_ball=inputArr[k];
							ball++;
						}
					}
				}
			}
			//아웃 조건//
			out=LEN-(strike+ball);
			//조건 출력//
			System.out.print("스트라이크"+strike+" ");
			System.out.print("볼"+ball+" ");
			System.out.println("아웃"+out);
			// 볼과 아웃은 초기화
			out=0;
			ball=0;
			//strike=0;
			/////////////////////////////////////////
			
			
			
			/////////////////////////////////////////
			// 스트라이크가 3개일 때 브레이크 while문 끝 조건//
			if(strike==3) { 
				break;
			}
			/////////////////////////////////////////
		}
		scan.close();
		System.out.println("끝"); 
	}
}
