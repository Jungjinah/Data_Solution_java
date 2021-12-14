import java.util.Random;

// �Լ� (Function)
// 		�����ִ� ���(�۾�)���� ����
//		�ʿ��Ҷ����� �ҷ���(ȣ���ؼ�) ����� ���� o

// JDK (�ڹ� ����ŰƮ) > JRE (�ڹ� ����ȯ��)
// ���� �� JRE�� OS(�ü��)�� ���缭 > JVM(�ڹ� ����ӽ�)
//		-> WORA (Write Once Read AnyWhere) - Java�� ����!
//			OS���� ���α׷��� ������ �ʾƵ� ��!

public class FMain1 {
	
	//public static ����Ÿ�� �Լ���(�Ķ����, �Ķ����, ...) {
		//����
		//return
				
		// ����Ÿ�� : ��ȯ�� ���� �ڷ���
		// �Լ� ������ ���� �ϼ��� �ǰ�, main�Լ��� ��ȯ�� ������� ���� �ڷ���
		// return�̶�°� ����ؼ� ��ȯ�� �Ű�, ����� �̵���!
				
		// �Լ��� : ���״�� �� �Լ��� �̸�
		//		1. ���ڷ� �����ϸ� -> ����!
		//		2. Ư������, ���� -> ����!
		//		3. �ڹٹ���(�����) -> ����!
		//		Java�� ��ȭ)
		//		4. �Լ����� ���� ���� ������� �� �� �ְ�!
		//  	5. �ҹ��ڷ� ����
		//		6. �������� ���ؼ�
		//			��ü : abcd_efg_ji
		//			��Ÿü : abdeEfgJi
		// 		7. �ѱ� ��� x
		//	������ vs �Լ���
		//	(���)   (����)
		
		// �Ķ���� (����, parameter) : �Լ��� �����ϴµ� �ʿ��� ���
		// �ʿ��� ������ŭ �ϵ�, �ڷ����� ���� ����ؾ���!

	
	//}
	
	public static void prinMyThink() {
		// ���� ������ ������ ���!
				System.out.println("������� �谡 ��������");
				System.out.println("���ɿ� ������");
				System.out.println("���� ���� ��ġ����");
				System.out.println("�����Ҵµ�");
				System.out.println("������ �߿�ϱ�");
				System.out.println("���ϰ��� ���ڰ� �ұ�");
				System.out.println("���� ���� ��������");
				System.out.println("�����Ҵ� ����¡");
				System.out.println("��ϵ鵵 ���� ��������ϱ�");
				System.out.println("���ϰ��� ��,,");
				System.out.println("���� ���� ���ڰ� �ұ�");
				System.out.println("�ƴϸ� ����Ĵ� ���ڰ� �ұ�");
				System.out.println("�� �� ī���� ���翴�ٱ� ��¡");
	}
	
	
	// �ڱ�Ұ��ϴ� �Լ� (�̸�, �ڵ�����ȣ, ��� �� ���)
	public static void introduce() {
		System.out.println("�̸� : ������");
		System.out.println("�ڵ�����ȣ : 01054798483");
		System.out.println("��� �� : ��õ");
	}
	
	// ���� �ΰ��� ������, ��Ģ���� ����� ������ִ� �Լ�
	// ����ϴ� �Լ�
	// ����̶�� �۾��� �Ϸ���, ���ڰ� �ʿ�
	// �Ķ����(parameter) : �Լ��� �����ϴµ� �ʿ��� ���
	
	
	public static void Integer(int x, int y) {
		
		System.out.println("--------------------");
		
		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		double divide = x / (double)y;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		
	}
	
	
	
	// ���� �� JVM�� main�� �ڵ����� ȣ��!
	// �츮�� �ڵ��ϼ��ؼ� ����� �� main�� ����� �Լ��� ����!
	public static void main(String[] args) {
		
		prinMyThink();
		System.out.println("--------------------");
		introduce(); //�Լ�ȣ��
		Integer(10, 20);
		Integer(8, 2);
}
	
}
 