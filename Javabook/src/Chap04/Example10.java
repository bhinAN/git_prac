package Chap04;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2 ;i <= 4 ;i++ ) {//i가 2부터 시작해 4까지 1씩 증가하면서 반복
			System.out.println("구구단" + i + "단");// 구구단이 몇단 인지 i를 이용해 표시
			
			for(int j = 1;j <= 10;j++) {//10반복
			System.out.println(i+"*" + j +"="+(i*j));//구구단 식 표시 
			}
		}
	}

}
