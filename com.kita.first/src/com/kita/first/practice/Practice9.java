package com.kita.first.practice;
import java.util.Scanner;
public class Practice9 {
	public static void main(String[]args) { 
		/// 입력
		Scanner scan = new Scanner(System.in);
		int TP = scan.nextInt();
		System.out.println(TP);
		scan.close();
		/// 입력
		
		/// 조건 // ABC 셋 중에 1개를 고릅니다.
		String TP_ABC="D";
		switch(TP/10) {
		case 10: // 새로 추가한 것 
			System.out.print("A+");
			break;
		case 9:
			TP_ABC="A";
			break;
		case 8:
			TP_ABC="B";
			break;
		case 7:
			TP_ABC="C";
			break;
		default:
			if(TP >= 10) {
				System.out.println("잘못 입력하였습니다.");
			} 
		}
		/// 조건
		
		/// 부호 // + OR - 를 추가합니다.
		int sign=TP%10;
		if(sign >= 7) {
			TP_ABC+="+";
		}
		else {
			TP_ABC+="-";
		}
		/// 부호
		
		/// 출력 // 100보다 작을 때 출력합니다.
		if(TP < 100) {
			System.out.println(TP_ABC);
		}
		/// 출력
	}
}
