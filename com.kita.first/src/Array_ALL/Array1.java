package Array_ALL;

public class Array1 {
	public static void main(String[]args) {
		 // 배열안에 들어 갈 타입이 뭔지 정해주고 대괄호를 쓴다.
		
		int[] arr1 = new int[4]; // 선언방식1
		arr1[0] = 1;
		arr1[1] = 4;
		arr1[2] = 5;
		arr1[3] = 2;
		
		int[] arr4 = {1,4,5,2}; //선언방식2
		
		int[] arr5; //선언방식3
		arr5 = new int[] {1,2,3};
		
		
		
		
		// 활용
		int[] arr6 = new int[5];
		for(int i=0;i < arr6.length; i++) {
			arr6[i]=i+1;
		}
		for(int i=0;i < arr6.length; i++) {
			System.out.print(arr6[i] + " ");
		}
	} 
}
