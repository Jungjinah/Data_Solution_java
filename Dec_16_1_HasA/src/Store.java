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
		
		System.out.printf("가게 이름 : %s\n", name);
		System.out.printf("가게 위치 : %s\n", location);
		System.out.printf("가게 번호 : %s\n", phoneNumber);
		
		
	}
	
	
	
	
	
}
