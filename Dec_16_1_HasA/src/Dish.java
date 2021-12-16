
public class Dish {

	String name;
	int price;
	Bulgogi dish;
	
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}


	public Dish(String name, int price, Bulgogi dish) {
		super();
		this.name = name;
		this.price = price;
		this.dish = dish;
	}
	
	public void printDish() {
		System.out.println(name);
		System.out.println(price);
		dish.printBulgogi();
	}
	
	public void printDishInfo() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", price);
	}


		

}
