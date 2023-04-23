package Chap06;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		//3x5행렬 선언
		for(int i=0; i<3; i++) {
			for(int j=0; j<5;j++) {
				System.out.print(myArr[i][j]+" ");
			}
			//myArr의 값들을 모두 출력 
			System.out.println();
			//행이 넘어갈때 마다 줄 넘김
		}
		System.out.println("myArr[0][1] 값 : "+myArr[0][1]);
		//myArr의 0,1 자리의 값을 출력
	}
}
