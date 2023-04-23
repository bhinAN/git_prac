package Chap06;
import java.util.Scanner;
public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myArr;//배열 선언
		myArr = new String[3];//메모리 할당
		
		Scanner s = new Scanner(System.in); //스캐너 객체 s 선언
		
		System.out.println("3개 문자열을 입력하세요.");//문자열 출력
		
		for(int i = 0; i<3; i++) {
			myArr[i] = s.nextLine();//3번 반복해서 배열 i칸에 키보드로 입력한 정수를 할당
		}
		for(int i = 0; i<3; i++) {
			System.out.print(myArr[i]+" "); // 3번 반복해서 배열 i칸의 값을 출력
		}
		
	}

}
