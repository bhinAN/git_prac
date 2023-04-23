package Chap08;

public class Inheritance01 extends Calculation{//Calculation의 자식 클래스 Inheritance01
	
	public void multplication(int x, int y) {//매개변수 x,y를 입력으로 받는 메서드 multplication
		z = x*y;
		System.out.println("두 수의 곱셈 : "+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;//입력할 값
		Inheritance01 obj = new Inheritance01(); // 자식 클래스의 객체 obj 선언
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multplication(a, b);
		//부모 클래스의 메서드를 사용하는 것을 확인할 수 있음
	}

}
