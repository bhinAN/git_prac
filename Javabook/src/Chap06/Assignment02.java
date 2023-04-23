package Chap06;
import java.util.Scanner;
public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] myArr = new int[5][3];//2차원 배열 선언
		
		String[] subject = {"국어","영어","수학"};//출력에서 과목을 나타낼 때 사용하는 배열 선언
		int sum=0;
		double average;
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf((i+1)+"번 학생의 "+subject[j]+" 점수: ");
				myArr[i][j]=s.nextInt();
			}
			
		}//배열에 키보드로 입력을 받음과 동시에 출력이 될 수 있게 설정
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				sum += myArr[i][j];
			}//행의 값을 모두 더해서 sum변수에 할당
			average=sum/3;//sum을 열의 길이만큼 나눈 값을 average에 할당
			System.out.println((i+1)+"번 학생의 총점: "+sum+","+(i+1)+"번 학생의 평균: "+average);
			//sum과 average 출력
			sum=0;//sum값 초기화([i]행의 값들이 다 더해지면 초기화 함으로써 다음 행의 값에 더해지지 않도록 함)
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

