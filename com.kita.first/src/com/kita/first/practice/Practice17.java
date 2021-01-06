package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		/*
		*
		**
		***
		****
		*/
		int star=4;
		
		
		//포문 2개
		for(int i=1;i<=star;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		
		
		// 포문 1개
		int fisrt_floor=1;
		int cnt1=0;
		for(int i=1;i<=10;i++) { // 끝나는 지점의 공식만 알면 된다. 10은 미완성...
			
			cnt1++;
			System.out.print("*");
			//System.out.print(fisrt_floor);
			//System.out.print(cnt1);
			if(cnt1==fisrt_floor) {
				System.out.println("");
				fisrt_floor+=1;
				cnt1=0;
			}
			
		}
	}
}

