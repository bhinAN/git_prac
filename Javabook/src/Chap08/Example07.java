package Chap08;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 5;
		double c = 11.12;
		double d = 21.34;
		Calculate obj = new Calculate();
		System.out.println
		(obj.add(a, b));
		System.out.println
		(obj.add(c, d));
		//둘다 같은 이름의 메서드를 호출 하지만 하나는 정수형, 하나는 실수형으로 매개변수를 input
		//다른 결과 값이 도출되는 것을 확인
		//이것을 메서드 오버로딩이라고 함

	}

}
