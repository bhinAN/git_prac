package Chap04;
import java.util.Scanner;
public class Assignment4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while(choice == 1) {
			int a;
			
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();
			
			switch(a%2) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다");
				break;
			}
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하시오");
			
			choice = s.nextInt();
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}

}
