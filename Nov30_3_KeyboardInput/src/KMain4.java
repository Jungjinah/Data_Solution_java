import java.util.Scanner;

public class KMain4 {
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		
		// ����, ����, ���� ������ �޾Ƽ� ���
		// ����, ��ձ���
		
		
		System.out.print("�������� : ");
		int K = key.nextInt();
		System.out.print("�������� : ");
		int M = key.nextInt();
		System.out.print("�������� : ");
		int E = key.nextInt();
		
		
		System.out.printf("�������� :\t%d��\n",K);
		System.out.printf("�������� :\t%d��\n",M);
		System.out.printf("�������� :\t%d��\n",E);
		
		
		System.out.printf("���� ���� ������ : \t%d��\n", K + M + E);
		System.out.printf("����� : \t%.1f��\n", (double) (K + M + E ) / 3);
		
	}
 }
