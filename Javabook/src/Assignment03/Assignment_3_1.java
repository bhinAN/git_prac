package Assignment03;

public class Assignment_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_year = 0; // int형 변수 k01_year에 0 할당
		int k01_age = 14; // int형 변수 k01_age에 14할당
		
		System.out.println("결과1: " + k01_year); // 문자열을 출력하고 동시에 k01_year에 할당 되어있는 값을 출력
		System.out.println("결과2: " + k01_age); //문자열을 출력하고 동시에 k01_age에 할당 되어있는 값을 출력
		
		k01_year = k01_age + 2000; // k01_year에 k01_age와 2000을 더한 값을 할당
		k01_age = k01_age + 1; // k01_age에 k01_age와 1을 더한 값을 할당
		
		System.out.println("결과3: " + k01_year); // 문자열을 출력하고 동시에 k01_year에 할당 되어있는 값을 출력
		System.out.println("결과4: " + k01_age); //문자열을 출력하고 동시에 k01_age에 할당 되어있는 값을 출력
	}

}
