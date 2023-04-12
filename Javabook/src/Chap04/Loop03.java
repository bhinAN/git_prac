package Chap04;
import java.util.Scanner;
public class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt(); //x에 키보드로 정수를 입력 받음
		int sum =0; 
		
		
		do {
			sum += x;
			x--;
		} while(x>=10); // x가 10보다 작아질 때 까지 위의 do안의 코드를 실행
		System.out.println("합계 : "+sum);
		//결과를 확인
	}

}
