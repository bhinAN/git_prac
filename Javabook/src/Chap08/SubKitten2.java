package Chap08;

public class SubKitten2 extends SuperCat2 {//SuperCat2의 자식 클래스 SubKitten2
	String name;
	String age = "2살";
	public SubKitten2(String n1, String n2) {
		super(n1);
		this.name = n2; 
		System.out.println("아기 고양이입니다." + " 이름은 " + name);
	}
	//부모 클래스의 생성자를 사용하기 위해 super()를 이용
	//자식 클래스의 생성자 첫 행에 이 명령어가 있어야 함
	/*
	 *  만약 부모 클래스에 매개변수가 없는 생성자가 존재하지 않을 때, 자식 클래스의 생성자가
	 *  명시적으로 호출하지 않으면 컴파일타임 오류가 발생
	 */

}
