package Chap04;
import java.util.Scanner;
public class Loop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		System.out.print("길이 : ");
		
		int len = s.nextInt(); //스캐너 객체를 이용하여 len에 키보드로 정수를 입력
		
		for(int i=0;i<len;i++)//i가 len보다 작다면 반복
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" "); //역 피라미드 형태를 만들기 위해 공백 생성 이때 공백은 i의 현재 값 만큼 발생
			}
			for(int j = 0; j < (2*len)-1-(i*2);j++) {
				System.out.print("*"); //*을 길이를 2곱한 값에서 1을 뺀 값만큼 출력시키고 한칸 내력갈 때 마다 2의 배수 만큼 줄어듬
			}
			System.out.println(""); //줄을 바꾸기 위해 실행
		}
	}

}
