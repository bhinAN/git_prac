package Chap06;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =" Java Programming ";
		String s1 ="Java";
		String s2 =" Programming";
		//스트링 풀에 있는 메모리 값을 사용(같은 값이면 같은 메모리 값을 가짐)
		String s3 =s1.concat(s2);//s1 문자열과 s2문자열을 합친 문자열을 s3에 할당
		String s4 =s.trim();//s문자열의 앞, 뒤 공백을 없애고 s4에 할당
		
		System.out.println("s3 " + s3);//s3출력
		System.out.println("s4 " + s4);//s4출력
		System.out.println("s3.equals(s4) " + s3.equals(s4));//s3와 s4과 같은지 확인
	}

}
