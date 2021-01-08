package com.kita.first.practice;
import java.util.Scanner;
public class Practice25 {
	public static void main(String[]args) {
		//자판기게임
		/*
		메뉴 콜라 사이다 캔커피 데자와 환타 웰치스
		가격 900 700 400 500 600 1000
		
		메뉴
		1 콜라 900원
		2
		6
		
		처음에 메뉴를 보여줌 // 이후 메뉴 입력하세요가 나온다. 메뉴 고르면 무엇이 골라졌는지 나온다.. 
		이 동안에 내가 얼마를 사용했는지 합계까지 나오게끔
		*/
		
		/// 선언
		String[] menu = {"정지","콜라","사이다","캔커피","데자와","환타","웰치스"};
		int[] price = {0,900,700,400,500,600,1000};
		Scanner scan = new Scanner(System.in);
		int total=0;
		
		// 메뉴판
		for(int i=0;i<menu.length;i++) {
			System.out.printf("%d.%s %d원\n",i,menu[i],price[i]);
		}
		while(true) {
			System.out.print("메뉴를 입력하세요(0입력 시 종료):");
			int choice_menu=scan.nextInt();
			if(choice_menu==0) {
				break;
			}
			else if(choice_menu < 0 || choice_menu >= 7) {
				System.out.println("잘못 입력 하였습니다.");
				continue;
			}
			else {
				for(int i=1;i <=6;i++) {
					if((choice_menu)==i) {
						System.out.println("입력한 메뉴는 "+ menu[i]+" 입니다.");
						total+=price[i];
					}
				}		
			}
		}
		System.out.println("합계:"+total);
		scan.close();
	}
}
