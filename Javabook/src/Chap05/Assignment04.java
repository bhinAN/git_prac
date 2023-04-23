package Chap05;
import java.util.Scanner;
public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		star(num);

	}
	public static void star(int num) {
		int n =1;
		while(true) {
			for(int i = 1; i<num; i++) {
				System.out.print(" ");
			}
			for(int i= 0; i<n;i++) {
				System.out.print("*");
			}
			System.out.println();
			num = num -1;
			n = n+2;
			if(num<=0) {
				break;
			}
		}
	}

}
