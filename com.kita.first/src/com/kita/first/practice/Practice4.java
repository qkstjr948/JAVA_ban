package com.kita.first.practice;
import java.util.Scanner; // 스캐너를 데리고 온다 
public class Practice4 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2==1) {System.out.printf("%d은 홀수입니다.\n",num);}
		else {System.out.printf("%d은 짝수입니다.\n",num);}
		
		
		
		// 선생님이 하신 것
		Scanner scan1 = new Scanner(System.in);
		int num1 = scan.nextInt();
		String str = "짝수";
		
		if(num1 % 2 == 1) {
			str = "홀수";
		}
		System.out.printf("%s입니다.",str);
		
		
		
		
		
		
		scan.close(); // scan은 사용할 때 열고 사용이 완료가 되면 닫아주면 된다.
		scan1.close();
	}
}
