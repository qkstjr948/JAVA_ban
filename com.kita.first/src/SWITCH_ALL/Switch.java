package SWITCH_ALL;

public class Switch { // 스위치 문
	public static void main(String[]args) {
		int rNum = (int)(Math.random() * 6) + 1;
		String menu;
		switch(rNum) { // 괄호 안에는 변수 그 자체
		
		case 1:
			menu = "한식";
			break;
		case 2:
			menu = "양식";
			break;
		case 3:
			menu = "중식";
			break;
		case 4:
			menu = "일식";
			break;
		case 5:
			menu = "영국식";
			break;
		case 6:
			menu = "독일식";
			break;
		default:
			menu = "러시아식";
		}
		System.out.println(menu);
	}
}
