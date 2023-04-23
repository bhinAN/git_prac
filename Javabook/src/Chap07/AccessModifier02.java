package Chap07;

public class AccessModifier02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		//Dog클래스의 객체 생성
		obj.breed = "포메라니언";
		obj.color = "갈색";
		//(.)구문을 사용하여 Dog클래스의 멤버 변수에 접근
		System.out.println("강아지 품종 : "+obj.breed);
		System.out.println("강아지 색상 : "+obj.color);
		//출력
		obj.bowwow();
		obj.age = 10;
		//(.)구문을 사용하여 Dog클래스의 멤버에 접근(메서드, 변수)
		System.out.println("강아지 나이 : "+obj.age);
		obj.run();
		//(.)구문을 사용하여 Dog클래스의 멤버 메서드에 접근		
	}

}
