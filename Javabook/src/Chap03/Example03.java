package Chap03;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x < 10 && x < 20); 
		// x가 10보다 작고 20보다 작은지 확인하고 두 조건 중 하나라도 틀리면 false, 둘다 참이면 true를 출력
		System.out.println(x < 10 || x < 20);
		// x가 10 보다 작고 20 보다 작은지 확인하고 두 조건 중 하나라도 맞으면 true, 둘다 틀리면 false를 출력
		System.out.println(!(x < 10 && x < 20));
		//x가 10 보다 작고 20 보다 작은지 확인하고 두 조건을 and 연산자로 확인한 값을 부정을 통해 반대로 출력
	}

}
