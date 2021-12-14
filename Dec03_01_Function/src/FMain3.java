import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	

	// È¦Â¦(ÇÔ¼ö.ver)
	

	
	// ·£´ýÇÑ µ¿Àü °³¼ö °¡Á®¿À±â
	public static int shakeCoin() {
		//Random r = new Random();
		//int coin = r.nextInt(10) + 1;
		//return coin;
		 return new Random().nextInt(10) + 1;
	}
	// Áú¹® & ´ä ÀÔ·Â
	public static String askUserAns() {
		//Scanner k = new Scanner(System.in);
		System.out.println("È¦ or Â¦ : ");
		//String userAns = k.next();
		//return userAns;
		return new Scanner(System.in).next();
		
	}	
	// µ¿Àü °³¼ö°¡ È¦¼ö¸é 'È¦', Â¦¼ö¸é 'Â¦'
	public static String getAnswer(int coin) {
		//String answer = (coin % 2 == 1) ? "È¦" : "Â¦";
		//return answer;
		return (coin % 2 == 1) ? "È¦" : "Â¦";
	}
	// °á°ú ³»±â
	public static String getResult(String ua, String a) {
		//String result = (ua.equals(a)) ? "Á¤´ä" : "¶¯";
		//return result;
		return (ua.equals(a)) ? "Á¤´ä" : "¶¯";
	}
	// Ãâ·Â
	public static void printResult(int coin, String ua, String a, String r) {
		System.out.printf("µ¿ÀüÀº %d! \n", coin);
		System.out.printf("³»°¡ ÀÔ·ÂÇÑ ´ä : %s! \n", ua);
		System.out.printf("°á°ú : %sÀÌ¶ó¼­ %s! \n", a, r);
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		String userAns = askUserAns();
		String answer = getAnswer(coin);
		String result = getResult(userAns, answer);
		printResult(coin, userAns, answer, result);
	}
	
}
