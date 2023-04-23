package Chap06;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = new int[5];//5칸을 가지는 정수형 배열 선언
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		//myArr배열의 0~4칸 까지의 자리에 정수 할당
		for(int i =0; i< myArr.length ; i++)
		{
			System.out.println(i + "번째 요소값 : "+ myArr[i]);
		}
		//배열의 길이만큼 반복되는 반복문에서 i 자리에 있는 myArr값을 출력
	}

}
