package Chap05;

public class Assignment {
	public static void star() {//별을 반복해서 출력해서 반 삼각형 모양이 나오게끔 하는 메서드 생성
		for(int i=0;i<11;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.printf("*");//i가 커질 때 마다 *의 출력 횟수 증가
			}
			System.out.println();
			//줄 띄움
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		star();//메서드 호출
	}

}
