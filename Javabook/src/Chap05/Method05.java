package Chap05;

public class Method05 {
	public static void calculate(int x, double y) {
		System.out.println(2*x*y);//원의 둘레를 구하는 공식을 메서드에 넣음
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4; //반지름
		double pi = 3.14;//pi값 할당
		System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율 ");//" "안의 문자열 출력
		calculate(a,pi);//메서드에 a와 pi값을 매개변수로 호출
		
	}

}
