package Chap08;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat objCat = new Cat();
		objCat.meow();
		objCat.eat();
		Dog objDog = new Dog();
		objDog.bark();
		objDog.eat();
		// Cat 클래스의 객체만으로 Animal 클래스의 메서드와 변수들을 사용했던 것과 마찬가지로 Dog 클래스의 객체만으로
		// Animal 클래스의 변수와 메서드를 사용
	}

}
