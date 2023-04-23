package Chap05;

public class Mehod01 {
	public static void method( ) {
		System.out.println("static 메서드입니다.");
		System.out.println(5+6);
		// static 메서드입니다를 출력하고 그 다음 줄에 5+6의 값을 출력하는 메서드 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("첫 번째 호출 메서드입니다.");
		// 첫번째 호출을 알림
		method();
		//메서드 호출
		System.out.println("두 번째 호출 메서드입니다.");
		//두 번째 호출을 알림
		method();
		//메서드 호출
	}

}
