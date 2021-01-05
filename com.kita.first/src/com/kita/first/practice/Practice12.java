package com.kita.first.practice;

public class Practice12 {
	public static void main(String[]args) { // 별찍기
	
		/// 별찍기해서 오기
		int star = 3;

		int blank = star+4;

		int blank2 = star+1;

		for(int i=1;i<=star;i++) { /// 상단 좌 / 우

				// 상단 좌

			for(int k=blank;k>=i;k--) {

				System.out.print(" ");

			}

			for(int j=0;j<i;j++) {

				System.out.print("*");

			}

 

				//상단 우

			for(int j=0;j<i;j++) {

				System.out.print("*");

			}

			for(int k=blank;k>=i;k--) {

				System.out.print(" ");

			}

			System.out.print("\n");

		}

		

		for(int i=1;i<=star;i++) { /// 날개 좌 / 몸통 / 날개 우

				// 날개 좌

			for(int k=0;k<=i;k++) { 

				System.out.print(" ");

			}

			for(int j=star;j>=i;j--) {

				System.out.print("*");

			}

			

				//몸통

			for(int j=0;j<6;j++) {

				System.out.print("*");

			}

			

			

				// 날개 우

			for(int k=star;k>=i;k--) { 

				System.out.print("*");

			}

			for(int j=0;j<=i;j++) {

				System.out.print(" ");

			}

			System.out.print("\n");

		}

		

		for(int i=1;i<=star;i++) { /// 하단 좌 / 우

				//공간 맞추기 공백

			for(int k=0;k<blank2;k++) { 

				System.out.print(" ");

			}

			

				//하단 좌

			for(int k=star;k>=i;k--) { 

				System.out.print("*");

			}

			for(int j=0;j<i;j++) {

				System.out.print(" ");

			}

			

				//하단 우

			for(int k=0;k<i;k++) { 

				System.out.print(" ");

			}

			for(int j=star;j>=i;j--) {

				System.out.print("*");

			}
			System.out.print("\n");
		}
	}
}
