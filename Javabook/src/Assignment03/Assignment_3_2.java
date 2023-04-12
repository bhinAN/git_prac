package Assignment03;

public class Assignment_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345"; // 문자열 12345를 문자열 변수 s에 할당
		int i = Integer.parseInt(s); 
		// Integer.parseInt()는 문자열을 정수로 변환하는 메소드로, 문자열을 받아서 해당 문자열을 정수로 변환
		System.out.printf("문자를 숫자로 %d (%d) \n",i,i+10);
		//출력하면 i에 12345라는 정수 값이 할당 되어있는 것을 알 수 있음
		//또한 i+10의 값이 12355로 나오는 것을 알 수 있음
		String a; //문자열 변수 a 선언
		a = String.format("%d",i);
		// String.format()은 문자열을 형식화하는 메소드로, 지정된 형식에 맞게 문자열을 생성.
		// 위의 String.format("%d",i)는 형식 지정자 '%d'를 사용하여 'int'형 변수 'i'의 값을 정수로 형식화한 문자열을 생성하는 것
		System.out.printf("숫자를 문자로 %s (%s) \n",a ,a+"12345");
		//출력하면 정수 12345가 "12345"라는 문자열로 출력되는 것을 확인 할 수 있음
		//a+"12345"가 서로 더해진 값이 아닌 문자열이 이어지는 것을 알 수 있음
	}

}
