package Chap08;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyCat catObj = new BabyCat();//BabyCat 클래스의 객체 선언
		System.out.println("품종 : "+catObj.breed);
		System.out.println("품종 : "+catObj.color);
		
		catObj.eat();
		catObj.meow();
		//자식 클래스의 객체 만으로 부모 클래스의 메서드와 변수를 사용할 수 있음을 알 수 있음
	}

}
