
public class CMain2 {
	public static void main(String[] args) {
		// �Ｑ������, 230, 3000 ¥�� �Ź��� ����
		
//		Shoes s = new Shoes("�Ｑ������", 260, 3000);
//		s.printInfo();
		
		// �Ʒ��� ���� ��,,
		
		Shoes three = new Shoes();
		three.name = "����Ű �Ｑ������";
		three.size = 260;
		three.price = 3000;
		three.printInfo();
		
		System.out.println("---------");
		
		// Ŀ�� �̸� / ����
		// �Ƹ޸�ī�� / 3000
		
//		Coffee americano = new Coffee("�Ƹ޸�ī��", 3000);
//		americano.printCoffee();
		
		// �Ʒ��� ���� ��,,
		
		Coffee americano = new Coffee();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3000;
		
		americano.printCoffee();
		
		
	}
}
