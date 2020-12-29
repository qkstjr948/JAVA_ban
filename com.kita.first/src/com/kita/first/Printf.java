package com.kita.first;

public class Printf 
{
	public static void main(String[]args) 
	{ // printf문에 대해서
		/*
		int age =10;
		String name = "김땡땡";
		
		System.out.print("김땡땡은 10살이다.\n");
		System.out.println("김땡땡은 10살이다.");
		System.out.println(name + "은 " + age + "살이다.");
		System.out.printf("%s은 %d살이다.", name,age);
		*/
		
		
		int age = 20;
		String name = "김떙땡";
		int salary = 1_230_000;
		int percent = 50;
		int savings = 615_000;
		char bank = 'A';
		double rateOfInterest = 2.33333333333;
	
		System.out.printf(""
		+ "올해로 %d살이 된 %s은\n"
		+ "알바를 시작하여 매달 %,d만원을 받게 되었다.\n"
		+ "%s은 월급의 %d%%인 %,d원을 떼어\n"
		+ "%c 저축은행의 연 이자율 %f%%짜리 적금에 넣기로 결심했다"
		,age,name,salary,name,percent,savings,bank,rateOfInterest);
	}
}
