package Chap03;

public class Operator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10, c = 10, d = 10; // a, b, c, d에 정수 10을 할당
		
		
		System.out.println("a++ =>" + (a++)); //a의 값을 출력한 다음 a의 값을 1증가
		System.out.println("a =>" + (a)); // a의 값이 1증가 된 상태로 출력이 나오는 것을 확인할 수 있음
		System.out.println("++b =>" + (++b)); // b의 값을 1 증가한 다음 b를 출력
		System.out.println("c-- =>" + (c--)); // c의 값을 출력한 다음 c의 값을 1감소
		System.out.println("--d =>" + (--d)); // d의 값을 1 감소한 다음 d를 출력
	}

}
