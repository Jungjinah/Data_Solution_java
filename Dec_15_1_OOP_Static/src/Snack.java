
// ������� : ��ü�� �Ӽ� -> (��ü.�Ӽ�)���� ǥ��
//					this : �� ��ü�� ����(�������� o)

// �� ������ ��� ���ڸ� 'DDargiratte'�� ����ٰ� �Ѵٸ�?
//		-> �� �� ����ϴ°� *** 'static' �������
//			- ��ü�� ��� �� �� �ִ� ����
//	     	  -> Ŭ������.xxx
//			- ��ü���� ����Ӽ��� ��Ÿ�� �� ���
//			  -> ��ü�� ������ ���� static ��������� �ϳ���!
//			  -> �޸� ���� o

// static�� ����ϴ� ��� �߿� �������ѹ�����.�� ���� ->  ���ȭ ��Ű�� ���
// -> static final �������
// 		-> ���� �Ұ��� -> ���ȭ,, (���� �������� �ʰڴ�.)
//		static final �ڷ��� ������(��� �빮�� -> ��ȭ��,,) = ����;

// static �޼ҵ�
//		�޸𸮰� ���� �� -> �ƹ�ư �� (���� ���,,,)
//		��ü�� ��� ����� ���� o
//			static�� �ƴ� �ٸ� ����������� ������ �Ұ��� o


public class Snack {

	String name;
	double weight;
	int price;
	static final String MANUFACTURE = "DDargiratte";
	
	
	// �� ������ ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		System.out.printf("�̸� : %s\n", this.name);
		System.out.printf("�߷� : %.1fg\n", this.weight);
		System.out.printf("���� : %d��\n", this.price);
		System.out.printf("������ : %s\n", MANUFACTURE);
		System.out.println("-----------------------");
	}
	
	
	public static void printTaste() {
		System.out.println(MANUFACTURE);
	  //System.out.println(name); // name�� ���� static�� �ƴ� �ٸ� ����������� ���� �߻�..
		System.out.println("�ְ��~~ ¯ ���ֿ�~~");
		System.out.println("-----------------");
		
	}
	
	
	public void snackInfo(String name) {
		this.name = "Ȩ����";
		this.weight = 90;
		this.price = 1500;
		
	
	
	}
	
	
		
		
		
	
}
