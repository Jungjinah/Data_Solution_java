
public class CMain1 {
	public static void main(String[] args) {
		
		// �Ź�
		// ����Ű Ȩ������
		// �̸� : 
		// ������ : 
		// ���� : 
		// �귣�� : ����Ű
		// -----------------
		// �̸� : 
		// ������ : 
		// ���� : 
		// �귣�� : ����Ű
		
		Shoes n = new Shoes();
		n.name = "����ƽ�97";
		n.size = 230;
		n.price = 179100;
		n.printInfo();
		System.out.println("---------");
		Shoes n1 = new Shoes();
		n1.name = "��������";
		n1.size = 230;
		n1.price = 129000;
		n1.printInfo();
		System.out.println("---------");
		
		Shoes.printBrandInfo();
		
	}
}
