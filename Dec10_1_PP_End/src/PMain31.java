
// �Ž����� ȯ�� ���α׷�
// �Լ� ���


// <�Է�>
/* ������ ���� ���� : 35000
 * �� �� : 41530
 * ----------------
 * �Ž��� ��: 6530��
 * 			50000 :
 * 			10000 :
 * 			5000 : 1
 * 			1000 : 1
 * 			500 : 1
 * 			100 : 
 * 			50 :
 * 			10 : 3
 */

public class PMain31 {
	
	// �Ž������� ���� ���� ��� �� ������ ���
	public static void printChange() {
		
		// 1.
		int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < currency.length; i++) {
			if (change >= currency[i]) {
				System.out.println("%d���� : %d��\n", currency[i], (change / currency[i]));
				change %= currency[i];
			}
		}
		
		// 2.
		int currency2 = 10000;
		while (true) {
			currency2 /= 2;
			if(change >= currency2) {
				System.out.printf("%d���� : %d��\n", currency2, (change / currency2));
				change %= currency2;
			}
			currency2 /= 5;
			if
		}
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	
}
