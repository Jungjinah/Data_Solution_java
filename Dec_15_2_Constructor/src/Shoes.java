// ������(Constructor)
//	 ��ü�� ��������� ���� �۾��� �� �ؾ��ϴµ�...
//		-> ������ �����!
//		������ �ƿ� ����, �޼ҵ���� Ŭ������� ���� �޼ҵ�
//		�����ڸ� ������ ������ 
//		 -> �ڹ� �����Ϸ��� �⺻ �����ڸ� ��������
//		�����ڸ� �ǵ帮��,,
//		 -> �ڹ� �����Ϸ��� �⺻ �����ڸ� ��������� ����
//		 -> �ý����� �ڵ����� ��ü�� ���鶧�� �ִµ�...
//			-> �⺻ �����ڸ� �� -> ���� �߻�! (�׷��� �����ڸ� ���鶧�� �����ؾ���.)

// ��ü�� ���� �� �Ӽ������� �� ����
//

public class Shoes {
	
	String name;
	int size;
	int price;
	static String brand = "����Ű"; // = static final String BRAND = "����Ű";
	// �⺻ ������ (Ctrl + Space)
	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	
	// ������ �����ε� (Ctrl + Shift + Space)
	public Shoes(String name, int size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		
	}
	
	public void shoesNike(String name) {
		this.size = 230;
		this.price = 179100;
		
		this.name = name;
	}
	
	public void shoesNike2(String name) {
		this.size = 230;
		this.price = 129000;
		
		this.name = name;
	}
	
	public void printInfo() {
		System.out.printf("�𵨸� : %s\n", name);
		System.out.printf("������ : %dmm\n", size);
		System.out.printf("���� : %d��\n", price);
		System.out.printf("�귣�� : %s\n", brand);
	}
	
	public static void printBrandInfo() {
		System.out.println(brand);
		System.out.println("����ȭ����");
		System.out.println("����");
	}
	
	public void test() { // �Ķ���� ���� String name �־��ٸ�, ���������� �Ķ���͸��� ���� ��Ȳ..
		// this.�� ���̰� �Ǹ� ������ �������
		// this�� �Ⱦ��� ���� ������ �ִ� ���� �������Ե�
		System.out.println(name);
		System.out.println(this.name);
	}
	
}
	
