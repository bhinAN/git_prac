package Chap06;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr= {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};//배열 선언
		double sum =0.0;//실수 sum값에 0.0값 할당
		
		for(int i = 0; i< gradeArr.length;i++) {
			sum += gradeArr[i];// 배열 gradeArr의 i칸에 있는 값을 sum에 다함
		}//gradeArr의 길이 만큼 반복
		double average = sum/gradeArr.length;//sum을 배열의 길이만큼 나눈 값을 average에 할당
		System.out.println("합계 : "+sum);//합계 (sum) 출력
		System.out.format("평균 : %.2f",average);//평균 (average) 출력, 소수점 2번째 자리까지 출력
	}

}
