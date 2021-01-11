package Array_ALL;

public class array2 {
	public static void main(String[]args) {
		//다차원 배열
		int[][] arr=new int[3][2];
		int[][] arr2 = {{0,0},{0,0},{0,0}}; // arr의 값을 상세하게 나타낸 것
		
		arr[0][0]=1;
		//int[][] arr2 = {{0 ← (이 부분이 1로 바뀌는 것),1},{2,3},{4,5}};
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);

		
		
		
		
		// 수를 대입
		int[][] arr3 = new int[3][2];
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				arr3[i][k]=k+1;
			}
		}
		
		// 대입 수 출력
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.print(arr3[i][k]);
			}
			System.out.println("");
		}
	}
}
