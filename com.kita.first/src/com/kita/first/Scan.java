package com.kita.first;
import java.util.Scanner;

public class Scan 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt(); // 메소드 : 정수를 입력하면 받아서 num에 넣는 것
		System.out.println(num);
		
		String str = scan.next();
		System.out.println(str);
	}
}
