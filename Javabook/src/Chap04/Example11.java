package Chap04;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n = 1;n<=5;n++)//5번 반복하는 반복문
		{
			System.out.println("*"); //반복 할 때 마다 *출력
			if(n==2) {
				break;//n=2라면 반복문 탈출
			}
		}
	}

}
