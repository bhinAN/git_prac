package Chap06;
import java.util.Scanner;
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] units = new int[9][9];
		
		Scanner s = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++)
			{
				units[i][j]=s.nextInt();
			}
		}
		int max = 0;
		int row=0;//최댓값 행의 위치를 기억할 변수
		int column=0;//최댓값 열의 위치를 기억할 변수
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(units[i][j] >= max) {
					max = units[i][j];
					row = i;
					column = j;
				}
			}
		}
		System.out.println("입력된 값 중 최대값은: "+max);
		System.out.println("최대값의 좌표는: "+(row+1)+"행 "+(column+1)+"열");
				
		
		
	}

}
