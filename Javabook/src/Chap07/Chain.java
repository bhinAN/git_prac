package Chap07;

public class Chain {
	
	Chain(){
		this(10);//this()를 이용한 생성자 체인-> 동일한 클래스 내의 서로 다른 생성자에서 오버로딩된 또 다른 생성자 호출
		System.out.println("기본 생성자 Chain() 호출");
	}
	Chain(int x){
		this(5,6);//생성자 체인-->밑의 생성자 호출
		System.out.println("일반 생성자 Chain(int x) 호출");
		System.out.println("x의 값 : "+x);
	}
	Chain(int x, int y){
		
		System.out.println("일반 생성자 Chain(int x, int y) 호출");
		System.out.println("x와 Y 값 : "+x+" "+y);
		
	}
	

}
