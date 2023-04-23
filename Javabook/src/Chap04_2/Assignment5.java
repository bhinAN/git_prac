package Chap04_2;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val; 
		
		for(int i = 0; i<300; i++) //300번 반복하는 for문
		{
			val = 5* i; //반복문의 횟수에 5를 곱한 값을 val변수에 할당
			if(val >= 0 && val < 10) System.out.println("일" + val); // 만약 val이 0이랑 같고 크고 10보다 작다면 일을 출력
			else if(val >= 10 && val < 100) System.out.println("십" + val);// 만약 val이 10이랑 같고 크고 100보다 작다면 일을 출력
			else if(val >= 100 && val < 1000) System.out.println("백" + val);// 만약 val이 100이랑 같고 크고 1000보다 작다면 일을 출력
			else System.out.println("천" + val); // val이 1000보다 크거나 같다면 천 출력
		}
	}

}
