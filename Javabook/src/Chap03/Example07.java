package Chap03;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//캐스팅 형 변환 -> 작은 자료형 변수에 더 큰 자료형 값을 할당할 때는 명시적 유형 캐스팅을 수행
		// 이때 더 큰 자료형 값을 작은 자료형 값에 할당하기 때문에 데이터의 일부가 손실됨
		double d =3.14; // 실수형 변수에 3.14 입력
		long l = (long)d; // 같은 크기의 자료형이지만 long은 정수형이고 double은 실수형이라 long으로 들어갈 때 정수형으로 들어감
		int i = (int)l; // 크기가 더큰 long형의 자료형 값을 int형으로 변환하여 변수 i에 할당
		System.out.println(d); // d출력
		System.out.println(l); // l출력
		System.out.println(i); // i출력
		
 	}

}
