package Chap07;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****학생주소록****");
		Student stObj = new Student();
		new Student();
		stObj.insertRecord(20221004, "홍길순");
		stObj.printInfo();
	}

}
