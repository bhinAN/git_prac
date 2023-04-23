package Chap06;

public class Assignment08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};//배열 선언
		for(int i = 0; i < 101; i++) {//101번 반복(i가 0부터 100까지)
			if(i>=0 && i<10) {//i가 0이상, 10미만이면 일의자리가 앞에 출력이 되도록 설정
			System.out.println(" 일의자리: "+units[i]);
			}
			else if(i >=10 && i < 100) {//i가 10이상, 100미만이면 앞에 십의 자리가 출력
				int i10,i0;
				i10 = i/10;//10의 자리(i의 값을 10으로 나눈 몫을 i10에 넣음 -> ex)54 -> i10 = 5
				i0 = i%10;//1의 자리(i의 값을 10으로 나눈 나머지 값을 i0에 넣음 -> ex)54 -> i0 = 4
				
				if(i0 == 0) {
					System.out.println(" 십의자리: "+units[i10]+"십");//일의 자리에 0이 들어가면 나오지 않도록 설정
				}
				else {
					System.out.println(" 십의자리: "+units[i10]+"십"+units[i0]);//일의 자리가 존재한다면 마지막에 일의 자리가 출력되도록 설정
				}
			}
			else {
				System.out.println("==> " +i);//100이 되면 ""안의 문장이 출력되도록 설정
			}
		}
		}
	}


