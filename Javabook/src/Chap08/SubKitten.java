package Chap08;

public class SubKitten extends SuperCat{
	String age = "2살";
	void printInfo() {
		System.out.println("아기 고양이입니다");
		
	}
	void printDetail() {
		super.printInfo();
		//super 키워드를 사용하여 부모 클래스의 메서드에 접근
		System.out.println("품종은 "+super.breed + ", 나이는 " + super.age);
		//super 키워드를 사용하여 부모 클래스의 변수에 접근
		printInfo();
		//SubKitten 클래스에서 정의한 메서드 
		System.out.println("품종은 "+breed + ", 나이는 " + age);
		System.out.println("품종은 "+this.breed + ", 나이는 " + this.age);
		//SubKitten 클래스에서 정의한 변수를 이용한 출력
		//this 키워드를 사용
	}

}
