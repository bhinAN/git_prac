package Chap06;

public class Assignment09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 1004448771;
		String sNumVal = String.valueOf(iNumVal);//int 인수의 문자열 표현을 반환
		String sNumVoice = "";
		
		System.out.println("==>"+sNumVal+"["+sNumVal.length()+"자리]");
		
		
		String[] units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String[] unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
		
		
		int i,j;
		
		
		i=0;
		j=sNumVal.length()-1;
		
		while(true) {
			if(i>=sNumVal.length()) {
				break;//i의 값이 sNumVal배열의 길이와 같아지면 중단
			}
			System.out.print(sNumVal.substring(i,i+1)+"["+units[Integer.parseInt(sNumVal.substring(i,i+1))]+"]");
			//문자열 인수를 부호 있는 10진수 정수로 구문 분석->그 값을 units의 인덱스 값으로 활용
			
			if(sNumVal.substring(i,i+1).equals("0")) {//iNumVal의 어떤 자릿수의 값이 0일때
				if(unitX[j].equals("만") || unitX[j].equals("억")) {//자리를 표현하는 문자가 만 또는 억이라면
					sNumVoice = sNumVoice + "" + unitX[j];//자리를 표현하는 값 앞에 숫자를 넣지 않음
				}
				else {
					//아니라면 아무것도 하지 않음
				}
			}
			else {//iNumVal의 어떤 자릿수의 값이 0이 아니라면
				sNumVoice = sNumVoice
						+units[Integer.parseInt(sNumVal.substring(i,i+1))]
								+unitX[j];//자리를 표현하는 문자 앞에 숫자의 문자를 출력
			}
			i++;//i증가
			j--;//j증가
		}
		System.out.println("\n"+sNumVal + "[" + sNumVoice + "]");
		
	}

}
