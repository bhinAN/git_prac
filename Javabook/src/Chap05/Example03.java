package Chap05;

public class Example03 {
	public static int add(int x, int y) {
		return x+y;
	}//x와y의 값을 입력받아 x+y의 값을 반환하는 메서드

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6;//정수를 a,b에 할당
		int sum = add(a, b);//a,b를 입력으로 add메서드 호출한 뒤 sum에 리턴값 할당
		System.out.println(a + "와 " + b +"의 합은 "+sum+"입니다.");//a와 b를 더한 값을 출력
	}

}
