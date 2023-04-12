package Chap04;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1; //i에 1을 할당
		do { // i가 6보다 작을 때 까지 do안의 코드 실행
			System.out.println("Hello World");
			//5번 실행
			i++;//1번 실행 할 때 마다 i를 1증가
		} while (i<6) ;//반복문이 1번 반복할 때 마다 i의 값을 확인 후 5보다 크다면 중단
	}

}
