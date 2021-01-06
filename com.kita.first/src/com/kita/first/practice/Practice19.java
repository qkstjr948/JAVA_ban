package com.kita.first.practice;
import java.util.Scanner;
public class Practice19 {
	public static void main(String[]args) {
		//합 계산기
		Scanner scan = new Scanner(System.in);
		int total=0;
		while(true) {
			//숫자를 입력하세요(0 입력시 종료) :
			// 입력
			System.out.print("숫자를 입력하세요: ");
			int num=scan.nextInt();
			// 입력
			
			// 0입력 후 종료 시 합계를 구하여 출력
			if(num==0) {
				break;
			}
			total+=num; // 입력 후 +
		}
		System.out.println("입력하신 값의 총 합:"+total);
		scan.close();
	}
}
