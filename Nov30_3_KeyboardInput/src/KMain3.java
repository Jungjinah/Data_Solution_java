import java.util.Scanner;

public class KMain3 {
	public static void main(String[] args) {
		
		// �޴���(�н���)
		// ������, ����, �, Ƣ��, ...
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.print("������ : ");
		int DD = key.nextInt();
		//System.out.printf("�����̴� %d���̴���\n", DD);
		
		System.out.print("���� : ");
		int SS = key.nextInt();
		//System.out.printf("����� %d���̴���\n", SS);
		
		System.out.print("���� : ");
		int OO = key.nextInt();
		//System.out.printf("������ %d���̴���\n", OO);
		
		System.out.print("���Ƣ�� : ");
		int MM = key.nextInt();
		//System.out.printf("���Ƣ���� %d���̴���\n", MM);
		
		
		int MD = DD + SS + OO + MM;
		System.out.printf("��� �� ���ؼ� %,d���̴���\n", MD);
		
		double RR = (double) MD * 0.9;
		System.out.printf("Ư���� ��Ƽ� %,.0f�� ������~\n", RR);
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		
	
		
		
		
		
	}
}
