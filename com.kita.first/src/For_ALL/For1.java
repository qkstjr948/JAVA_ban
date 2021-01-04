package For_ALL;

public class For1 {
	public static void main(String[]args) {
	//		A		B		C 
		for(int i=0;i<5;i++) {
			// D // 알파벳은 실행되는 순서 
			//System.out.println(i+"입니다.");
		}
		
		
		for(int i=0 , k=0;i<5 || k<5;i++ , k++) {
			// D // 알파벳은 실행되는 순서 
			System.out.println("i"+i+"입니다.");
			System.out.println("k"+k+"입니다.");
		}
	}
}
