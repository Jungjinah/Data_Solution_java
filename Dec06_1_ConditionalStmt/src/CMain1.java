import java.util.Scanner;

public class CMain1 {
	// ���� ���������� �Է��ؼ� �޾ƿ���
	public static int korean() {
		Scanner key = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int k = key.nextInt();
		// �������� -������ ���� ������!
		return (k >= 0 && k <= 100) ? k : korean();
	}
	
	// ���ǹ� : �ۼ��� �ڵ带 ���ǿ� ���� 
	//	 	  �ڵ��� ���� �帧�� �ٸ��� �����ϵ��� �����ϴ� ����
	// 		if�� : ���ǽ��� ����� true, false�� ���๮�� ����
	
//	if (���� A) {
//		���� A�� ���������� (���϶�) �� �κ��� ����
//	}else if (���� B) {
//		���� A (x), ���� B(o)�� �� �� �κ��� ����
//	}else if (���� C) {
//		���� A/B (x), ���� C(o)�� �� �� �κ��� ����
//	}else {	
//		�´� ������ �ϳ��� ������ �� �κ��� ����
	
//	if (condition) {
//		
//	}else if (condition) {
//		
//	}else if (condition) {
//					 
//	}
//	else {
//		
//	}
	
	public static void main(String[] args) {
	
	// ����������...
	// 60�� �̸��̸� ��, 60�� �̻��̸� ��, 70�� �̻��̸� ��, 80�� �̻��̸� ��, 90�� �̻��̸� �� �� ���
	
	Scanner key = new Scanner(System.in);
	System.out.print("�������� : ");
	int korean = key.nextInt();
	System.out.print("����� : ");
	
	 if (korean < 60) {
		 System.out.println("��");
	 }else if (korean <70) {
		 System.out.println("��");
	 }else if (korean < 80) {
		 System.out.println("��");
	 }else if (korean < 90) {
		 System.out.println("��");
	 }else {
		 System.out.println("��");
	 }
		
	 System.out.println("-----------------------");
	 
	 // ���� ������ 50���� �ȵǸ� ��, �ƴϸ� Ī��
	 // ������ 50�� �̻�, 60�� �̸��̸� �ƽ��� �Ҹ� ���
	 // ������ 30�� �̸��̸� �ѱ����̽ʴϱ�? ���
	 
	 // if�� �ȿ� if���� �� ����ϴ°��� ����!
	 //		if - if���� if - else�� ����
	 //			if - if : ���� �ٸ� ���ǹ����� �ؼ��� �Ǿ �����ϰ� �� => ȿ����x
	 //			if - else : �ϳ��� ������ �����Ǹ� ������ �κ��� �������� ���� => ȿ����o
	 
	 if (korean < 50) {
		System.out.println("�̰� �ƴ���,,,");
		if (korean < 30) {
			System.out.println("�ѱ����̽ʴϱ�?");
		
	}else if (korean < 60) {
	System.out.println("���� �� �� ������,,");
		
	}	
	}else {
		System.out.println("���߳�!");
	
	}
	 
	} 
	 

	






	private static int k() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
