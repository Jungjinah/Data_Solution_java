import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner key = new Scanner(System.in);
		
		// 키, 몸무게를 입력 받아서 -> 비만도 검사 프로그램
		
		// 표준체중 = (키 - 100 ) *  0.9
		// 비만도 = (실제 체중 / 표준 체중) * 100
		// 비만도가 120이 넘으면 비만, 아니면 비만x
		
		
		System.out.print("키 : ");
		double height = key.nextDouble();
		
		
		System.out.print("몸무게 : ");
		double weight = key.nextDouble();
		
		
		double mean = (height - 100 ) * 0.9;
		double obesity = (weight / mean) * 100;
		
		System.out.printf("키 : %.2fcm\n", height);
		System.out.printf("몸무게 : %.2fkg\n", weight);
		System.out.printf("표준체중 : %.2fkg\n", mean);
		System.out.printf("비만도 : %.2f\n", obesity);
		
		String result = (obesity > 120) ? "비만" : "안비만";
		
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		System.out.printf("당신은 %s입니다.\n", result);
		
		System.out.print("아무거나 입력하세요 : ");
		String bye = key.next();
		System.out.println("오늘 수업 끝!");
		System.out.print("아무거나 입력하세요(진짜루!) : ");
		String realBye = key.next();
		System.out.println("안냥~~~~~~~~~");
		key.close();
		
		
		
		
		
	}
}
