package Chap04;
import java.util.Scanner;

public class Assignment4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >");
		Scanner s = new Scanner(System.in);
		int seleted = s.nextInt();
		
		switch (seleted) {
		case 1:
			System.out.println("검색합니다");
			break;
		case 2:
			System.out.println("등록합니다");
			break;
		case 3:
			System.out.println("삭제합니다");
			break;
		case 4:
			System.out.println("번경합니다");
			break;
		}
	}

}
