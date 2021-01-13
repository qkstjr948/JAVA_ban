package com.kita.first.level2;

public class Calc {
	//구성요소\\
	
	// 필드 // stage
	static int n1 =1; // 정적선언
	final int N2 =3; // 상수선언
	// 생성자
	
	// 메소드 // 명령어의 집합체 // void main(){} 메소드 형식
	
	// 객체란? 실세계로 표현할 때 사물을 칭하는 것 
	// 객체는 각각 다르지만 같은 틀에 있는 개념이다.
	
	
	
	
	
	///////////////////////////////////////
	/*
	public static void powerOn(매개변수 자리) { // 카멜케이스 기법을 써야함
		// 접근 제한자 public static 이것이 붙지 않으면 default 값이 된다. 
		System.out.println("전원을 켭니다.");
	}
	*/
	// 만약 static이 없을 때 \\
	public void powerOn() { 
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() { 
		System.out.println("전원을 끕니다.");
	}
	// default 선언 \\
	void powerOs() { 
		System.out.println("전원 충전 중");
	}
	///////////////////////////////////////
	
	
	
	///////////////////////////////////////
	// 값을 반환하는 방법 \\
	public int sum(int n1 , int n2) { 
		return n1+n2; 
	}
	public int minus(int n1 , int n2) { 
		return n1-n2; 
	}
	public int multiply(int n1 , int n2) { 
		return n1*n2; 
	}
	public float divide(int n1 , int n2) { 
		return (float)n1/n2; 
	}
	///////////////////////////////////////
	

	public static void main(String[]args) { // 메인 메소드
		// 만약 static이 없을 때 객체를 만들어준다. \\
		Calc myCalc = new Calc(); 

		myCalc.powerOn();
		int sum=myCalc.sum(3,2); // 타입 의존
		int minus=myCalc.minus(3,2); // 타입 의존
		int multiply=myCalc.multiply(3,2); // 타입 의존
		float divide=myCalc.divide(3,2); // 타입 의존
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		myCalc.powerOff();
	}
	
	
	
	
	String sos="안녕";
	// 메소드에 static 이라는 정적이 있음... 값이 바뀌지 않아 HEAP에서 꺼내서 계속 사용가능
	// HEAP에 안녕의 객체가 생성
	// 스택에 안녕의 값이 저장
	
	
	
	// 컴파일러가 현재 소스파일 .java의 파일을 변환하여 .class로 바꾸어준다.
}
