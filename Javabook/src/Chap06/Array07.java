package Chap06;

public class Array07 {

	public static void main(String[] args) {
		String s1 = new String("Java"); 
		String s2 = new String("Java");
		//스트링 풀이 아닌 히프에 있는 메모리 값을 가짐, 값이 같아도 같은 메모리를 사용하지 않음
		String s3 = s1;
		//s1의 문자열을 s3에 할당
		if(s1 == s2) {
			System.out.println("s1과 s2는 같다");
		}// 다른 메모리의 값을 가져와 할당 하여 같지 않음
		else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		if(s1 == s3) {
			System.out.println("s1과 s3은 같다");
		}// s1의 값을 s3에 넣어 값이 같음
		else {
			System.out.println("s1과 s3은 같지 않다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 값은 같다");
		}
		else {
			System.out.println("s1과 s2의 값은 같지 않다");
			//같은 메모리에 저장된 값을 가져오는 것이 아니라 같지 않다가 출려고딤
		}
	}

}
