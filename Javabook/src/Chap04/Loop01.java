package Chap04;
import java.util.Scanner;
public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요");
		
		for(int n=1; n<=5; n++) {//5번 반복하는 반복문
			Scanner s = new Scanner(System.in);
			int num = s.nextInt(); //키보드로 입력받은 값을 num에 할당
			sum += num; // sum = sum + num
		}
		
		System.out.println("합계 : " + sum);
		//반복문이 끝나고 난 후 sum을 출력

	}

}
