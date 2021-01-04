package BASIC;

public class Variable3 
{
	public static void main(String[]args) 
	{ // 타입에 대해서 2
		int n1 = 10;
		double n2 = 5.5;
		float n3 = 5.5f; // 상수로 선언한다는 것
		
		float result1 = n1 + n3; 
		int result2 = (n1 + (int)n3); // 형 변환 
		System.out.println(result1);
		System.out.println(result2);
		System.out.println((int)n3);
		
		int n4 = 4;
		int n5 = 5;
		String n6 = "6";
		System.out.println(n6);
		System.out.println(n4 + n5 + n6); // 문자가 더해지는 개념
		
		System.out.println(1 + 2 + "3");
		System.out.println(1 + "2" + 3);
		System.out.println("1" + 2 + 3);
	}
}
