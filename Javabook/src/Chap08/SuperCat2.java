package Chap08;

public class SuperCat2 {//SuperCat2 클래스의 생성자
	String name; 
	String age = "15살";
	SuperCat2(String n) {
	name = n;
	System.out.println("부모 고양이입니다." + " 이름은 " + name);
	}
}
