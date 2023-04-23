package Chap05;

public class Example05 {
	public static void add(int x, int y) {
		System.out.println(x + "와 " + y + "의 합은 " + (x+y)+"입니다.");
		//x,y의 값을 매개변수로 받아 x+y의 값을 출력
	}//매개변수는 있지만 반환 유형이 없는 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6;
		add(a,b);//add 메서드 호출 (매개변수로 a,b를 입력)
	}

}
