
public class Kim extends People{
	
	String school;
	int grade;
	
	
	public Kim() {
		// TODO Auto-generated constructor stub
	}


	public Kim(String name, int age, String school, int grade) {
		super(name, age);
		this.school = school;
		this.grade = grade;
	}
	
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(school);
		System.out.printf("%d«–≥‚\n", grade);
	}
	
	

}
