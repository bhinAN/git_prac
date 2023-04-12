package Chap03;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 형 변환
		int i = 100; //정수형 변수에 정수 100을 입력
		long l = i; // 정수형 변수에 정수 100을 옮김
		float f = l; // 실수형 변수에 정수 100을 옮김 이때 실수형 변수에 옮겨지면서 출력 시 실수형으로 표시
		System.out.println(i); // i 출력 -> 정수 출력
		System.out.println(l); // l 출력 -> 정수 출력
		System.out.println(f); // f 출력 -> 실수 출력
	}

}
