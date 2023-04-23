package Chap07;

public class InputDataClient02 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int allperson = 300;
			int pagePerPerson = 30;
			int korsum = 0;
			int engsum = 0;
			int matsum = 0;
			int finSum = 0;
			int avgsum = 0;
			int people = 1;
			int p =0;
			InputData inData = new InputData(allperson);
			//생성자의 숫자를 준 만큼 배열 생성
			
			//입력데이터 생성
			for(int i=1; i<allperson+1; i++) {
			
				String name = "홍길"+i;
				int kor = (int)(Math.random()*100);
				int eng = (int)(Math.random()*100);
				int mat = (int)(Math.random()*100);
				inData.setData(i-1, name, kor, eng, mat);
			}
			int num2=0;
			
			
			if(allperson%pagePerPerson != 0) {
				num2 =1;
			}
			for(int j=0; j<(allperson/pagePerPerson)+num2; j++) {
			inData.title1(j+1);
			
			for(int i=p; i < allperson; i++) {
				
				if(i==(pagePerPerson*(j+1))) {
			    	
					break;
				}
				else {
				System.out.println((i+1)+"\t"+inData.name[i]+"\t"+inData.kor[i]+"\t" +
			inData.eng[i] +"\t"+inData.mat[i] +"\t"+inData.sum[i] +"\t"+inData.avg[i]);
				korsum += inData.kor[i];
				engsum += inData.eng[i];
				matsum += inData.mat[i];
				finSum += inData.sum[i];
				avgsum += inData.avg[i];
				p++;
				people++;
				}	
			}	
			
			
	    	
			inData.finalData(korsum, engsum, matsum, finSum, avgsum, people);
			inData.finalData2(korsum, engsum, matsum, finSum, avgsum, people);
			people = 1;
			korsum = 0;
			engsum = 0;
			matsum = 0;
			finSum = 0;
			avgsum = 0;
			}
	}


}
