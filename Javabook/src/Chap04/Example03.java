package Chap04;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20; // int 형 변수에 20 할당
		
		if(num == 10) {
			System.out.println("숫자가 10입니다.");//만약 10이라면 이 문장 실행
		}
		else if(num == 15) {
			System.out.println("숫자가 15입니다.");//만약 15이라면 이 문장 실행
		}
		else if(num == 20) {
			System.out.println("숫자가 20입니다.");//만약 20이라면 이 문장 실행
		}
		else {
			System.out.println("숫자가 존재하지 않습니다.");//위의 조건을 모두 만족하지 않는다면 이 문장 실행
		}

	}

}
