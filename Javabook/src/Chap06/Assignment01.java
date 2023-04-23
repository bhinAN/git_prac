package Chap06;

import java.util.Scanner;
public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] myArr = new int[5];//5칸의 배열 myArr 선언
		int sum = 0;//합계를 위한 변수 선언
		for(int i=0; i<myArr.length ; i++) {
			System.out.printf((i+1)+"번 학생의 국어 점수 : ");
			myArr[i]=s.nextInt();
			sum += myArr[i];
		}//myArr의 인덱스에 키보드로 입력받은 값을 할당, 할당 된 값을 sum변수에 더함
		double average;//평균값
		average = sum/myArr.length;
		//sum값에서 배열 길이만큼 나눈 값을 average에 할당
		System.out.println("합계: "+sum);
		System.out.println("평균: "+average);
		//출력
	}

}
