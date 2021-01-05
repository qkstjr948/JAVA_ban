package com.kita.first.practice;

public class Practice13 {
	public static void main(String[]args) {
		// 2~9단 세로로 단이 하나 바뀔 때 추가로 개행 한번 더 
		for(int i=2;i<10;i++) {
			for(int k=1;k<10;k++) {
				System.out.printf("%dx%d=%d",i,k,i*k);
				if(k<9 || i<9)System.out.print("\n");
			}
			if(i<9)System.out.print("\n");
		}
	}
}
