package Chap04_2;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		int l=0;
		for(int k=0;k<3;k++) {
			System.out.println("********"+"\t"+"********"+"\t"+"*******");  
			System.out.println("구구단 "+num+ "단" + "\t\t" + "구구단" + (num+1) + "단" + "\t\t" + "구구단" + (num+2) + "단");
			System.out.println("********"+"\t"+"********"+"\t"+"*******"); 
			
			for(int i=0;i<9;i++) {
			
				for(int j =1 ; j<4;j++) { 
					System.out.printf((j+l) + "*" + (i+1) + "=" + (i+1)*(j+l) + "\t\t");  
				}
				System.out.println("");
			}
			l += 3;
			num += 3; 
		}
		
	}

}
