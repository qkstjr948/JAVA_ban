package BASIC;

public class Break {
	public static void main(String[]args) { // for2에 있는 것을 들고와서 예시를 구현
		for(int i=0;i<2;i++) {
			for(int k=0;k<3;k++) {
				for(int j=0;j<3;j++) {
					if(j==1) { // 얘는 조건 만족 시 없어진다고 생각
						break;// 가장 가까운 조건식 , 반복문을 멈추다라는 것 
					}
					System.out.printf("%d,%d,%d\n",i,k,j);
				}
			}
		}
	}
}
