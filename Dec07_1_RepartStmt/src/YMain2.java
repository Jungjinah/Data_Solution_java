import java.util.Scanner;

public class YMain2 {
	
	// f1 : ������ �ϳ� �Է¹޾Ƽ�
	// �װ� ����� '��' ��� / 0�̸� '0' ��� / ������ '��' ���
	
	public static int inInteger () {
		
		Scanner key = new Scanner(System.in);
		System.out.print("���� : ");
		int f1 = key.nextInt();
		if (f1 > 0) {
			System.out.println("��");
		}else if (f1 == 0) {
			System.out.println(0);
		}else {
			System.out.println("��");
		}
		return f1;	
	}
	
	// f2 : ������ �ϳ� �Է� �޾Ƽ�
	// 3�� �����  "3�� ���"
	// 	�� �ƴϰ� 4�� ����� "4�� ���"
	// �� �ƴϸ� ����!!
	// �� �������ִ�(����� ������ ����) �Լ�
	
	public static String f2() {
		
		Scanner key = new Scanner(System.in);
		System.out.print("���ڸ� �Է��϶� : ");
		int a = key.nextInt(); 
		
		if (a % 12 == 0) {
			return "3�� 4�� �����";
		}else if (a % 3 == 0) {
			return "3�� ���";
		}else if (a % 4 == 0) {
			return "4�� ���";
		}else {
			return "���� ����!!";
		}	
	}

	
	
	
	public static void main(String[] args) {
		
		int f1 = inInteger();
		//System.out.println(a);
		System.out.println("-------------");
		String a = f2();
		System.out.println(a);
		
	}
}
