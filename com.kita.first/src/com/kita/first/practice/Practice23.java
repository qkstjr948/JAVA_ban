package com.kita.first.practice;

public class Practice23 {
	public static void main(String[]args) {
		int[]arr = {34,67,2,11,6,80};
		int box=0;
		// 순차정렬로 만들어 보자 ! 
		for(int i=0; i < arr.length;i++) {
			for(int k=i+1; k < arr.length;k++) {
				if(arr[i] > arr[k]) { // 첫번째가 두번째보다 클때
					box=arr[i];
					arr[i]=arr[k];
					arr[k]=box;
				}
			}
		}
		for(int output : arr) {
			System.out.print(output + ",");
		}
	}
}
