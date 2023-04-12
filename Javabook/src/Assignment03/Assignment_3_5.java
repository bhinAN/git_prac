package Assignment03;

public class Assignment_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.123456789f; // float형 변수가 담을 수 있는 크기인 4바이트 보다 더 많은 양이 들어가 뒤에 내용이 손실됨
		double d = 9.123456789; // double형 변수는 8바이트를 담을 수 있어 손실 없이 값이 할당 됨
		double d2 = (double)f; // float형 변수를 double형 변수로 변환하여 변수 d2에 넣음
		
		System.out.println("f= " + f); // 4바이트의 값까지만 출력
		System.out.println("d= " + d); // 할당 된 값이 손실 없이 출력 되는 것을 확인 할 수 있음
		System.out.println("d2= " + d2); // 4바이트 까지 할당 된 값 다음에 나머지 값이 쓰레기 값으로 들어온 것을 확인 할 수 있음
	}

}
