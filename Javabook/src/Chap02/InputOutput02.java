package Chap02;

public class InputOutput02 {

	public static void main(String[] args) {
		
		String myName = "홍길동"; //문자형 자료형
		int myAge = 20; // 정수 자료형
		
		System.out.print("이름 : \t" + myName + "\n"); // 문자열 "이름 : "을 출력하고 myName을 이어서 출력한 뒤 이스케이프 문자인 \n을 사용하여 줄바꿈을 사용
		
		// 꼭 + 기호를 사용해 주어야 중간에 변수를 사용할 수 있음
		// 이스케이프 문자 (\t 탭, \n 줄바꿈, \b 백스페이스, \r 캐리지 리턴, \" -> ")
		// (\\ -> \, \' -> ')
		
		
		System.out.print("나이 : \t" + myAge + "\n");  // 문자열 "나이 : "을 출력하고 myAge을 이어서 출력한 뒤 이스케이프 문자인 \n을 사용하여 줄바꿈을 사용
	}

}
