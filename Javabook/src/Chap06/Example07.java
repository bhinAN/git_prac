package Chap06;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		//s1~s3까지 각각의 문자열 할당
		System.out.println(s1 == s2);//문자열이 같은지 확인,같으면 true,다르면 false, s1과 s3는 같음
		System.out.println(s1 != s2);//문자열이 다른지 확인
		System.out.println(s2 == s3);//s1과 s3에 할당된 문자열이 같은지 확인 ->서로 다름
		System.out.println(s2 != s3);//문자열이 서로 다른지 확인
		String s4 = s2 + s3;//s4 문자열 변수에 s2와 s3 문자열 변수에 저장된 값을 합친 값을 할당
		System.out.println(s4);//s4출력
		
	}

}
