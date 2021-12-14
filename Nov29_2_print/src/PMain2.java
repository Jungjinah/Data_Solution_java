
public class PMain2 {
	public static void main(String[] args) {
		// 1. Escape Sequence (이스케이프 문자)
		//	  : 특수한 문자나 특수한 기능을 표현할 때 역슬래시 \를 사용해서
		
		//	\t : Tab키 -> 줄 맞추는 용도
		//  \n : New Line -> 줄만 맞추는 용도
		//  \r : Carriage Return -> 커서를 맨 앞으로
		//  \r\n : Enter키
		//  \b : Backspace키 (1Byte만 지움) -> Java에서는 사용x
		//			C언어 - 한 글자 : 1byte
		//			Java - 한 글자 : 2byte
		//  \0 : 빈칸(space키) 
		
		System.out.println("\0역슬래시는 왜 안나타나있던거냥");
		System.out.println("\t찾아보고 입력하니까");
		System.out.println("\n타자 치느라 맘이 급해졌자낭");
		System.out.println("\r옛날에 알았는데 까먹어버렸넹");
		System.out.println("  벌써 3시 11분이당,,, 시간 짱 빠르당");
		
		
		// 현재 : 가볍게 확인용도로 사용있는 콘솔창이라서
		// 		  \r이나 \n 하나만 있어도 enter키 처리가 가능함
		// 파일처리나 / 통신 : \n이나 \r 하나만 쓰게 되면,, 다 뒤집어짐!!!
		// -> 이클립스 안에서는 \r 과 \n 구분하기가 어려워여
		// -> \n으로 엔터처리를 하고, 이후 파일처리에서 \r, \n을 다루어보아요~
	
		// \(^_^)/ , (".")
		
		// \\ : \를 글자로! -> 경로를 설정할 때!
		// \" : "를 글자로! -> 
		
		
		System.out.println("\\(^_^)/");
		System.out.println("\\*^_^*/");
		System.out.println("(\".\")");		
	}
	
	
	
	
}
