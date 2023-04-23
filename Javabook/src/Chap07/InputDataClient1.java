package Chap07;

public class InputDataClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 30;
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int finSum = 0;
		int avgsum = 0;
		InputData inData = new InputData(person);
		//생성자의 숫자를 준 만큼 배열 생성
		
		//입력데이터 생성
		for(int i=1; i<person+1; i++) {
		
			String name = "홍길"+i;
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			inData.setData(i-1, name, kor, eng, mat);
		}
		
		inData.title();
		for(int i=0; i < person; i++) {
			
			System.out.println((i+1)+"\t"+inData.name[i]+"\t"+inData.kor[i]+"\t" +
		inData.eng[i] +"\t"+inData.mat[i] +"\t"+inData.sum[i] +"\t"+inData.avg[i]);
			korsum += inData.kor[i];
			engsum += inData.eng[i];
			matsum += inData.mat[i];
			finSum += inData.sum[i];
			avgsum += inData.avg[i];
		}
		
		inData.finalData(korsum, engsum, matsum, finSum, avgsum, person);
	}

}
