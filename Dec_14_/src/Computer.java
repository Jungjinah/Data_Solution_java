import java.util.Random;

public class Computer {
	
	
	int coin = 20;
	int c;
	String afterShakeResult;
	
	public void printComputer() {
		System.out.println("< ÄÄÇ»ÅÍ >");
		System.out.println("-----------------");
		//System.out.println(this.count);
	}
	
	public void start() {
		User u = callUser();
		askCount(u);
		//askAnswer(u);
		printResult(shake(), askAnswer(u));
	}
	
	public User callUser() {
		User u = new User();
		return u;
	}
	
	// ¸î°³ ?
	public int askCount(User u) {
		System.out.print("ÇÃ·¹ÀÌÇÒ °³¼ö Á¤ÇØ : ");
		c = u.answerCount();
		if (c >= 0 && c <= 20) {
			System.out.println("============");
			System.out.println("ok");
			System.out.println("============");
		}else if (c < 0 || c > 21) {
			System.out.println("============");
			System.out.println("´Ù½Ã ÀÔ·ÂÇÏ¶ó");
			System.out.println("============");
		}
		return(c >= 0 && c <= 20) ? c : askCount(u);
	}
	
	// ÄÄÇ»ÅÍ Â©Â©ÀÌ
	public String shake() {
		Random r = new Random();
		int computercoin = r.nextInt(c)+1;
		System.out.println("ÄÄÇ»ÅÍ°¡ »ÌÀº ·£´ý°ª => È®ÀÎ¿ë");
		System.out.println(computercoin);
		if (computercoin % 2 == 0) {
//			System.out.println("============");
//			System.out.println("Â¦");
//			System.out.println("============");
			afterShakeResult = "Â¦"; 
		}else if (computercoin % 2 == 1) {
//			System.out.println("============");
//			System.out.println("È¦");
//			System.out.println("============");
			afterShakeResult = "È¦";
		}
		return afterShakeResult;
	}
	
	// È¦Â¦?
	public String askAnswer(User u) {
		//c = u.answerCount();
		System.out.print("È¦? Â¦? : ");
		String a = u.answerAnswer();
		return a;
	}
	
	// ÆÇÁ¤
	public void printResult(String computer, String user) {

		if (computer.equals(user)) {
			System.out.println("µùµ¿´ó");
		}else {
			System.out.println("¶¯");
		}
		
//		String x = shake();
//		String y = askAnswer(u);
//		
//		if (x.equals(y)) {
//			System.out.println("µùµ¿´ó");
//		}else {
//			System.out.println("¶¯");
//		}
		
	}
	
	
	
	
	
	
	
	
}
