import java.util.Random;
import java.util.Scanner;

// ���õ� �Լ�!

// ? ��°� ������ ���̴� ����� main���� �������� ���� ������ '���'�� �ؼ�
// ? return�� ���� �ʰ�, �������� '���' void�� ����Ѵ�.
// ? ������ ����� ���� main���� �������� �ϹǷ� 'return'�� ����ؾ� �ϰ�,
// ? return���� ������ ���� int, double, string �� �ϳ��� �ȴ�.


public class FMAin1 {
	// 1) ������ ������ '���'�ϴ� �Լ�! // �׸�) ��ɸ� �ִ� �Լ��� ����
	
	public static void red() {
		Random I = new Random(); // ������ ���� ���� �غ�!
		int In = I.nextInt();
		System.out.println(I);
		System.out.printf("-----------------------\n");
	}
	
	// 2) ������ ������ '����'�ϴ� �Լ�! // �׸�) ������� �ִ� �Լ��� ����
	
	public static int blue() {
		Random i = new Random();
		int in = i.nextInt();
		return in;
	}
	// ���� = ���Ѵ�. // ������ '����'�ϴ� ���� �� �Լ��� ��ǥ,,
	// return�� �ϴµ� ������ ���� void -> int �� �ٲٰų�
	//	return�� ���콺 ���ٴ�� int�� �ٲ��ֱ�
	//  -> in �� �ִ� ���� ���� ����� ����
	// ���Լ��� ����
	
	// 3) ������ �ϳ� ������
	// Ȧ������ ¦������ ����ϴ� �Լ�
	
	public static void green(int a) { // �׸�)������ �־ ����� ����� �Լ�
		String result = (a % 2 == 1) ? "Ȧ��" : "¦��";
		System.out.printf("%d�� %s!\n", a, result);
	}
	// 4) ������ �ΰ� �־��� ��
	// �� ���ڰ� ũ�� ��, �� ���ڰ� ũ�ų� ������ '��' ����
	
	public static String purple(int x, int y) { // ������ ������ ����� ����
		String bigNum = (y <= x) ? "��" : "��" ;
		// String bigNum = (x > y) ? "��" : "��" ;
		return bigNum;
	}
	
	// 5) ���ɸ޴� (2���� �� �ϳ�!)
	// ���� �Լ��� �̿��ؼ�
	// ������ ���ڸ� 2�� �̾Ƽ�
	// ���� ������ ũ�� '�ո޴�', �ƴϸ� '�ڸ޴�'
	public static String black(int A, int B) {
		
		Random number = new Random();
		String result = (A > B)? "����" : "���";
		return result;
	}
	
	// 5-1) Ȧ���̸� ����, ¦���̸� ���
	
	public static void white(int z) {
		String  reSult = (z % 2 == 1)? "����" : "���";
		System.out.printf("���� ������ %s!\n", reSult);
	}
	
	
	// JVM -> main�Լ��� �ڵ����� ȣ��
	public static void main(String[] args) {
		red();
		// blue()�� ���� ������ ���ڸ� i��� �׸��� ��Ƽ� �ֿܼ� ���
		int i = blue();
		System.out.println(i);
		System.out.println("------");
		// green()�� ���ؼ� ¦������ Ȧ������ �ֿܼ� ���
		green(5);
		System.out.println("------");
		String ss = purple(10,20);
		System.out.println(ss);
		System.out.println("------");
		String lunch = black(10, 20);
		System.out.println(lunch);
		System.out.println("------");
		white(4);
		
		// 5) ������ ����
		int r1 = blue();
		int r2 = blue();
		System.out.println(r1);
		System.out.println(r2);
		String sss = purple(r1, r2);
		System.out.println(sss);
		String menu = (sss.equals("��")) ? "�ʹ�" : "¥���";
		// ���� ���� "��"�̶�� ������ "�ʹ�"���� �ٲ۴� ��!
		// String menu = (r1 > r2) ? "�ʹ�" : "¥���";
		System.out.println(menu);
		
		
		
		
		
		
		
		
	}
	
	
	
}
