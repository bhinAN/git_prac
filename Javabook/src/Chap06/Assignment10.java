package Chap06;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ko2re4a0Po4ly4te2chn9ic3";
		char[] ch = new char[str.length()];
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);//특정 인덱스에 대한 char값을 반환
		}

		for (int i = 0; i < str.length(); i++) {
			if( ((64<ch[i]) && (ch[i]<91)) || ((96<ch[i]) && (ch[i]<123)))
				{
				result += ch[i];
				}
			//아스키 코드로 알파벳 범위 안에 존재하면 result에 더함
		}
		System.out.println("result: " + result);

	}

}
