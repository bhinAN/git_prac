package Chap03;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; // 정수형 변수 a에 10 입력
		double b = 2.0; // 실수형 변수 b에 2.0 입력
		System.out.println("a + b = " + (a+b));
		//a+b를 출력 이때 정수형 변수와 실수형 변수를 더한 값은 실수형으로 출력
		System.out.println("a - b = " + (a-b));
		//a-b를 출력 마찬가지고 어떤 연산이든 실수형과 정수형을 시키면 실수형으로 나타남
		System.out.println("a * b = " + (a*b));
		//a*b 출력
		System.out.println("a / b = " + (a/b));
		//a/b 출력
		System.out.println("a % b = " + (a%b));
		//a%b 출력
	}

}
