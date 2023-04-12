package Chap04;

import java.util.Scanner;

public class Assignment4_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0 ; i<10 ; i++) {//10번 반복 하는 for문 한번 반복할 때 마다 i가 1증가
			sum = sum +i;//i가 한번 반복할 때마다 1씩 커짐으로 sum에다가 더해지는 값이 반복될 때 마다 커짐
			//->1+2+3+4+5+6+7+8+9 =45
		}
		System.out.println("sum: " + sum); // 결과값 45
	}

}
