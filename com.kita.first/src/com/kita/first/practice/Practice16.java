package com.kita.first.practice;
import java.util.Scanner;
public class Practice16 {
	public static void main(String[]args) {
		//메뉴뽑기를 한번 한 후에 마음에 들면 Y눌러서 반복을 끝내고 마음에 안 들면 다시 랜덤 뽑기
		String menu1="호르몬야키" , menu2="저스트 텐동" 
				, menu3="치킨" , menu4="피자" 
				, menu5="미소라멘" , menu6="스시";
		do{
			// 1~6까지 랜덤으로 메뉴 뽑기
			int rNum = (int)(Math.random() * 6) + 1;
			System.out.println(rNum); // 메뉴뽑기 1번 실행
			//
			
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
			
			// 대답하는 부분
			Scanner scan = new Scanner(System.in);
			String cotae = scan.next();
			
			
			if("Y".equals(cotae)){
				System.out.println("메뉴선택이 완료 되었습니다.");
				scan.close();
				break;
			}
			else if(cotae == "N"){
				System.out.println("메뉴를 다시 선택하겠습니다.");
			}
			//
		} while(true); // 조건을 만족했을 때 break;
	}
}
