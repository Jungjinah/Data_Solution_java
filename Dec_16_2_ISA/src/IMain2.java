// A is a B : ��Ӱ���
// ���θ�
public class IMain2 {
	
	public static void main(String[] args) {
		
		// �Ź� (�̸�, ����, ������)
		// ��ǻ�� (�̸�, ����, CPU, RAM, HDD)
		// ���
		
		Shoes s = new Shoes();
		s.name = "����Ű";
		s.price = 129000;
		s.size = 230;
		
		s.printInfo();
		System.out.println("------------");
		Computer c = new Computer("�Ｚ", 2000000, "i7-1234", 32, 500);
//		c.name = "�Ｚ";
//		c.price = 2000000;
//		c.cpu = "i7-1234";
//		c.ram = 32;
//		c.hdd = 500;
		c.printInfo();
		
		// ��Ʈ��(�̸�, ����, cpu, ram, hdd, ����, ���͸� ���ӽð�)
		
		System.out.println("---------------");
		Notebook n = new Notebook();
		n.name = "��s";
		n.price = 2000000;
		n.cpu = "i5-1234";
		n.ram = 32;
		n.hdd = 500;
		n.weight = 1.5;
		n.battery = 8.5;
		
		n.printInfo();
		
		
		
	}
	
	
}
