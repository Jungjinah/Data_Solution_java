import java.util.Scanner;

public class KMain4 {
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		// 국어, 수학, 영어 점수를 받아서 출력
		// 총점, 평균까지
		
		
		System.out.print("국어점수 : ");
		int K = key.nextInt();
		System.out.print("수학점수 : ");
		int M = key.nextInt();
		System.out.print("영어점수 : ");
		int E = key.nextInt();
		
		
		System.out.printf("국어점수 :\t%d점\n",K);
		System.out.printf("수학점수 :\t%d점\n",M);
		System.out.printf("영어점수 :\t%d점\n",E);
		
		
		System.out.printf("너의 성적 총점은 : \t%d점\n", K + M + E);
		System.out.printf("평균은 : \t%.1f점\n", (double) (K + M + E ) / 3);
		
	}
 }
