
// OOP
// static - ���������������
// ������
// ��ü���� ����
//	A has a B : ����� has a �ڵ���
//	A is a B : �� is a ����

public class HMain1 {

	public static void main(String[] args) {
		// �̸��� û������, ���� û������ ����
		// �������
		
		Candy c = new Candy();
		c.name = "û����";
		c.taste = "û������";
		c.printCandy();
		// �̸��� �Ե�, ��ġ�� ���, �������� 100���� ȸ��
		// �������
		
		System.out.println("--------------");
		Company cp = new Company();
		cp.companyName = "�Ե�";
		cp.location = "���";
		cp.employee = 100;
		cp.printCompany();
		
		System.out.println("--------------");
		
		// Candy has a company : �� ������ ���� �����縦 �� �� ���� (o)
		// Company has a Candy : ȸ�簡 ����� ��ǰ�� ǥ��
		// -> ���߿� �����簡 �� ����..
		
		// û������ �Ե����� �������.
		c.brand = cp;
		
		// û���� ���� û���� ������ �������� ������ ���
		c.brand.printCompany();
		
		System.out.println("--------------");
		
		// �Ｚ, ����, 300���� �ٴϴ� ȸ���� ������ ���
		
		Company cp1 = new Company("�Ｚ","����",300);
		//cp1.printCompany();
	
		
		// CPU�� i7-1234, RAM 32GB, HDD 500GB�� �Ｚ ��ǻ��
		// ��ǻ�� / ȸ�� ���� ���
		
		Samsung ss = new Samsung("i7-1234", 32, 500, cp1);
//		ss.cpu = "i7-1234";
//		ss.ram = 32;
//		ss.hdd = 500;
	
		ss.printInfo();
		
		
		
		
		
		
	}
	
}
