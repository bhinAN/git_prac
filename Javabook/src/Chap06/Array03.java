package Chap06;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] marks=new double[2][3];// 2x3배열 선언
		Scanner s = new Scanner(System.in);
		//스캐너 객체 s 선언
		for(int i=0;i<2;i++) {//학생번호가 1이면 1행에 정보를 저장, 2면 2행에 정보를 저장
			System.out.println("학생번호"+(i+1));
			System.out.print("국어점수 : ");
			marks[i][0] = s.nextDouble();
			//국어점수를 키보드로 입력, marks[i][0]에 할당
			System.out.print("수학점수 : ");
			marks[i][1] = s.nextDouble();
			//수핮점수를 키보드로 입력, marks[i][1]에 할당
			marks[i][2] = (marks[i][0]+marks[i][1])/2;
			//수학점수와 국어점수를 더한 값을 2로 나누고 그값을 marks[i][2]에 할당
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("학생번호" + (i + 1)); 
			System.out.print("국어" + ":" + marks[i][0] + " ");
			System.out.print("수학" + ":" + marks[i][1] + " ");
			System.out.println("평균" + ":" + marks[i][2] + " "); 
			}
		//학생번호에 맞는 정보를 출력
	}

}
