import java.util.Scanner;

public class CMain2 {
	// �����ϳ��� �Է�
	// �Է� ���� ���� ���� 5���� ũ�� ���ο� ���� y�� ���� 10�� ��Ƽ� ���
	// �Է� ���� ���� ���� 3���� ũ�� ���ο� ���� y�� ���� 20�� ��Ƽ� ���
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.print("x : ");
		int x = key.nextInt(); 
		
		// if�� �ȿ� ������ �����
		// if���� ���ư��༭ ����ؼ� int y�� �����ϰ� ����!
		// 		-> ȿ�������� �ʴ�.
		
//		if (x > 5) {
//			int y = 10;
//			System.out.println(y);
//			
//		}else if (x >3) {
//			int y = 20;
//			System.out.println(y);
//		}
		// if�� �ٱ����ٰ� ������ �����ϰ�
		// if�� �ȿ��� ���� '����'�� �� �ְ� �ϴ� ���� ȿ����!
		int z; // �׸��� ��������. // �⺻���� ���ϰ� 
		if (x > 5) {
			z = 10;
			System.out.println(z);
		}else if (x > 3) {
			z = 20;
			System.out.println(z); // �⺻���� ������ ������ ����!
		}
		
		
		
	}
}
