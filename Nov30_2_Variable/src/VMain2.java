
public class VMain2 {
	public static void main(String[] args) {
		
		// ����Ż����
		// ������ 1000��
		// �뷮�� 80ml
		// ����� 99.9%
		// ������ ��
		// ȸ�簡 ���̼�
		// ��Ȱ�� �ؾ��� (%b)
		
		
		// �� ���
		String N = "��ǰ : ";
		String name = "����Ż����";
		String P = "���� : ";
		int price = 1000;
		String price_p = "��";
		String M = "�뷮 : ";
		int ml = 80;
		String ml_ml = "ml";
		String C = "��� : ";
		double clean = 99.9;
		String cleann = "%";
		String CL = "���� : ";
		String color = "��";
		String CP = "ȸ�� : ";
		String company = "���̼�";
		String R = "��Ȱ�� ���� : ";
		boolean recycle = true;
		
		System.out.println(N + name);
		System.out.println(P + price + price_p);
		System.out.println(M + ml + ml_ml);
		System.out.println(C + clean + cleann);
		System.out.println(CL + color);
		System.out.println(CP +company);
		System.out.println(R + recycle);
		
		 //������ ���
		 //String name = "����Ż����";
		 //int price = 1000;
		 //int volume = 80;
		 //double antibacterial = 99.9;
		 //char color = '��';
		 //String company = "���̼�";
		 //boolean recycle = true;
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", price);
		System.out.printf("�뷮 : %dml\n", ml);
		System.out.printf("��� : %.1f%%\n", clean);
		System.out.printf("���� : %s\n", color);
		System.out.printf("ȸ�� : %s\n", company);
		System.out.printf("��Ȱ�� ���� :  %b\n", recycle);
		
		
		
		// �̸�, ���� ��¥(����, ��, ��), ��� ��, �÷�, java������ ����
		
		String myname = "����";
		int year = 2021;
		int month = 11;
		int day = 30;
		String home = "��õ��";
		double eye = 0.9;
		boolean java = false;
		
		System.out.printf("�̸� = %s\n", myname);
		System.out.printf("���� = %d��\n", year);
		System.out.printf("�� = %d��\n", month);
		System.out.printf("�� = %02d��\n", day);
		System.out.printf("��¥ = %d�� %d�� %02d��\n", year,  month,  day);
		System.out.printf("�ְ��� = %s\n", home);
		System.out.printf("�÷� = %.1f\n", eye);
		System.out.printf("java������ ���� = %b\n", java);
		
		
	}
	
	
	
}
