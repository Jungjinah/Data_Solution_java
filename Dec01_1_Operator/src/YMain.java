import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		// ���� ����� �����?
		// ���� ����� ������?
		// ���߱��� �� �� ����Ÿ�� �Դ���?
		// �㿡 ǫ �䳪��?
		// �� �ð� �䳪��?
		// scanner�� �Է� �޾Ƽ� ��±���!
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("���� feeling : ");
		String feel = key.next();
		System.out.print("����� ���� :");
		int condition = key.nextInt();
		System.out.print("���߱��� �� ��? -> ");
		int transfer = key.nextInt();
		System.out.print("�㿡 ǫ �䳪? -> ");
		boolean sleep = key.nextBoolean();
		System.out.print("�� �ð� �䳪? -> ");
		double hour = key.nextInt();
		
		System.out.printf("���� feeling : \t%s\n", feel);
		System.out.printf("����� ���� : \t%s\n", condition);
		System.out.printf("���߱��� ��� ��������? -> \t%d��\n", transfer);
		System.out.printf("�㿡 ǫ �䳪? -> \t%b\n", sleep);
		System.out.printf("�� �ð� �䳪? -> \t%.1f�ð�\n", hour);
		
		
		
		
		
	}
	
	
	
	
	
	
}
