import java.util.Random;
import java.util.Scanner;

public class YMain1 {
	// (3���� ����) ������ �Է¹޴� �Լ�
	// 3���� ũ�ų� ���� �� -> �ٽ� �Է� ���� �� �ֵ���!
	
	
	public static int getNum() {
		
		Scanner key = new Scanner(System.in);
		System.out.println("���� : ");
		int num = key.nextInt();
		return (num < 3) ? num : getNum();
	}
	
	// Ȧ���� �Է� ���� �� �ִ� �Լ�
	// -> ¦�� �Է��ϸ� �ٽ� �Է¹��� �� �ֵ���
	
	public static int getNum2() {
		Scanner key = new Scanner(System.in);
		System.out.println("���� : ");
		int n = key.nextInt();
		return (n % 2 == 1) ? n : getNum2();
	}
	
	// ������ �Է¹޴� �Լ� => 0 ~ 100
	
	public static int getNum3() {
		
		Scanner key = new Scanner(System.in);
		System.out.print("0 ~ 100 : ");
		int num = key.nextInt();
		return (0 <= num && num <= 100) ? num : getNum3(); 
	}
	
	
	
	
	

	public static void main(String[] args) {
		int num1 = getNum();
		System.out.println(num1);
		System.out.println("---------------");
		int num2 = getNum2();
		System.out.println(num2);
		System.out.println("---------------");
		int result = getNum3();
		System.out.println(result);
		
}
	
	
}
