package Chap04;
import java.util.Scanner;

public class Assignment4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt(); // 스캐너 객체 s에 정수를 받아 num으로 전달
		
		int num1;
		num1 = num/10;
		
		if(num1==10 || num1 ==9)
		{
			System.out.println("A 학점");
		}
		else if(num1 == 8)
		{
			System.out.println("B 학점"); 
		}
		else if(num1 == 7)
		{
			System.out.println("C 학점"); 
		}
		else if(num1 == 6)
		{
			System.out.println("D 학점"); 
		}
		else
		{
			System.out.println("F 학점"); 
		}
		
	}

}