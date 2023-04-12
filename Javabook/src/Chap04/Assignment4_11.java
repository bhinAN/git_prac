package Chap04;

public class Assignment4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {//i가 1부터 9까지 총 9번 반복하는 for문
		
			System.out.println("**********"); // 콘솔화면에서 구구단의 구분을 위해 사용
			System.out.println("구구단 "+i+"단"); //외부 for문이 반복될 때 마다 구구단이 1단~9단으로 한단계 씩 올라감 
			System.out.println("**********");
			for(int j =1 ; j<10;j++) { //j가 1부터 9까지 총 9번 반복하는 for문으로 외부 for문이 1번 작동할 때 9번 반복
				System.out.println(i + "*" + j + " = " + i*j); // 외부 반복문이 1번 작동할 때 9번 반복 함으로 써 외부 반복문이 끝날 때 구구단 1~9단까지 출력 
			}
		}
	}

}
