
// ����
//	���� 2���� ������ �� ���� ����ϴ� ���

public class SMain2 {
	public static void main(String[] args) {

		Calculation c = new Calculation();
		
		c.printSum(10, 20);  // static o
		c.sum(60, 50, 40);	 // static x

		Calculation.printSum(30, 50); // static o -> �޸𸮸� �� ���� �ذ�, �������� �޸𸮸� �� ��
//		Calculation.sum(10, 20, 39); // static x �׷��� ������!
		
		// ���� �ƶ����� Java�� ���� Ŭ���� �� �ϳ��� Math
		// �̰� ���� ��ü�� ������ �ʰ� ����� ���!
		System.out.println(Math.PI);
		double s = Math.sqrt(10);
		System.out.println(s);
		
		
		
	}
}
