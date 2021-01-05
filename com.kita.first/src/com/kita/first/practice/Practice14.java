package com.kita.first.practice;

public class Practice14 {
	public static void main(String[] args) {
		// 구구단 가로로 정렬
		for(int i=2;i<10;i++) {
			for(int k=1;k<10;k++) {
				System.out.printf("%dx%d=%2d",i,k,(i*k));
				if(k < 9)System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
