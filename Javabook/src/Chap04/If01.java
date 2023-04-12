package Chap04;

import java.util.Scanner;
public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이를 입력하세요."); // 문자열 출력
		
		Scanner s = new Scanner(System.in); //스캐너 클래스의 객체 s 생성
		int age = s.nextInt(); //int 형 변수 age에 정수를 키보드로 입력받음
		
		if(age >= 18) {//age가 18보다 크거나 같다면
		  System.out.println("당신의 나이는 18세 이상입니다.");//if문 안의 문장 실행
		  System.out.println("당신은 투표할 자격이 있습니다");
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");//if문이 실행되든 말든 실행
	}

}
