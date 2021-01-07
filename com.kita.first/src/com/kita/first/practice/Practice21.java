package com.kita.first.practice;
import java.util.Scanner;
public class Practice21 {
	public static void main(String[]args) {
		//up and down문 // 
		
		//선언
		Scanner scan = new Scanner(System.in);
		int input_number=0;
		String Languge="";
		
		
		//랜덤으로 수를 뽑습니다. 10~90
		int random_number = (int)(Math.random() * 81) + 10;
		System.out.println(random_number);
		
		
		while(true) {
			// 값을 입력하는 부분
			System.out.print("수를 입력해 주세요:");
			input_number=scan.nextInt();
			if(input_number < 10 || input_number > 90) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			
			// 수가 크다면 UP , 작다면 Down // 둘 다 아닐 시 break 
			if(input_number > random_number) {
				Languge="UP";
			}
			else if(input_number < random_number) {
				Languge="Down";
			}
			else {
				break;
			}
			System.out.println(Languge);
		}
		// while문을 빠져나왔다는 건 값이 맞았기 때문에 great
		System.out.println("Great !");
		scan.close();
	}
}
