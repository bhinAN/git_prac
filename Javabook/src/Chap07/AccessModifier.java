package Chap07;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogObj = new Dog();//Dog클래스의 객체 생성
		
		dogObj.breed = "포메라니언";
		dogObj.color = "갈색";
		//(.)구문을 사용하여 dog클래스의 맴버 변수에 접근
		
		System.out.println("강아지 품종 : "+dogObj.breed);
		System.out.println("강아지 색상 : "+dogObj.color);
		//출력
		dogObj.bowwow();
		//(.)구문을 사용하여 dog클래스의 멤버 메서드에 접근
	}

}
