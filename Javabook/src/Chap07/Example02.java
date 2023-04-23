package Chap07;

public class Example02 {
	static void myMethod1() {//정적 메서드(static)
		System.out.println("정적 메서드 호출");
	
	}
	public void myMethod2() {//인스턴스 메서드
		System.out.println("이스턴스 메서드 호출");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod1();//정적 메서드의 경우 객체를 생성하지 않고 바로 사용
		//myMethod2()->인스턴스 메서드의 경우 객체를 생성해야만 사용할 수 있다
		Example02 myObj = new Example02();//객체 생성
		myObj.myMethod2();
		//객체와 (.)구문을 사용하여 클래스의 멤버 메서드에 접근
	}

}
