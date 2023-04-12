package Assignment03;

public class Assignment_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 85.4; //double형 변수에 85.4를 할당
		int score = (int)d; //int형 변수에 실수로 할당받은 변수 d를 정수로 캐스팅형 변환하여 할당 
		
		System.out.println("score=" + score); // 캐스팅 형 변환으로 85.4가 85로 변환되어 출력되는 것을 확인할 수 있음
		System.out.println("d=" + d); // 처음에 할당 된 그대로 출력이 된 것을 확인 할 수 있음.

	}

}
