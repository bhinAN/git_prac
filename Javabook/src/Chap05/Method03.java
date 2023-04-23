package Chap05;

public class Method03 {
	public static int max(int x, int y){
		int result;
		if(x>y) result = x;
		else result = y;
		return result;
	}//정수 두개를 받아와서 더 큰값을 리턴하는 메서드 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6;
		int num = max(a,b);//메서드에 a와 b의 값을 입력하고 리턴값을 num에 할당(a와 b중 더 큰 값을 반환받음)
		System.out.println(a + "(와)과 "+ b +"의 수 중 "+ num +"이 큽니다.");
		//메서드가 제대로 작동하는지 확인
	}

}
