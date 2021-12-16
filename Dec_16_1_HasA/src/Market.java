
public class Market {
	String name;
	String location;
	Dish market;
	
	
	public Market() {
		// TODO Auto-generated constructor stub
	}


	public Market(String name, String location, Dish market) {
		super();
		this.name = name;
		this.location = location;
		this.market = market;
	}
	
	public void printMarket() {
		System.out.println(name);
		System.out.println(location);
		market.printDish();
	}
	public void printMarketInfo() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("��ġ : %s\n", location);
	}
	
	
	
}
