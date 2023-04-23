package Chap05;

public class Example06 {
	public static void calculate(int x, int y) {
		System.out.println(x*y);
		//x,y값을 가져와 곱한뒤 출력하는 메서드 이때 매개변수의 자료형이 둘다 정수이고 개수가 2개임
	}
	public static void calculate(int x) {
		System.out.println(x*x);
		//x의 값만 가져와서 제곱을 한뒤 출력하는 메서드 위의 메서드와 이름은 같지만 매개변수의 개수가 1개임
	}
	public static void calculate(int x, double y) {
		System.out.println(x*y);
		// 첫번째 메서드랑 같은 기능을 하지만 y의 값을 정수형이 아닌 실수형으로 받음
	}
	public static void calculate(double x) {
		System.out.println(x*x);
		//두번째 메서드랑 같은 기능을 하지만 x의 값을 실수형으로 받음
	}
	//이렇게 메서드명이 같지만 매개변수가 다른 메서드를 하나의 메서드명으로 정의하는 것을 메서드 오버로딩이라고 함
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(2, 3);//첫 번째 메서드 호출
		calculate(2, 3.14);//두 번째 메서드 호출
		calculate(2);//3 번째 메서드 호출
		calculate(2.5);//4 번째 메서드 호출
		

	}

}
