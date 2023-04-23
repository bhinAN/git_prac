package Chap07;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		//기본 생성자로 객체 선언
		Cat cat2 = new Cat("샴");
		//일반 생성자로 객체 선언->입력값 한개 존재
		Cat cat3 = new Cat("러시안블루","회색");
		//오버로딩 된 생성자 객체 선언 -> 일반 생성자 Cat과 이름이 같지만 들어가는 매개변수가 2개
		//Cat클래스의 객체 선언
		System.out.println("첫 번째 고양이 품종 : "+cat1.breed+"\t색상 : "+cat1.color);
		System.out.println("두 번째 고양이 품종 : "+cat2.breed+"\t색상 : "+cat2.color);
		System.out.println("세 번째 고양이 품종 : "+cat3.breed+"\t색상 : "+cat3.color);
	}

}
