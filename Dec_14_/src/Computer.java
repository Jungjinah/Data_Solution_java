import java.util.Random;

public class Computer {
	
	
	int coin = 20;
	int c;
	String afterShakeResult;
	
	public void printComputer() {
		System.out.println("< ��ǻ�� >");
		System.out.println("-----------------");
		//System.out.println(this.count);
	}
	
	public void start() {
		User u = callUser();
		askCount(u);
		//askAnswer(u);
		printResult(shake(), askAnswer(u));
	}
	
	public User callUser() {
		User u = new User();
		return u;
	}
	
	// � ?
	public int askCount(User u) {
		System.out.print("�÷����� ���� ���� : ");
		c = u.answerCount();
		if (c >= 0 && c <= 20) {
			System.out.println("============");
			System.out.println("ok");
			System.out.println("============");
		}else if (c < 0 || c > 21) {
			System.out.println("============");
			System.out.println("�ٽ� �Է��϶�");
			System.out.println("============");
		}
		return(c >= 0 && c <= 20) ? c : askCount(u);
	}
	
	// ��ǻ�� ©©��
	public String shake() {
		Random r = new Random();
		int computercoin = r.nextInt(c)+1;
		System.out.println("��ǻ�Ͱ� ���� ������ => Ȯ�ο�");
		System.out.println(computercoin);
		if (computercoin % 2 == 0) {
//			System.out.println("============");
//			System.out.println("¦");
//			System.out.println("============");
			afterShakeResult = "¦"; 
		}else if (computercoin % 2 == 1) {
//			System.out.println("============");
//			System.out.println("Ȧ");
//			System.out.println("============");
			afterShakeResult = "Ȧ";
		}
		return afterShakeResult;
	}
	
	// Ȧ¦?
	public String askAnswer(User u) {
		//c = u.answerCount();
		System.out.print("Ȧ? ¦? : ");
		String a = u.answerAnswer();
		return a;
	}
	
	// ����
	public void printResult(String computer, String user) {

		if (computer.equals(user)) {
			System.out.println("������");
		}else {
			System.out.println("��");
		}
		
//		String x = shake();
//		String y = askAnswer(u);
//		
//		if (x.equals(y)) {
//			System.out.println("������");
//		}else {
//			System.out.println("��");
//		}
		
	}
	
	
	
	
	
	
	
	
}
