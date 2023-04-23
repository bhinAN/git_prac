package Chap04_2;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.printf("첫 번째 숫자를 입력하세요 : ");
		int a = s.nextInt();
		System.out.printf("두 번째 숫자를 입력하세요 : ");
		int b = s.nextInt();
		
		int i;
		for(i=(a/3+1);i<=(b/3);i++)
		{
			System.out.printf(i*3 + " ");
		}
		
	}

}
