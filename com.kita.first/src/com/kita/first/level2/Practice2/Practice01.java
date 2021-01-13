package com.kita.first.level2.Practice2;

public class Practice01 {
	public static void main(String[]args) {
		
		//printGugudan(2);
		
		// static 없을 시 \\
		Practice01 myGugudan = new Practice01(); // 객체선언
		myGugudan.printGugudan(2); // 객체 이용해서 사용
		
		
		for(int i=3;i<10;i++) {
			myGugudan.printGugudan_All(i); // 객체 이용해서 사용
		}
		
	}
	
	/*
	static void printGugudan(int num) {
		// 구구단 출력
		for(int i=1;i<10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
	*/
	void printGugudan(int num) {
		// 구구단 출력
		for(int i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n",num,i,(num*i));
		}
		System.out.println();
	}
	
	void printGugudan_All(int num) {
		// 구구단 출력
		for(int i=num;i<10;i++) {
			for(int k=1;k<10;k++) {
				System.out.printf("%d x %d = %d\n",i,k,(i*k));
			}
			System.out.println();
		}
	}
}
