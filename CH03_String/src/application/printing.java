package application;

public class printing {

	public static void main(String[] args) {
		// 문자열 (+) , 출력
		String name = "홍길동";
		System.out.println("내 이름은 " + name); //문자열끼리 + 로 더한다.
		
		String text = "나의 이름은 : ";
		String endOFSentence = ".";
		
		System.out.println(text + name + endOFSentence);

	}

}
