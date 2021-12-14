import java.util.Scanner;

public class KMain2 {
	public static void main(String[] args) {
		
		// 반지름 입력받아서 원의 면적 계산하기
	
		Scanner Keyboard = new Scanner(System.in);
		
		// 1. 원의 반지름을 입력
		// 2. 원의 면적을 계산
		
		System.out.print("반지름 : ");
		double r = Keyboard.nextInt();
		double s = 3.14 * (r*r);
		double s2 = (Math.PI * Math.pow(r, 2));
	
		
		System.out.printf("원의 면적 : %.2f\n",s2);
		
		
		// 가로, 세로 입력 받아서 사각형 면적 구하기
		
		System.out.print("가로 : \n");
		double a = Keyboard.nextDouble();
		System.out.print("세로 : \n");
		double b = Keyboard.nextDouble();
		
		double ab = a*b;
		
		System.out.printf("사각형 면적 : %.0f\n", ab);
		
		// 시간(초)를 입력 받아서 분, 시간단위로 변환해보기!
		
		
		System.out.println("초를 입력하라.");
		double ss = Keyboard.nextDouble();
		
		double mm = ss/60;
		System.out.printf("분으로 나타내라. %.2f분\n", mm);
	
				
		// int / int = int
		//
		
		
		
		
		
		
		
		
		
	}
}
