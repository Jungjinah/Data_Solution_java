import java.util.Scanner;

public class FMain4 {

	// �����ε� (Over loading) -> ��������������� ���!
	// �Լ��� ����, �Ķ����͸� �ٸ��� �ϴ� ���
	// ȣ���� �� � ���� �־��Ŀ� ���� �Լ��� �ҷ����� �ϴ� ���
	
	// ���� �ڷ������� �ᵵ, �Ķ������ ������ �ٸ��� �����ε� o
	// �Ķ������ ������ ���Ƶ�, �ٸ� �ڷ����� ����ϸ� �����ε� o
	
	
	
	// ���� 2���� ������ �� ���� ������ִ� �Լ�
	
	public static void printSum (int x, int y) {
		System.out.println(x + y);	
	}
	
	// ���� 3���� ������ �� ���� ������ִ� �Լ�
	
	public static void printSum (int a, int b, int c) {
		System.out.println(a + b + c);
		
	}
	
	// �Ǽ� 3���� ������ �� ���� ������ִ� �Լ�
	
	public static void printSum (double q, double w, double e) {
		double MS = q + w + e;
		System.out.println(MS);
		
	}
	
	// ������ ������ -> '��!' ���
	// ���ڿ��� ������ -> '��!' ���
	// �Ǽ��� ������ -> ���ƾƾƾ�! ���
	// �ƹ��͵� ���� ������ -> ������.. ���
	
	public static void Euk (int a ) {
		System.out.println("��!");
	}
	public static void Euk (String b ) {
		System.out.println("��!");		
	}
	public static void Euk (double c ) {
		System.out.println("���ƾƾƾ�!");
	}	
	public static void Euk () {
		System.out.println("������...");
	}

	
	// ���α׷� ���� �� -> JVM -> main�Լ��� �ڵ����� ȣ��
	public static void main(String[] args) {
		printSum(10, 5);
		printSum(30, 20, 10);
		printSum(3.4, 3.2, 4.3);
		System.out.println("----------------------");
		Euk("a");
		Euk(4);
		Euk();

		// �����ε�,,�� �˾ƺôµ�,,
		// ��� �츮�� ù������ �� �����ε��� ����ϰ� �־����ϴ�,,������
		// System.out.println(); -> �����ε� ��ǥ���� ��!
	}
}




