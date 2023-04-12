package Chap03;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b = 10;
		
		System.out.println(a>b); //a가 b 보다 크다면 true, 작다면 false 출력
		System.out.println(!(a>b)); // a가 b보다 작다면 true, 작다면 false 출력
		System.out.println((a==b) && (a==5)); // a가 b랑 같고 a가 5랑 같다면 true출력, 아니라면 false 출력
		System.out.println((a !=b) && (a==5)); // a가 b랑 다르고 a가 5랑 같다면 true 출력, 아니라면 false 출력
		System.out.println(!((a != b) && (a==5))); // a가 b랑 다르고 a가 5랑 같은 조건이 둘다 참이라면 false 아니라면 true 출력

	}

}
