package SWITCH_ALL;
import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sNum =scan.next();
		String menu;
		switch(sNum) {
		case "일":
			menu = "한식";
			break;
		case "이":
			menu = "중식";
			break;
		case "삼":
			menu = "양식";
			break;
		case "사":
			menu = "일식";
			break;
			
		}
	}
}
