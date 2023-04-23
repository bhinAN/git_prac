package Chap07;

public class Dog {
	public String breed;//public 접근제한자로 선언된 String 변수
	public String color;//public 접근제한자로 선언된 String 변수
	protected int age;//protect 접근제한자로 선언된 int 변수
	private String name;//private 접근제한자로 선언된 String 변수
	
	
	public void bowwow() {//Dog 클래스의 public 접근 제한자 멤버 메서드
		System.out.println("멍멍 짓다");
	}
	
	protected void run() {//Dog 클래스의 protect 접근 제한자 멤버 메서드
		System.out.println("달리다");
	}
	
	void sleep() {//Dog 클래스의 default 접근 제한자 멤버 메서드
		System.out.println("잠을 자다");
	}
	
}
