package Chap06;

import java.util.Scanner;

public class Assignment12 {

	public static int[] random(int length) {

		int[] randomlotto = new int[length];

		int min = 1;
		int max = 45;
		int x=0;
		while(true) {
			for (int i = 0; i < length; i++) {
				randomlotto[i] = min + (int) (Math.random() * (max));
			}
			for (int i = 0; i < length-1; i++) {
				for (int j = i + 1; j < length; j++) {
					if (randomlotto[i] == randomlotto[j]) {
						x++;
					}
				}
			}
			if (x == 0) {
				break;
			} else {
				x=0;
			}
		}
		return randomlotto;
	}

	public static void result(int[] lotto, int[] random) {

		int a = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[i] == random[j]) {
					a++;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == random[random.length-1]) {
				x = 1;
			}
			
		}
		if (a == 6) {
			y = 1;
		} else if (a == 5) {
			y = 3;
		} else if (a == 5 && x == 1) {
			y = 2;
		}else if (a == 4) {
			y = 4;
		} else if (a == 3) {
			y = 5;
		} else {
			y = 0;
		}
		
		if(y==0) {
			System.out.println("추첨 결과: 꽝 입니다.");
		}
		else {
			System.out.println("추첨 결과: "+y+"등 입니다.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] randomlotto = { 0 };
		int[] lottoIn = new int[6];

		int x = 0;
		while (true) {
			System.out.println("로또 번호를 입력하세요");
			for (int i = 0; i < lottoIn.length; i++) {

				lottoIn[i] = s.nextInt();
			}
			for (int i = 0; i < 5; i++) {
				for (int j = i + 1; j < 6; j++) {
					if (lottoIn[i] == lottoIn[j]) {
						x++;
					}
				}
			}
			if (x == 0) {
				break;
			} else {
				System.out.println("중복 값은 입력할 수 없습니다. 다시 입력해주세요.");
				x=0;
			}
		}
		System.out.print("로또 당첨 번호 :");
		randomlotto = random(lottoIn.length + 1);
		for (int i = 0; i < lottoIn.length+1; i++) {
			System.out.print(randomlotto[i] + " ");
		}
		System.out.println();
		
		result(lottoIn, randomlotto);

	}

}
