package Chap06;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 2, columns = 3;
		int[][] firstMatrix = { {2, 3, 4}, {3, 2, 1} };//firstMatrix 선언
		int[][] secondMatrix = { {1, 2, 3}, {-4, -2, 1} };//secondMatrix 선언
		
		int[][] sum = new int[rows][columns]; //sum 이차원 배열 선언 
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];//first배열과 second배열의 ixj번째 자리의 값을 서로 더한 값을 sum배열 ixj 자리에 할당
			}
		}
		System.out.println("두 행렬의 합: ");
		for(int i = 0; i < rows; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(sum[i][j]+" ");
			}//sum배열안에 들어있는 모든 값을 하나씩 출력
			System.out.println();
			//한 행을 출력하고 줄 띄움
			
		}
	}

}
