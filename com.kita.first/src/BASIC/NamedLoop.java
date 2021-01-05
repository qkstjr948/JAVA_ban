package BASIC;

public class NamedLoop {
	public static void main(String[]args) {
		Parent:
		for(int i=0;i<5;i++) {
			Child:
			for(int z=0;z<3;z++) {
				if(z==1) {
					//continue Parent; //break; 와 동일한 값이 나옴
					break Parent; // Parent로 나가라 // EXIT를 지정 해 주는 것인 거 같다. 
				}
				System.out.printf("%d,%d\n",i,z);
			}
		}
	}
}
