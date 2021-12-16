
public class Notebook extends Computer {

	
	double weight;
	double battery;
	
	
	public Notebook() {
		// TODO Auto-generated constructor stub
	}
	



	public Notebook(String name, int price, String cpu, int ram, int hdd, double weight, double battery) {
		super(name, price, cpu, ram, hdd);
		this.weight = weight;
		this.battery = battery;
	}




	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		System.out.printf("%.1fkg\n" ,weight);
		System.out.printf("%.1f½Ã°£\n",battery);
	}
	
	

	
	
	
	
	
	
	
}
