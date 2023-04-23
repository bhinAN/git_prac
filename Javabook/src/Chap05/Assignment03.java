package Chap05;
import java.util.Scanner;
public class Assignment03 {
	public static void max(int x, int y, int z) {
		if(x>=y && x>=z) {
			System.out.println(x + "는 가장 큰 정수입니다.");
		}
		else if(y>=x && y>=z){
			System.out.println(y + "는 가장 큰 정수입니다.");
		}
		else if(z>=x && z>=y) {
			System.out.println(z + "는 가장 큰 정수입니다.");
		}
	}
	public static void min(int x, int y, int z) {
		if(x<=y && x<=z) {
			System.out.println(x + "는 가장 작은 정수입니다.");
		}
		else if(y<=x && y<=z){
			System.out.println(y + "는 가장 작은 정수입니다.");
		}
		else if(z<=x && z<=y) {
			System.out.println(z + "는 가장 작은 정수입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		max(x,y,z);
		min(x,y,z);
	}

}
