package Chap07;

public class AccessModifier03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		
		obj.breed = "포메라이언";
		obj.color = "갈색";
		
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.breed);
		obj.bowwow();
		obj.age =10;
		
		System.out.println("강아지 나이 : " + obj.age);
		obj.run();
		
		
		/*
		 * obj.name = "다운";
		 * System.out.println("강아지 나이 : " + obj.age);
		 * obj.sleep();  >>> 같은 패키지, 같은 클래스가 아니라면 작동하지 않는다는 것을 알 수 있다.
		 */
		
		
	}

}
