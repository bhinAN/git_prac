package Chap02;

public class Datatype01 {

	public static void main(String[] args) {
		
		int a =10; // 정수형 변수 a 선언하고 변수 a에 값 10 집어넣음 int 형은 4바이트
		short s =2; // 정수형 변수 s 선언하고 변수 s에 값 2 집어넣음 short 형은 2바이트
		byte b =6; // 정수형 변수 b 선언하고 변수 s에 값 6 집어넣음 byte 형은 1바이트
		long l = 125362133223L; /* 
		정수형 변수 ㅣ 선언하고 변수 l에 값을 집어넣음 long 형은 선언한 뒤에 L을 적어줘야함 long 형은 8바이트의 크기를 가짐*/
		System.out.println(a); // println 함수로 콘솔에서 집어넣은 변수나 직접 입력한 값을 확인할 수 있음 (System은 class로 꼭 대문자를 붙일것)
		System.out.println(s);// s 변수 출력
		System.out.println(b);
		System.out.println(l);
	}

}
