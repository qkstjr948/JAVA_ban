package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		// 1 ~ 6 총 6개의 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random() * 6) + 1;
		System.out.println(rNum);
		String menu1="호르몬야키" , menu2="저스트 텐동" 
				, menu3="후라이드 잘하는 집" , menu4="처갓 집" 
				, menu5="미소라멘" , menu6="스시";
		
		if(rNum==1) {
			System.out.println(menu1);
		}
		else if(rNum==2) {
			System.out.println(menu2);
		}
		else if(rNum==3) {
			System.out.println(menu3);
		}
		else if(rNum==4) {
			System.out.println(menu4);
		}
		else if(rNum==5) {
			System.out.println(menu5);
		}
		else if(rNum==6) {
			System.out.println(menu6);
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
}
