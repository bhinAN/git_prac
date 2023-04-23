package Chap04_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 180000;
		
		DecimalFormat df = new DecimalFormat("###,###");
		String money = df.format(price);
		String sales = df.format(Math.round(price / 1.1));
		String tax = df.format(Math.floor(price * 0.09091));
		System.out.println("\t   매출전표(카드회사용)");
		System.out.println("맛꼬방치킨\t\t\t       하순희");
		System.out.println("124-25-54620\t       063-632-6614");
		System.out.println("전북 남원시 농고길 11 (도통동)");
		System.out.println("하나기업카드\t          신용승인(I)");
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.printf("거래일시 :");
		System.out.println(formatedNow);
		System.out.println("4336-9200-****-982*\t       일시불");
		System.out.println("TID:***13440  230964317368(0001)");
		System.out.println("가맹점No 00921293692");
		System.out.println("매 입 사 하나카드(다우데이타)");
		System.out.println("승인번호 40860059"); 
		System.out.println("판매 금액:\t\t\t     "+(sales));
		System.out.println("부 가 세:\t\t\t      "+(tax));
		System.out.println("합   계:\t\t\t     "+(money));
		
		
		
	}

}

