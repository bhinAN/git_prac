package Chap07;

public class Object01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stObj1 = new Student();
		// Student클래스의 객체 생성
		stObj1.id =20221004;
		stObj1.name = "홍길순";
		stObj1.printInfo();
		//(.)구문을 사용하여 클래스의 멤버에 접근
		Student stObj2 = new Student();
		stObj2.insertRecord(20021005,"홍길동");
		stObj2.printInfo();
		//(.)구문을 사용하여 클래스의 멤버에 접근
	}

}
