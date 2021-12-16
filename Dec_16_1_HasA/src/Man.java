
public class Man {

	String name;
	String gender;
	String phoneNum;
	
	public Man() {
		// TODO Auto-generated constructor stub
	}

	public Man(String name, String gender, String phoneNum) {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	
	public void printInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %s\n", gender);
		System.out.printf("폰번호 : %s\n", phoneNum);
	}
	
	
	
	
}
