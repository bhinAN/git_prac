package Chap03;

import java.util.Scanner; // Scanner 클래스의 패키지를 임포트
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // 키보드로 데이터를 입력받기 위해 System.in 객체와 연결된 Scanner 클래스의 객체를 생성함
		
		System.out.println("당신의 이름을 입력하세요."); //""안의 문자열 출력
		String name = input.nextLine(); // 한 행의 문자열을 읽어오는 메서드를 사용하여 읽어온 문자열을 문자열 변수 name에 할당
		System.out.println("당신의 이름 : " + name); // name 출력(키보드로 입력한 값이 들어가 있음)
		
		
		
	}

}
