// A is a B : ��Ӱ���
// ���� ���� '�̴�'

// Overloading : �޼ҵ带 ���� �� ���� ����̶�� �޵����� ����
//				 (�Ķ������ �ڷ����� �ٸ��ų�, �Ķ������ ������ �޶����)
// Overriding : ��ӹ޴� Class������ method��� ���ƾ���.


public class Lion extends Animal { 	// Animal�� ����� �޾ƿ�
	// Animal �ȿ� Lion�� '���' �Ǿ��ִ�
	// ��� : inheritance
	// Ȯ�� : extends
	
	String inhabit;
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}

	public Lion(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}
	
	// @xxx : Annotation -> � ����� �ڵ����� �������ش�.
	@Override	// ��ӹ޾ƿ� method�� ����� �ٲٴ� ��
	public void printInfo() {
		// override�� ����Ϸ���..
		//	��ӹ޴� Class������ method��� ���ƾ�!
		// TODO Auto-generated method stub
		super.printInfo(); // ����Ŭ����.printInfo();
		System.out.println(inhabit);
	}
	
}
