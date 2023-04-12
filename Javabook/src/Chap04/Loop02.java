package Chap04;
import java.util.Scanner;
public class Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice =1;
		Scanner s = new Scanner(System.in); // 스캐너 클래스의 객체 s를 생성 
		while( choice == 1) {//choice가 1이면 계속 반복, 0이면 반복문 탈출
			int a;
			
			System.out.println("숫자를 입력하세요."); 
			a = s.nextInt(); // a에 정수를 키보드로 입력받음
			
			if(a%2 == 2) { // a가 짝수인지 확인
				System.out.println("짝수입니다."); //짝수라면 이 줄의 코드 실행
			}
			else {
				System.out.println("홀수입니다."); //홀수라면 이 줄의 코드 실행
			}
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요");
			
			choice = s.nextInt();
			//choice에 1을 넣을지 0을 넣을지 선택하여 반복문을 끝낼지 말지를 결정
		}
		System.out.println("모든 숫자를 확인했습니다.");
		//반복문을 탈출하면 위의 코드 실행
	}

}
