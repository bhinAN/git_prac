package Chap08;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitten objKitten = new Kitten();
		objKitten.meow2();
		objKitten.meow();
		objKitten.eat();
		//Animal 클래스의 자식 클래스인 Cat 클래스의 자식 -> Kitten 클래스의 객체 objKitten
		//Animal 클래스의 메서드, Cat 클래스의 메서드 모두 사용가능
	}

}
