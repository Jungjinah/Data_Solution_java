
// ��ü���� ����
// A has a B : ��� has a �ڵ���
// A is a B :�� is a ����

public class HMain1 {
	public static void main(String[] args) {
		// �̸��� Kim Andrew, ����, �ڵ��� ��ȣ�� 010-1234-5678�� ���
		
		Man m = new Man();
		m.name = "Kim Andrew";
		m.gender = "����";
		m.phoneNum = "010-1234-5678";
		m.printInfo();
		
		System.out.println("----------");
		// ��������, ��ġ��, 02-1222-3444, Kim Andrew�� �Ĵ�
		
		Store s = new Store();
		s.name = "��������";
		s.location = "��ġ��";
		s.phoneNumber = "02-1222-3444";
		s.printStore();
		
		// Man.s.printStore();
		
		System.out.println("----------");
		// �������, 22000��, ������������ �Ĵ� �޴�
		// �� �޴��� ���� ��ü ������ ���
		Egg e = new Egg("�������", 22000, s);
		e.printEggInfo();
		
		System.out.println("----------");
		// ����Ұ��, 25000��, ������������ �Ĵ� �޴�
		// �� �޴��� ���� ��ü ������ ���
		Bulgogi b = new Bulgogi("����Ұ��", 25000, s);
		b.printBulgogiInfo();
		
		System.out.println("----------");
		// �̸��� ����, ������ 5000��, ����Ұ�⸦ ���� ����
		// ��ü ���� ���
		Dish d = new Dish("����", 5000, b);
		d.printDish();
		
		System.out.println("----------");
		// ��������, ���ı�, ���踦 ������ ����
		// ��ü ���� ���
		Market mk = new Market("��������", "���ı�", d);
		mk.printMarket();
		
		System.out.println("----------");
		// ������, ���������� �����ϴ� ����
		// ��ü ���� ���
		Dealer dl = new Dealer("������", mk);
		dl.printDealer();
		
		System.out.println("----------");
		// �������� ��ü ���� ���
		dl.printDealer();
		
		System.out.println("----------");
		// �������� �̸��� ���
		System.out.println(dl.name);
		
		System.out.println("----------");
		// �������� �����ϴ� ���� ���� ��ü ���
		dl.dealer.printMarketInfo();
		
		System.out.println("----------");
		// �������� �����ϴ� ���� ���? ���
		System.out.println(mk.location);
		
		System.out.println("----------");
		// �������� �����ϴ� ���忡�� �� ���� ��ü����
		dl.dealer.market.printDishInfo();
		
		System.out.println("----------");
		// �������� �����ϴ� ���忡�� �� ���� ����
		System.out.println(dl.dealer.market.price);
		
		System.out.println("---------");
		// �������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴� ����
		dl.dealer.market.dish.printBulgogiInfo();
		
		System.out.println("---------");
		// �������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴� ����
		System.out.println(dl.dealer.market.dish.price);
		
		System.out.println("---------");
		// �������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ����ó
		System.out.println(dl.dealer.market.dish);
		
		System.out.println("---------");
		// �������� �����ϴ� ���忡�� �� ���ÿ� ��� �޴��� �� �Ĵ� ���� ����ó
		System.out.println(dl.dealer.);
		
		System.out.println("---------");
		// ������� �Ĵ� ��� ����ó
		System.out.println(e.Where.who.phoneNum);
	}
}

