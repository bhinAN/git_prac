package Chap07;

public class AccessModifier04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		//Dog클래스의 객체 선언
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		//객체와(.)구문을 통해 멤버에 접근
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.color);
		obj.bowwow();
			
	}

}
