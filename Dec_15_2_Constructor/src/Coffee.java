
public class Coffee {

	String name;
	int price;
	
	public Coffee() {		// ctrl + space�� ����ȭ
		// ��ü�� ���� �ʱ�ȭ�ϴµ� ����!
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Coffee(String name, int price) {		// ctrl + shift + space
		super();		// <- method (������ ���ϴ� ������, ���� �ִ� �⺻ ������ ���ϴ°���,,)		
		this.name = name;
		this.price = price;
	}

	public void printCoffee() {
		System.out.println(name);
		System.out.println(price);
	}
	

//	public void printCoffee() {
//		System.out.printf("Ŀ���̸� : %s\n", name);
//		System.out.printf("Ŀ�ǰ��� : %d��\n", price);
//	}
	
	
	
}
