package Chap03;

public class Operator04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c;
	
		c=a; // c에 a의 값을 할당
		System.out.println(c); //c출력
		System.out.println(b += a); // b에 a의 값을 더한 값을 b에 할당 
		System.out.println(b -= a); // b에 a의 값을 뺀 값을 b에 할당 
		System.out.println(b *= a); // b에 a의 값을 곱한 값을 b에 할당 
		System.out.println(b /= a); // b에 a의 값을 나눈 값을 b에 할당 
		System.out.println(b %= a); // b에 a의 값을 나눈 나머지 값을 b에 할당 
		

	}

}
