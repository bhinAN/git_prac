package Chap05;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment05 {
	
	public static void titlePrint() {
		System.out.println("                     \"국민가게 다이소\"");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11(서현동)");
		System.out.println("====================================================");
	}
	public static void timeStamp() {
		
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.printf("거래일시 :");
		System.out.println(formatedNow);
		System.out.println("====================================================");
	}
	public static int HeaderPrint(int a) {
		
		int sum;
		String item_name1 = "퓨어에어 비말차단용마스크(최고급형)";
		String item_code1 = "1031615";
		int item_price1 = 3000;
		int item_amount1 = 1;
		String item_name2 = "슬라이드식명찰(가로형)(100호)   ";
		String item_code2 = "11008152";
		int item_price2 = 1000;
		int item_amount2 = 1;
		String item_name3 = "매직흡착 인테리어후크(알루미늄타입)";
		String item_code3 = "1020800";
		int item_price3= 1000;
		int item_amount3 = 1;
		String item_name[]= {item_name1, item_name2, item_name3};
		String item_code[]= {item_code1,item_code2,item_code3};
		int item_price[] = {item_price1,item_price2,item_price3};
		int item_amount[] = {item_amount1,item_amount2,item_amount3};
		System.out.printf(item_name[a]+"\t");
		System.out.printf(item_price[a]+"\t");
		System.out.printf(item_amount[a]+"\t");
		System.out.printf(item_amount[a]*item_price[a]+"\n");
		System.out.printf("["+item_code[a]+"]");
		System.out.println();
		sum = item_amount[a]*item_price[a];
	
		
		return sum;
		
	}
	public static void totalPrint(int sum) {
		DecimalFormat df = new DecimalFormat("###,###");
		String money = df.format(sum);
		String sales = df.format(Math.round(sum / 1.1));
		String tax = df.format(Math.floor(sum * 0.09091));
		System.out.println("\t\t\t과세합계\t\t\t" + sales);
		System.out.println("\t\t\t부과세\t\t\t" + tax);
		System.out.println("====================================================");
		System.out.println("\t\t\t판매합계\t\t\t" + money);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemCount = 3;
		int sum=0;
		titlePrint();
		timeStamp();
		for(int i=0;i<itemCount;i++)
		{
			sum+=HeaderPrint(i);
		}
		totalPrint(sum);
		
	}

}

