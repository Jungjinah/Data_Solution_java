
public class Bulgogi {

	String name;
	int price;
	Store Where;
	
	public Bulgogi() {
		// TODO Auto-generated constructor stub
	}

	public Bulgogi(String name, int price, Store where) {
		super();
		this.name = name;
		this.price = price;
		Where = where;
	}

	public void printBulgogi( ) {
		System.out.println(name);
		System.out.println(price);
		Where.printStore();
	}
	
	public void printBulgogiInfo() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", price);
		Where.printStore();
	}
	
}
