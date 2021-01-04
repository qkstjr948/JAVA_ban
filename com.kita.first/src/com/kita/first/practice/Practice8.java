package com.kita.first.practice;
import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		// 몇 월인지 입력 해 주세요.
		Scanner scan = new Scanner(System.in);
		int season = scan.nextInt();
		System.out.println(season);
		scan.close();
		
		// 3~5월 : 봄
		// 6~8월 : 여름
		// 9~11월 : 가을
		// 12 ~ 2월 : 겨율
		//n월은 00 입니다.
		String season_name1="겨울";
		switch(season) {
		case 3:case 4:case 5:
			season_name1="봄";
			break;
		case 6:case 7:case 8:
			season_name1="여름";
			break;
		case 9:case 10:case 11:
			season_name1="가을";
			break;
		}
		System.out.println(season_name1+"입니다.");
		
		String season_name2="겨울";
		if(season >= 3 && season <= 5 ) {
			season_name2="봄";
		}
		else if(season >= 6 && season <= 8 ) {
			season_name2="여름";
		}
		else if(season >= 9 && season <= 11 ) {
			season_name2="가을";
		} 
		System.out.println(season+"월은 "+season_name2+ "입니다.");
	}
}
