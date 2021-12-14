import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		// 오늘 기분은 어떤가요?
		// 오늘 컨디션 점수는?
		// 대중교통 몇 번 갈아타고 왔는지?
		// 밤에 푹 잤나요?
		// 몇 시간 잤나요?
		// scanner로 입력 받아서 출력까지!
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("나의 feeling : ");
		String feel = key.next();
		System.out.print("컨디션 점수 :");
		int condition = key.nextInt();
		System.out.print("대중교통 몇 번? -> ");
		int transfer = key.nextInt();
		System.out.print("밤에 푹 잤나? -> ");
		boolean sleep = key.nextBoolean();
		System.out.print("몇 시간 잤나? -> ");
		double hour = key.nextInt();
		
		System.out.printf("나의 feeling : \t%s\n", feel);
		System.out.printf("컨디션 점수 : \t%s\n", condition);
		System.out.printf("대중교통 몇번 갈아탔나? -> \t%d번\n", transfer);
		System.out.printf("밤에 푹 잤나? -> \t%b\n", sleep);
		System.out.printf("몇 시간 잤나? -> \t%.1f시간\n", hour);
		
		
		
		
		
	}
	
	
	
	
	
	
}
