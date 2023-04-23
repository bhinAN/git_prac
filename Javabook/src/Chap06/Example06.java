package Chap06;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java Programming ";//s에 문자열 할당
		
		System.out.println("s.length() : "+s.length());//문자열의 길이 출력
		System.out.println("s.charAt(1) : " + s.charAt(1));//문자열의 1번째 자리 출력
		System.out.println("s.substring(6) : " + s.substring(6));//문자열의 6번째 자리부터 출력
		System.out.println("s.substring(5,13) : " + s.substring(5,13));//문자열 5번째 자리부터 13번째 자리까지 연속해서 출력
		System.out.println("s.indexOf('P') : " + s.indexOf("P"));// 문자"P"가 있는 자릿수를 출력
		System.out.println("s.toLowerCase() : " + s.toLowerCase());//문자열을 소문자로 출력
		System.out.println("s.toUpperCase() : " + s.toUpperCase());//문자열을 대문자로 출력

	}

}
