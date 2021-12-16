
public class Dealer {
	
	String name;
	Market dealer;
	
	
	public Dealer() {
		// TODO Auto-generated constructor stub
	}


	public Dealer(String name, Market dealer) {
		super();
		this.name = name;
		this.dealer = dealer;
	}
	
	public void printDealer() {
		System.out.println(name);
		dealer.printMarket();
		
	}
	
	

}
