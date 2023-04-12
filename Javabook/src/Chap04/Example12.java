package Chap04;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {//11번 반복하는 반복문
			if(i==3||i==6||i==9) {//만약 i가 3,6,10중 하나라면 밑의 출력 코드를 실해하지 않음
				continue;
			}
			System.out.print(i+" "); // i 출력
		}
	}

}
