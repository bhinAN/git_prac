package Chap06;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArr = new int[2][4];//2x4 배열 선언
		myArr[0][0] =2;
		myArr[0][1] =5;
		myArr[0][2] =7;
		myArr[0][3] =4;
		myArr[1][0] =9;
		myArr[1][1] =3;
		myArr[1][2] =2;
		myArr[1][3] =8;
		//myArr배열의 모든 자릿수에 정수를 할당
		int sum1=0,sum2=0;
		for(int i = 0; i<4;i++) {
			sum1 += myArr[0][i];//sum1에 myArr 0행의 값들을 할당
		}
		System.out.println("첫 번째 행의 합계: "+sum1);
		//sum1 출력
		for(int i = 0; i<4;i++) {
			sum2 += myArr[1][i];//sum2에 myArr 1행의 값들을 할당
		}
		System.out.println("두 번째 행의 합계: "+sum2);
		//sum2 출력
	}

}
