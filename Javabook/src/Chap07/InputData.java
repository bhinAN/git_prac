package Chap07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InputData {
    int length;
    String name[];
    int kor[];
    int eng[];
    int mat[];
    int sum[];
    int avg[];
    int Sum =0;
    int Avg =0 ;
    static int a=0, b=0, c=0, d=0, e=0, f=0;
    
    InputData(int x) {
        length = x;
        name = new String[length];
        kor = new int[length];
        eng = new int[length];
        mat = new int[length];
        sum = new int[length];
        avg = new int[length];
    }
    void setData(int i, String Name, int Kor, int Eng, int Mat) {
    	
    	name[i] = Name;
    	kor[i] = Kor;
    	eng[i] = Eng;
    	mat[i] = Mat;
    	Sum = Kor + Eng + Mat;
    	Avg = Sum / 3;
    	sum[i] = Sum;
    	avg[i] = Avg;
    	
    	
    }
    void title() {
    	LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy. MM. dd. HH:mm:ss"));
		System.out.println("\t\t성적집계표");
		System.out.println("\t\t\t출력일자 : "+formatedNow);
    	System.out.println("========================================================");
    	System.out.println("번호     이름     국어     영어     수학     총점     평균     ");
    	System.out.println("========================================================");
    }
    void title1(int page) {
    	LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy. MM. dd. HH:mm:ss"));
		System.out.println("\t\t성적집계표");
		System.out.println("Page : "+page+"\t\t출력일자 : "+formatedNow);
    	System.out.println("========================================================");
    	System.out.println("번호     이름     국어     영어     수학     총점     평균     ");
    	System.out.println("========================================================");
    }
    void finalData(int Skor, int Seng, int Smat, int fSum, int Savg, int person) {
    	System.out.println("========================================================");
    	System.out.println("현재페이지");
    	System.out.println("합계\t\t"+Skor+"\t"+Seng+"\t"+Smat+"\t"+fSum+"\t"+Savg);
    	System.out.println("평균\t\t"+Skor/person+"\t"+Seng/person+"\t"+Smat/person+"\t"+fSum/person+"\t"+Savg/person);
    }
    void finalData2(int ffkor, int ffeng, int ffmat, int ffsum, int ffavg, int ffperson) {
    	a+=ffkor;
    	b+=ffeng;
    	c+=ffmat;
    	d+=ffsum;
    	e+=ffavg;
    	f+=ffperson;
    	
    	System.out.println("========================================================");
    	System.out.println("누적페이지");
    	System.out.println("합계\t\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
    	System.out.println("평균\t\t"+a/f+"\t"+b/f+"\t"+c/f+"\t"+d/f+"\t"+e/f);
    	System.out.println();
    	System.out.println();
    	
    }
}




