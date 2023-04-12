package Chap04;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {//10번 반복하는 반복문
			if(i==5) // 만약 i가 5라면 
				break; // 반복문 탈출
			System.out.println("i : "+i); //아니라면 i의 현재 값을 출력
		}
	}

}
