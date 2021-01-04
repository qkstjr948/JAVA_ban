package BASIC;

public class Random { // 난수 발생
	public static void main(String[] args) {
		double num = Math.random(); // 0~1 사이의 난수를 하나 발생하는 것 
		System.out.println(num);
		
		int num2 = (int)(Math.random() * 10); // 0 ~ 9 까지 난수 발생
		System.out.println(num2);
		
		int num3 = (int)(Math.random() * 10+1); // 1 ~ 10 까지 난수 발생
		System.out.println(num3);
	}
}
