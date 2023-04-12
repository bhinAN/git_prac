package Chap03;

public class TypeConversion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//캐스팅 형 변환
		int x = 10;
		double y = 3.0;
		
		System.out.println(x/y); // 정수형 변수와 실수형 변수를 연산 후 출력 -> 실수로 출력
		System.out.println(x/(int)y); // 실수형 변수 y를 int형으로 캐스팅 형 변환 후 연산 -> 정수 출력 
		System.out.println((int)(x/y)); // x와 y를 연산한 값을 정수형으로 캐스팅 형 변환 후 출력 -> 정수 출력
		// 결과값을 확인해 보면 캐스팅 형 변환을 한 경우 소수점 부분이 없어진 것을 확인 할 수 있음 -> 데이터의 일부 손실
	}

}
