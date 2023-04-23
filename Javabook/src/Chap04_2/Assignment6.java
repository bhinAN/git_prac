package Chap04_2;

public class Assignment6 {
	public static void main(String[] args) {
		int n =1;
		int m =10;
		
		while(true) {//break가 걸리기 전까지 계속 반복하는 반복문
			for(int i = 0;i<m;i++)System.out.print(" ");
			//m번 만큼 공백을 출력
			for(int i = 0;i<n;i++)System.out.print("*");
			//n번 만큼 * 출력
			System.out.println();
			// 한줄 내림
			m = m-1;
			//출력하는 공백의 갯수를 1- 
			n = n+2;
			//출력하는 별의 갯수를 2+
			if(m<0)break;
			//만약 출력해야 하는 공백의 갯수가 0이 되면 while문 탈출
		}
	}
}
