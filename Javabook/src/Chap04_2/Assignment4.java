package Chap04_2;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int l=1;
		int a=1;
		for(int k=0;k<3;k++) {
			System.out.println("********"+"\t"+"********"+"\t"+"*******"); 
			System.out.println("구구단 "+num+ "단" + "\t\t" + "구구단" + (num+3) + "단" + "\t\t" + "구구단" + (num+6) + "단");  
			System.out.println("********"+"\t" + "********"+"\t"+"*******");
			
			for(int i=0;i<9;i++) {
			
				for(int j =0 ; j<3;j++) { 
					a=j*3;
					System.out.printf((l+a) + "*" + (i+1) + "=" + (i+1)*(l+a) + "\t\t"); 
				}
				System.out.println("");
			}
			l += 1;
			num += 1; 
		}
		

	}

}
