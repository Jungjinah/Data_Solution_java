
/*	����
 *  1. ���� ������ �ҽ��� stack������ �� (��������)
 *  2. static����������� static������ ��ġ
 *  3. JVM Smain.main(...); �� ȣ��
 *  4. ����
 */


public class SMain1 {

	public static void main(String[] args) {
		
		// ���� ��ü
		// �̸� / �߷� / ����
		
		// ���� main���� ���ڰ� ���� ����
		// ���� �̸�? -> ��
		// ���� �߷�? -> ��
		// ���� ����? -> ��
		// ���� ������? -> DDargiratte
		System.out.println(Snack.MANUFACTURE);
		System.out.println("----------------");
		
		
		Snack s1 = new Snack();
		s1.name = "Ȩ����";
		s1.weight = 90.3;
		s1.price = 1500;
		s1.printInfo();
		System.out.println("----------------");
		
		Snack s2 = new Snack();
		s2.name = "����";
		s2.weight = 50.7;
		s2.price = 1000;
		s2.printInfo();
		System.out.println("---------------");
		// �ϴ� �����ڴ� �� DDargiratte�� �´�!
		
		// ���⼭ ���긦 ���� �������� �̸��� �ٲ㺸��
//		s2.MANUFACTURE = "JinaFithing"; // ����!
//		s2.printInfo();
		// �����ڴ� �� DDargiratte���,,?
		
		Snack.printTaste();
		
		
		
		
		
	}
	
	
	
}
