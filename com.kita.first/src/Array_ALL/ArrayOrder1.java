package Array_ALL;

public class ArrayOrder1 {
	public static void main(String[]args) {
		int[] arr= {1,7,45,0,2};
		int temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("arr[0]:" + arr[0]);
		System.out.println("arr[1]:" + arr[1]);
		
		for(int i=0;i < arr.length-1;i++) {
			for(int z=i+1; z<arr.length; z++) {
				//버블정렬 , 순차정렬 , 일반정렬  // 배열길이 5-1
				if(arr[i] > arr[z]) {
					temp = arr[i];
					arr[i]=arr[z];
					arr[z]=temp; 
				}
			}
		}
		for(int num : arr) {
			System.out.print(num+", ");
		}
	}
	// 삼성전자의 발전을 공부... 일본과의 관계를 공부하도록
}
