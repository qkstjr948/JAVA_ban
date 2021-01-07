package BASIC;

public class Foreach {
	public static void main(String[]args) {
		//2,4,6,8,10,12,14,16,18,20 (10개)
		int[] arr= new int[10];
	
		for(int i=0;i<arr.length;i++) {
			arr[i]+=(i+1)*2;
		}
		for(int k=0;k < arr.length;k++) {
			System.out.println(arr[k]);
		}
	
		
		// 위에 포문을 간략화해서 출력하는 것이 가능한 것 포리치 !
		for(int val : arr) {
			System.out.println(val);
		}
	
	}
}
