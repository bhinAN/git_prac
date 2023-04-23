package Chap04_2;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<2;i++)
		{
			if(i==0)
			{
				System.out.printf("첫 번째 숫자를 입력하세요 : ");
				int a = s.nextInt();
				sum += a;
			}
			else if(i==1)
			{
				System.out.printf("두 번째 숫자를 입력하세요 : ");
				int b = s.nextInt();
				sum += b;
			}
		}
		System.out.println("합계 : "+ sum );
	}

}
