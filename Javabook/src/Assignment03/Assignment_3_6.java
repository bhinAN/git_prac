package Assignment03;

public class Assignment_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =2;//x에 2라는 정수 값을 할당
		int y =5;//y에 5라는 정수 값을 할당
		char c = 'A'; // 문자형 변수 c에 'A'를 할당, A의 아스키 코드의 값은 65
		
		System.out.println(1+x < 33); // 1+x는 33보다 작으므로 true 출력
		System.out.println(y >= 5 || x < 0 && x > 2);
		 // y >= 5, x < 0, x > 2가 모두 참인지 거짓인지 확인한 뒤 ||보다 우선순위가 높은 &&가 연산되고 그다음 ||이 연산된다
		System.out.println(y += 10 - x++);
		// y에서 10을 더한 값이 15에서 변수 x를 빼고 출력한 다음 x가 1증가 한다
		System.out.println(!('A' <= c && c <= 'Z'));
		// c에는 'A'의 값이 할당되어 있고 'A'의 아스키 코드 값은 'Z'의 값보다 작다, 따라서 ()안의 값을 연산하면 true가 나오고 이 값을 부정하면 false가 나온다
		System.out.println('C'-c);
		//아스키 코드에서 A와 C의 값 차이는 2가 나기 때문에 출력으로 2가 나온다
		System.out.println(c+1);
		//자동 형 변환이 일어나 c의 아스키 코드 값인 65에 1이 더해진 값인 66이 출력되는 것을 알 수 있음
		System.out.println(c++);
		//일단 변수 c에 들어가 있는 'A'가 출력되고 그다음 1이 증가 c -> 'B'
		System.out.println(c);
		//증가된 값인 'B'가 출력
		System.out.println(++c);
		//'B'에서 1증가 시킨 'C'를 c에 넣고 그다음 출력 ->'C'출력
	}

}
