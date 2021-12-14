import java.util.Scanner;

public class PMain3 {
	// ���� �� �� ������ �� ���� ����ϴ� �Լ�
	public static void printSum(int a, int b) {
		System.out.printf("%d + %d = %d\n", a , b, a + b);
	}
	
	// ���� �� �� ������ �� ���� ����ϴ� �Լ�
	// *** �����ε� : ���� �Լ� �̸��� �ٸ��� �� �ʿ� ����. (������ ���ٸ�!)
	public static void printSum2(int x, int y, int z) {
		System.out.printf("%d + %d + %d = %d\n", x, y, z, x + y + z);
	}
		
	// ���� n�� ������ �� ���� ����ϴ� �Լ� (�Ķ���Ͱ� �� ������ ��..)
	//		�Լ� �Ķ���ͷ� ���� ������...
	//		(�ڷ���...������)
	public static void printMul(int...n) { //***
		int mul = 1;
		// �Լ� ������ ����Ҷ��� �迭ó��...
		for (int i = 0; i < n.length; i++) {
			mul *= n[i];
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		printSum(10, 20);
		System.out.println("----------------------");
		printSum2(10, 20, 30);
		
		
	}
	
}
