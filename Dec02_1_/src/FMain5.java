import java.util.Scanner;

public class FMain5 {
	
	// ������ �ϰ� �ִµ�... ������ �ɺθ��� ���ѿ�
	public static void doit () {
		System.out.println("��ġ�� ���⸧ ��� ���� �ܵ� ��������!");
		System.out.println("��������");
		System.out.println("�� �ٳ��~");
		System.out.println("�Ѵ� ��������");
		System.out.println("�ٷ� �;��Ѵ���~");
		System.out.println("---------------------------");
		
	}
	
	// ������ ���� �̴ּ�! (�� = �Է�)
	
	public static int takeMoney () {
		Scanner key = new Scanner(System.in);
		System.out.print("�ݾ� : ");
		int money = key.nextInt();
		
		System.out.printf("������ %d�� �ֽ�~\n", money);
		return money;
		// ->
		// ����(int)�� ���� ���� main�Լ��� return, ��ȯȰ�Ŵϱ�
		// return Ÿ���� int�� ����!
	
	}
	
	
	// �ɺθ� �߿�.. (��� : 3200, ��ġ : 2170, ���� : 1500)
	// ���� �󸶳� ������.. ������...
	
	public static void gusrumdon (int money) {
		
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		// ����ϴ� �Լ�
		//		����̶�� �۾��� �Ϸ��� '�޾ƿ� ��'�� �ʿ�
		//		�� ���� �Ķ���ͷ� �����ð�!
		System.out.printf("�Ž������� %d�� ��ŭ ���Ƶ�~\n", money - (ramen + tuna + snack));
		System.out.println("--------------------");
		
		
	}

	// ����ϰ�, �ܵ��� �������� ����..
	public static int takeMom (int money) { // �������� �ٰ� ����ϱ�
		
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500; // ���뿡 ����Ұ� �ø���
		
		int restMoney = money - (ramen + tuna + snack); // �������� �� �����ٰ� ����
		
		//System.out.printf("�Ž����� %d�� ���Դµ� ���� �ٰ�,,\n", restMoney);
		return tuna;
	}
	
	
	public static void main(String[] args) {
		
		doit();
		//takeMoney();
		System.out.println("--------------");
		int money = takeMoney();
		// System.out.println(money);
		System.out.println("--------------");
		gusrumdon(money);
		int RestMoney = takeMom(money);
		System.out.println(RestMoney);
	}	
	// �Լ��� ǥ���ϴ� 4���� ���!
	// main�� �ҽ��� �ִ��� ª�� �����ϱ� ���ؼ�
	// ��ɵ��� ��� �Լ���°� ���!
	// ����� ������ ȿ�������� ���!
	
	// void -> ���⼱ return�Ұ� ����!
	// ���� �Լ���Ʈ��!
}
