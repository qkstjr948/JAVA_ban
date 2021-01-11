package com.kita.first.practice;

public class Practice28 {
	public static void main(String[]args) {
		//성적표 만들기
		/*
		 * 영어합계 : ?,평균: ? 00.0 소수점 1자리까지
		 * 수학
		 * 국어
		 * 전체
		 */
		int subject=3;
		int[][]testpoint_array= {
				{90,100,88}, // 국어
				{34,99,45}, // 수학
				{89,65,74} // 영어
		};
		int[] total=new int[subject];
		float[] average=new float[subject];
		int total_last=0;
		float average_last=0;
		
		// 총합과 평균 구하는 구간
		for(int i=0;i<testpoint_array.length;i++) {
			for(int k=0;k<testpoint_array.length;k++) {
				total[i]+=testpoint_array[i][k]; // 총합
				if(k==2)average[i]=(float)total[i]/subject; // 평균
			}
		}
		
		// 각 항목 별 합계와 평균
		String[] languge_array={"국어","수학","영어"};
		for(int i=0;i<subject;i++) {
			System.out.printf("%s[합계]:%2d\t",languge_array[i],total[i]);
			System.out.printf("%s[평균]:%.1f\n",languge_array[i],average[i]);
		}
		
		// 총합과 총 평균
		for(int i=0;i<subject;i++) {
			total_last+=total[i];
			average_last+=average[i]/subject;
		}
		System.out.println("과목[합계]:"+total_last+"	"+"과목[평균]:"+average_last);
	}
}
