// Restaraurant has a borwser


public class Store {
	
	
	String name;
	String location;
	String phoneNumber;
	Man who;
	


	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String name, String location, String phoneNumber, Man who) {
		super();
		this.name = name;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.who = who;
	}


	public void printStore( ) {
		
		System.out.printf("���� �̸� : %s\n", name);
		System.out.printf("���� ��ġ : %s\n", location);
		System.out.printf("���� ��ȣ : %s\n", phoneNumber);
		
		
	}
	
	
	
	
	
}
