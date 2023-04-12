package Chap04;
import java.util.Scanner;
public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // 스캐너 클래스의 객체 s 생성
		int grade = s.nextInt(); // grade에 정수를 키보드로 입력 받음
		
		
		if(grade >= 90) {
			System.out.println("A학점"); //grade가 90이상이면 A
		}
		else if(grade >= 80) {
			System.out.println("B학점"); //grade가 80이상 90미만이면 B
		}
		else if(grade >= 70) {
			System.out.println("C학점"); //grade가 70이상 80미만이면 C
		}
		else if(grade >= 60) {
			System.out.println("D학점"); //grade가 60이상 70미만이면 D
		}
		else {
			System.out.println("F학점"); //grade가 60미만이면 F
		}
		
	}

}
