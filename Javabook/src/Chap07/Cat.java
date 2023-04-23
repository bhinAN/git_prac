package Chap07;

public class Cat {

	String breed;
	String color;
	//Cat클래스의 멤버 변수
	Cat(){//Cat의 기본 생성자
		System.out.println("Cat() 생성자 호출합니다.");//생성자가 호출 되었을 때 출력되는 메시지
	}
	Cat(String pBreed){//Cat의 일반 생성자
		System.out.println("Cat(...) 생성자 호출합니다");//생성자가 호출 되었을 때 출력되는 메시지
		breed = pBreed;
	}
	Cat(String pBreed, String pColor){//생성자 Cat의 오버로딩(생성자의 이름이 같지만 들어가는 매개변수의 수가 차이남
		System.out.println("Cat(..., ...) 생성자 호출합니다.");//생성자가 호출 되었을 때 출력되는 메시지
		breed = pBreed;
		color = pColor;
		//매개변수의 값을 Cat클래스의 멤버 변수에 할당
	}
	void eat() {//Cat 멤버 메시드
		System.out.println("먹이를 먹다");
		
	}
	void scratch() {//Cat 멤버 메시드
		System.out.println("발톱으로 할퀴다");
	}
	
	void meow() {//Cat 멤버 메시드
		System.out.println("야옹 하고 울다");
	}

}
