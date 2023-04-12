package Chap03;

import java.util.Scanner; // Scanner 클래스의 패키지를 임포트
public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in); // System.in 객체와 연결된 Scanner 클래스의 객체 s1를 생성
		System.out.println("정숫값 입력하기"); // 문자열 출력
		int n = s1.nextInt(); //int형 변수 n에 Int형 메서드를 이용하여 키보드로 정수형 데이터를 입력받음
		
		System.out.println("실수값 입력하기");// 문자열 출력
		double db = s1.nextDouble(); //double형 변수 db에 double형 메서드를 이용하여 키보드로 실수형 데이터를 입력받음
		System.out.println("정숫값 : "+ n);//문자열과 키보드로 정수를 입력받은 정수형 변수 n 출력
		System.out.println("실숫값 : "+ db);//문자열과 키보드로 실수를 입력받은 실수형 변수 db 출력
		
		
	}

}
