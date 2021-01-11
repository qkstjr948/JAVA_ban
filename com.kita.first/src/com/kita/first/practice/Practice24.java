package com.kita.first.practice;

public class Practice24 {
	public static void main(String[]args) {
		int[]arr = {34,67,2,11,6,80};
		int min = 0;
		int temp=0;

		// 선택정렬
		for ( int i = 0; i<arr.length;i++ ) {
			min = i; 
			
			for ( int z =i+1; z<arr.length ;z++ ) {	
				if (arr[min] > arr[z]) { 	
					min =z;
				}
				
			}
			System.out.println(min);
			System.out.println();
			System.out.println(i);
			if (min!=i) {
				
				temp=arr[i];
				arr[i] = arr[min];
				arr[min] =temp;
			}
		}
		for( int val:arr) {
			System.out.print(val+" " );
		}

		/*
		// 버블정렬
		int[]arr1 = {5,3,8,1,2,7};
		int box=0;
		for(int one=0; one<arr1.length-1; one++) { // 첫번째 칸
			//System.out.print(one+"\t");
			for(int two=one+1; two<arr1.length; two++) { // 두번째 칸
				//System.out.print(two);
			}
			//System.out.print("\n");
		}
		
		for(int one=0; one<arr1.length-1; one++) { // 첫번째 칸
			for(int two=one+1; two<arr1.length; two++) { // 두번째 칸
				if(arr1[one] < arr1[two]) {// 첫번째가 두번째 보다 클 때 
					box=arr1[one]; //첫번째를 중간에 넣고
					arr1[one]=arr1[two]; //첫번째 자리에 두번째를 넣고
					arr1[two]=box; // 첫번째값을 두번째에 넣는다.
				}
			}
		}
		for(int one=0; one<arr1.length; one++) {
			System.out.print(arr1[one]);
		}
		*/
	}
}
