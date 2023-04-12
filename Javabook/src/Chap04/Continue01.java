package Chap04;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=4;i++) {//4번 반복하는 반복문
			for(int j =1;j<=3;j++) {//3번 반복하는 반복문
				if(i==3&&j==2) {//i가 3,j가 2라면 밑의 출력 코드가 작동하지 않음
					continue;
				}
				System.out.println(i + "*"+j);//구구단 식을 출력
			}
		}
	}

}
