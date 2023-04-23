package Chap07;

public class Student {

	int id;
	String name;
	  
	Student(){//기본 생성자 Student()
		System.out.println("기본 생성자 Student() 호출");
	}
	
	Student(int pram1, String pram2){//일반 생성자 Student()
		System.out.println("일반 생성자 Student(...) 호출");
		id = pram1;
		name = pram2;
		
	}
	void insertRecord(int parm1, String parm2) {//클래스 Student의 멤버 메시드
		id = parm1;
		name = parm2;
	}
	void printInfo() {//클래스 Student의 멤버 메시드
		
		System.out.println("아이디: "+id);
		System.out.println("이름: "+name);
	}
		
}
