package Chap04_2;
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //정수를 받을 스캐너 객체s
		Scanner scan = new Scanner(System.in);//사칙연산의 기호를 받을 스캐너 객체 scan
		System.out.printf("첫번째 숫자를 입력하세요: ");//문자열 출력
		int a = s.nextInt();//a에 키보드로 입력받은 정수를 할당
		System.out.printf("사칙연산 기호를 입력하세요: ");//문자열 출력
		String op = scan.nextLine();//op에 키보드로 입력받은 문자열 할당
		System.out.printf("두번째 숫자를 입력하세요: ");//문자열 출력
		int b = s.nextInt();//b에 키보드로 입력받은 정수 할당
		System.out.println(a+"*"+b+"="+(a*b));
		
		
	}

}
