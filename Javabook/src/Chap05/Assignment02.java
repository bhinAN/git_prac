package Chap05;

import java.util.Scanner;

public class Assignment02 {
	public static void Loop() {
		Scanner s = new Scanner(System.in);
		int choice =1;
		while(choice == 1) {
			int a;
			
			System.out.println("숫자를 입력하세요");
			a = s.nextInt();
			
			if(a%2 == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0입력하세요.");
			
			choice = s.nextInt();
			while(!(choice == 1 || choice == 0))
				{
					System.out.println("숫자를 잘못 입력하였습니다, 다시 입력해주세요");
					System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0입력하세요.");
					choice = s.nextInt();
					if(choice == 1 || choice == 0)
					{
						break;
					}
				}
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop();
	}

}
