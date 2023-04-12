package Assignment02;

public class SpecialCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println('\''); // " ' " 을 출력하는 이스케이프 문자 \'를 출력한뒤 한줄 띄어주는 println함수를 이용해서 출력
		System.out.println("abc\t123\b456"); // \t -> 탭을 실행하는 이스케이프 문자  \b -> 백스페이스를 사용하는 이스케이프 문자
		System.out.println('\n'); // \n -> 줄 띄움을 실행하는 이스케이프 문자 
		System.out.println("\"Hello\""); // \" -> "를 출력하는 이스케이프 문자
		System.out.println("c:\\"); // \\ -> \를 출력하는 이스케이프 문자
		
		
	}

}
