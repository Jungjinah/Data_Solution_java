import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner key = new Scanner(System.in);
		
		// Ű, �����Ը� �Է� �޾Ƽ� -> �񸸵� �˻� ���α׷�
		
		// ǥ��ü�� = (Ű - 100 ) *  0.9
		// �񸸵� = (���� ü�� / ǥ�� ü��) * 100
		// �񸸵��� 120�� ������ ��, �ƴϸ� ��x
		
		
		System.out.print("Ű : ");
		double height = key.nextDouble();
		
		
		System.out.print("������ : ");
		double weight = key.nextDouble();
		
		
		double mean = (height - 100 ) * 0.9;
		double obesity = (weight / mean) * 100;
		
		System.out.printf("Ű : %.2fcm\n", height);
		System.out.printf("������ : %.2fkg\n", weight);
		System.out.printf("ǥ��ü�� : %.2fkg\n", mean);
		System.out.printf("�񸸵� : %.2f\n", obesity);
		
		String result = (obesity > 120) ? "��" : "�Ⱥ�";
		
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
		System.out.printf("����� %s�Դϴ�.\n", result);
		
		System.out.print("�ƹ��ų� �Է��ϼ��� : ");
		String bye = key.next();
		System.out.println("���� ���� ��!");
		System.out.print("�ƹ��ų� �Է��ϼ���(��¥��!) : ");
		String realBye = key.next();
		System.out.println("�ȳ�~~~~~~~~~");
		key.close();
		
		
		
		
		
	}
}
