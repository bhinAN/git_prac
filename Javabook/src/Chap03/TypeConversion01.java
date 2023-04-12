package Chap03;

public class TypeConversion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동형 변환 -> 작은 자료형을 큰 변수에 할당할 때 더 큰 자료형으로 변환함
		int x = 10;
		double y = 3.0;
		// 정수형과 실수형을 서로 연산 시 실수형으로 결과 값이 도출 
		System.out.println(x + y);
		// x+y값을 실수형으로 출력
		System.out.println(x - y);
		// x-y값을 실수형으로 출력
		System.out.println(x * y);
		// x *y값을 실수형으로 출력
		System.out.println(x / y);
		// x / y값을 실수형으로 출력
	}

}
