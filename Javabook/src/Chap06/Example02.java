package Chap06;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {10,20,30,40,50};//배열 선언
		for(int i = 0 ; i < myArr.length; i++) {
			System.out.println(i+"번째 요소값 : "+myArr[i]);
			//배열의 길이 만큼 반복되는 반복문에서 myArr의 i번째 자리의 요소값을 출력
		}
	}

}
