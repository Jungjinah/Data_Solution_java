import java.util.Scanner;

public class KMain2 {
	public static void main(String[] args) {
		
		// ������ �Է¹޾Ƽ� ���� ���� ����ϱ�
	
		Scanner Keyboard = new Scanner(System.in);
		
		// 1. ���� �������� �Է�
		// 2. ���� ������ ���
		
		System.out.print("������ : ");
		double r = Keyboard.nextInt();
		double s = 3.14 * (r*r);
		double s2 = (Math.PI * Math.pow(r, 2));
	
		
		System.out.printf("���� ���� : %.2f\n",s2);
		
		
		// ����, ���� �Է� �޾Ƽ� �簢�� ���� ���ϱ�
		
		System.out.print("���� : \n");
		double a = Keyboard.nextDouble();
		System.out.print("���� : \n");
		double b = Keyboard.nextDouble();
		
		double ab = a*b;
		
		System.out.printf("�簢�� ���� : %.0f\n", ab);
		
		// �ð�(��)�� �Է� �޾Ƽ� ��, �ð������� ��ȯ�غ���!
		
		
		System.out.println("�ʸ� �Է��϶�.");
		double ss = Keyboard.nextDouble();
		
		double mm = ss/60;
		System.out.printf("������ ��Ÿ����. %.2f��\n", mm);
	
				
		// int / int = int
		//
		
		
		
		
		
		
		
		
		
	}
}
