package Chap04;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16; // int 형 변수에 16 할당
		
		if(num > 15) {// 만약 num이 15보다 크다면 밑에 줄 실행
			System.out.println("숫자가 15보다 큽니다."); // if 조건에 부합하다면 
		}
		System.out.println("이 문장은 if문 외부에 있습니다."); // 그렇지 않다면 이 줄만 실행
	}

}
