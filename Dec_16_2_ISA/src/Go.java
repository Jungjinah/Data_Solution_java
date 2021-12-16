
public class Go extends People{

	String army;
	String armyGrade;
	
	public Go() {
		// TODO Auto-generated constructor stub
	}

	public Go(String name, int age, String army, String armyGrade) {
		super(name, age);
		this.army = army;
		this.armyGrade = armyGrade;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(army);
		System.out.println(armyGrade);
	}
	
	
	
	
}
