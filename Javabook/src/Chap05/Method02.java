package Chap05;

public class Method02 {
	public static int div() {
		int a = 10, b = 5;//a와 b에 정숫값 할당
		int result = a/b;//a에서 b를 나눈 값을 result에 할당
		
		return result;//result값을 반환
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = div();//num에 div메서드에서 반환한 값을 할당
		System.out.println(num);//num값 출력
	}

}
