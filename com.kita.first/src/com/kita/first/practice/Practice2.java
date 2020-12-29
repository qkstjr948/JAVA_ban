package com.kita.first.practice;

public class Practice2
{
	public	static void main(String[] args) 
	{
		String name = "김반석";
		int age = 23;
		double vision = 0.7;
		char bloodType = 'B';
		
		System.out.print("저의 이름은 ");
		System.out.println(name);
		
		System.out.print("저의 나이는 ");
		System.out.println(age);
		
		System.out.print("저의 시력은 ");
		System.out.println(vision);
		
		System.out.print("저의 혈액형은 ");
		System.out.println(bloodType);
		///////////////////////////////////
		System.out.print("제 이름은 " + name + "이고, 나이는 " + age + 
				"그리고 시력은 " + vision + "이며 혈액형은 " + bloodType + "입니다.\n");
		///////////////////////////////////
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + 
				"그리고 시력은 " + vision + "이며 혈액형은 " + bloodType + "입니다.");
		///////////////////////////////////
		System.out.printf("저의 이름은 %s이고, 나이는 %d입니다. "
				+ "그리고 시력은 %.1f이며 혈액형은 %c입니다."
				,name,age,vision,bloodType);
	}
}
