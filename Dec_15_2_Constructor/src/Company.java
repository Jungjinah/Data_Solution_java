
public class Company {

	String companyName;
	String location;
	int employee;
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}


	public Company(String companyName, String location, int employee) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.employee = employee;
	}
	
	public void printCompany() {
		System.out.printf("회사 이름 : %s\n", companyName);
		System.out.printf("회사 위치 : %s\n", location);
		System.out.printf("회사 직원수 : %d명\n", employee);
	}
	
	
	
}
