
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
		System.out.printf("ȸ�� �̸� : %s\n", companyName);
		System.out.printf("ȸ�� ��ġ : %s\n", location);
		System.out.printf("ȸ�� ������ : %d��\n", employee);
	}
	
	
	
}
