
// PP : �����������α׷���
//  -> ������ ������� �� �ٷﺼ��..
// ������
// Shift ������...
// 3 << 1 : 6
//		���� ���ڸ� 2������ �ٲ㼭 : 11
//		�������� ���� ���ڸ�ŭ �а�, ��ĭ���� 0 ä���ֱ� : 110
//		������(110)�� �ٽ� �������� : 6

public class PMain2 {
	// 24�ð�  : 1 << 0 = 1
	// ������  : 1 << 1 = 2
	// Wifi  : 1 << 2 = 4
	// ������  : 1 << 3 = 8
	
	public static void main(String[] args) {
		int button1 = 14;
		if (button1 >= (1 << 3)) {
			System.out.println("������");
			button1 -= (1 << 3);
		}
		if (button1 >= (1 << 2)) {
			System.out.println("Wifi");
			button1 -= (1 << 2);
		}
		if (button1 >= (1 << 1)) {
			System.out.println("������");
			button1 -= (1 << 1);
		}
		if (button1 >= (1 << 0)) {
			System.out.println("24�ð�");
			button1 -= (1 << 0);
		}
		System.out.println("button1");
		System.out.println("-------------");
		int button2 = 13;
		String[] option = {"24�ð�", "������", "Wifi", "������"} ;
		for (int i = option.length -1; i >= 0; i--) {
			if (button2 >= (1 << i)) {
				System.out.println(option[1]);
				button2 -= (1 << i);
			}
		}
		System.out.println(button2);
	}
	
}