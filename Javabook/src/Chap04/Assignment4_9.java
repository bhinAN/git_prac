package Chap04;

public class Assignment4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=0;
		b=0;
		int t=1;
		while(a !=10)
		{
			while(b != t)
			{
				System.out.printf("*");
				b++;
			}
			a++;
			t++;
			b=0;
			System.out.println("");
		}

	}

}
