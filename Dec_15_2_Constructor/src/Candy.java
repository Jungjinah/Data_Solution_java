
public class Candy {

	
	String name;
	String taste;
	Company brand;	// �����縦 �ֱ� ���ؼ� company�� �����,,
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	public void printCandy() {
		System.out.printf("���� �̸� : %s\n", name);
		System.out.printf("���� �� : %s\n", taste);
	}
	

	
	
	
}
