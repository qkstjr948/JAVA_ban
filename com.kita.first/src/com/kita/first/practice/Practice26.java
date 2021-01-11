package com.kita.first.practice;

public class Practice26 {
	public static void main(String[] args){
		// 선언
		int[] array = new int[10];
	
	
		//랜덤 수 생성  
		System.out.println("1~9 랜덤 수 생성");
		for(int i=0;i<9;i++) {
			array[i]=(int)(Math.random()*9)+1;
			for(int k=0;k<i;k++) {
				if(array[i]==array[k]) {
					i--;
					break;
				}
			}
		}
	
		//배열 출력
		for(int i=0;i<9;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	
		//배열 순차정렬
		int box=0;
		for(int i=0;i<9;i++) {
			for(int k=i+1;k<9;k++) {
				if(array[i]>array[k]) {
					box=array[i];
					array[i]=array[k];
					array[k]=box;
				}
			}
		}
		for(int i=0;i<9;i++) {
			System.out.print(array[i]+" ");
		}
	System.out.println();
	}
}
