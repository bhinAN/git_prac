package Chap05;

public class Method04 {
	public static void sum() {
		int sum = 0;//sum에 0을 할당
		for(int i=0; i<=10; i++) {
			sum += i;//0부터 10까지 더한 값을 반복문을 통해 sum에 할당
		}
		System.out.println(sum);//sum을 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1부터 10의 합계 : ");
		//메서드를 호출하기 전에 알림
		sum();
		//메서드 호출
	}

}
