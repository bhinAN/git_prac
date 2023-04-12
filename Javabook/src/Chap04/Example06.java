package Chap04;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("매우 우수"); // grade가 'A'일 경우 실행
			break; //'A'일 경우 위의 코드 실행 후 break
		case 'B':
			System.out.println("우수"); // grade가 'B'일 경우 실행
			break; //'B'일 경우 위의 코드 실행 후 break
		case 'C':
			System.out.println("좋음"); //grade가 'C'일 경우 실행
			break; //'C'일 경우 위의 코드 실행 후 break
		case 'D':
			System.out.println("좀 더 열심히"); //grade가 'D'일 경우 실행
			break; //'D'일 경우 위의 코드 실행 후 break
		case 'F':
			System.out.println("미흡"); //grade가 'F'일 경우 실행
			break; //'F'일 경우 위의 코드 실행 후 break
		default: // 위의 조건에 모두 부합하지 않다면
			System.out.println("잘못된 등급"); // "잘못된 등급"을 출력
		}
	}

}
