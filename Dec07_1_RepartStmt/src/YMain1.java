import java.util.Scanner;

public class YMain1 {
	// ���� ������ ������ִ� ���α׷�
	
	// �ð��� �Է� �޾Ƽ� -> �ش�ð��� ���ϴ� ������ ��� -> �ð� ������ �ƴϸ� �ٽ� �Է�
	// ���� 9�� - ���� 6�� : �п����� ����
	// ���� 9��, ���� 6��  : QR���
	// ���� 1�� : ���ɽð�
	// ���� 6�� ~ ���� 8�� : �������� �ð�
	// ���� 6�� - ���� 9�� ������ : "��� + �ı� + �п�����"
	// ���� 8�� - ���� 6�� : "�����ð�  + ��ħ"
	public static int inTime ( ) {		
		System.out.print("<���� ������>\n");
		Scanner key = new Scanner(System.in);
		System.out.print("�ð� : ");
		int time = key.nextInt();
		return (0 <= time && time <= 24) ? time : inTime() ;
	}
	public static void main(String[] args) {
		
		
		int time = inTime();
		//System.out.println(time);
		
		if (time > 9 && time < 13 || time < 18 && time > 13) {
			System.out.println("�п����� ����");
		}else if (time == 9 || time == 18) {
			System.out.println("QR���");
		}else if (time == 13) {
			System.out.println("���ɽð�");
		}else if (time > 18 && time < 20) {
			System.out.println("���� ���� �ð�");
		}else if (time > 6 && time < 9 ) {
			System.err.println("��� + �ı� + �п�����");
		}else if (time >= 20 || time <= 6) {
			System.out.println("�����ð� + ��ħ");
		}
		
		
		
		
	}
	
	

}
