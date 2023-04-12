package Chap04;
import java.util.Scanner;
public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		//Scanner 객체 3개를 만들고 키보드로 정수를 입력받음
		
		if(x>y) {
			if(x>z) {
				System.out.println(x+"는 가장 큰 정수입니다.");
				//입력을 받은 변수의 크기를 비교해 x가 가장 클 경우 안의 코드 실행
			}
			else {
				System.out.println(x+"는 가장 큰 정수가 아닙니다.");
				//z보다 작다면 이 코드를 실행
			}
		}
		else {
			System.out.println(x+"는 가장 큰 정수가 아닙니다.");
			//y보다 작다면 이 코드를 실행
		}
		
		
	}

}
