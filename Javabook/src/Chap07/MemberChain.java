package Chap07;

public class MemberChain {
	String firstName;
	String country;
	int age;
	//Memberchain 클래스의 멤버 변수
	
	public MemberChain() {
		this("홍길순");
	}//this이용하여 클래스의 다른 생성자에서 하나의 생성자를 호출하는 프로세스 생성자 체인 형성

	public MemberChain(String mName) {
		this(mName, 20);
		firstName = mName;
	}//this이용하여 클래스의 다른 생성자에서 하나의 생성자를 호출하는 프로세스 생성자 체인 형성
	
	public MemberChain(String mName, int mAge) {
		country = "대한민국";
		firstName = mName;
		age = mAge;
		System.out.println("이름 :" + firstName + " 나이: "+ age +" 국적 : "+country);

	}//this이용하여 클래스의 다른 생성자에서 하나의 생성자를 호출하는 프로세스 생성자 체인 형성
}
