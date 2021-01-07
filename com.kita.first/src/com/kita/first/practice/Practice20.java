package com.kita.first.practice;

public class Practice20 {
	public static void main(String[] args) {
		int cnt=0;
		int total=0;
		while(true) {
			if(cnt==100) {
				break;
			}
			cnt++;
			total+=cnt;
		}
		System.out.println(total);
	}
}
