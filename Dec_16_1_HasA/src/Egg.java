
public class Egg {

	String name;
	int price;
	Store Where;
	
	public Egg() {
		// TODO Auto-generated constructor stub
	}

	public Egg(String name, int price, Store where) {
		super();
		this.name = name;
		this.price = price;
		Where = where;
	}

	public void printEgg() {
		System.out.println(name);
		System.out.println(price);
		Where.printStore();
	}
	
	public void printEggInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %d\n", price);
		Where.printStore();
	}
	
}
