package Chap07;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat catObj = new Cat();//Cat클래스의 객체 생성
		catObj.breed = "페르시안 고양이";
		catObj.color = "흰색";
		//(.)구문을 사용하여 클래스의 멤버에 접근
		System.out.println("품종 :"+catObj.breed);
		System.out.println("색상 : "+catObj.color);
		
	}

}
