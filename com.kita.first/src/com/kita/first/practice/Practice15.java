package com.kita.first.practice;

public class Practice15 {
	public static void main(String[]args) {
		/* 
				****
				****
				****
				****
		*/
		int star=4;
		for(int i=0;i<star;i++) {
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		/*
				*
				**
				***
				****
		*/
		for(int i=0;i<=star;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		/*
					*
				   **
				  ***
				 ****
		*/
		for(int i=0;i<=star;i++) {
			for(int k=star;k>i;k--) {
				System.out.print(" ");
			}
			for(int J=0;J<i;J++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		/*
			 	****
			 	***
			 	**
			 	*
	 	*/
		for(int i=0;i<=star;i++) {
			for(int k=star;k>i;k--) {
				System.out.print("*");
			}
			for(int J=0;J<i;J++) {
				System.out.print(" ");
			}
			System.out.printf("\n");
		}
		/*
			 	****
			 	 ***
			 	  **
			 	   *
	 	*/
		for(int i=0;i<=star;i++) {
			for(int J=0;J<i;J++) {
				System.out.print(" ");
			}
			for(int k=star;k>i;k--) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		
		
		
		
		
		
		
		//////////// 포문을 1번만 사용하고 별 찍기
		System.out.println(star*star); //4행 x 4열은 = 16이기 때문에
		for(int i=1;i<=star*star;i++) {
			System.out.print("*");
			System.out.print(i%star);
			if(i%star==0) { /// EX) star가 4일때 i가 증가하며 4가될 경우 4%4는 몫이 0이기 때문에... 그래서 개행문을 넣어준 것 
				System.out.println();
			}
		}
	}
}
