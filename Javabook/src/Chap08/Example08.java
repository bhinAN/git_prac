package Chap08;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		Kitten myKitten = new Kitten();
		myCat.sound();
		myKitten.sound();
		/* 메서드 오버라이딩, 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 특정한 형태로 재정의
		 * 자식 클래스가 부모 클래스로부터 같은 이름, 개수와 유형이 같은 인수, 같은 메서드 반환형을 가진
		 * 메서드를 상속받아서 구현하기 때문에 메서드 재정의라고도 함
		 * ->동일한 기능을 구현한 자식 클래스에서 동일한 메서드를 사용함으로써 코드의 복잡성을 줄이고 일관성을 향상
		 */
	}

}
