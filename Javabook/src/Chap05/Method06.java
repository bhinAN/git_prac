package Chap05;

public class Method06 {
	public static int sum(int x, int y) {
		return(x+y);//매개변수가 2개인 메서드 sum
	}
	public static int sum(int x, int y, int z) {
		return (x+y+z);//매개변수가 3개인 메서드 sum
	}
	public static double sum(double x, double y) {
		return(x+y);//매개변수가 2개이지만 자료형이 실수형인 메서드 sum
	}
	//매서드명이 같지만 매개변수의 자료형이 다르거나 개수가 다름
	//->메서드 오버로딩
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum(10,20)의 값 : "+ sum(10, 20));//첫 번째 메서드 호출
		System.out.println("sum(10,20,30)의 값 : "+ sum(10, 20,30));//두 번째 메서드 호출
		System.out.println("sum(10.5,20.5)의 값 : "+ sum(10.5, 20.5));//세 번째 메서드 호출
	}

}
