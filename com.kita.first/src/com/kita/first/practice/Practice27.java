package com.kita.first.practice;

public class Practice27 {
	public static void main(String[]args) {
		//{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}
		int[][] arr=new int[4][3];
		int cnt=0;
		// 0,0 ,0,1, 0,2 123
		// 1,0 ,1,1, 1,2 456
		// 2,0 ,2,1, 2,2 789
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				arr[i][k]=++cnt;
			}	
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.print(arr[i][k]+" ");
			}	
			System.out.println("");
		}
	}
}
