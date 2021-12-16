
public class Hong extends People{
	
	String school;
	int grade;
	
	public Hong() {
		// TODO Auto-generated constructor stub
	}

	public Hong(String name, int age, String school, int grade) {
		super(name, age);
		this.school = school;
		this.grade = grade;
	}
	
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(school);
		System.out.printf("%d«–≥‚\n", grade);
	}
	
	
	
}
