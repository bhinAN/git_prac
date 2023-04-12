package Chap04;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");//문자열 출력
		
		Scanner s = new Scanner(System.in); //스캐너 클래스의 객체 s 생성
		int num = s.nextInt();//int형 변수 num에 정수형을 키보드로 입력받음
		
		if(num % 2 == 0) {//num이 짝수라면
			System.out.println(num + "은 짝수입니다.");// 이 줄의 문장 실행
		}
		else {
			System.out.println(num + "은 홀수입니다."); // 아니라면 이 줄의 문장 실행
		}
		
		System.out.println("이 문장은 if문 외부에 있습니다."); //if문 안의 문장의 실행이 끝났을 때 이 문장 실행
	}

}
