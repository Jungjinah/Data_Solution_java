
// ��������....������!
// Call By Value, Call By Reference
// ��� ���� ���� �Ǿ����� ������ �� �־��..!

// Call By Value : ������ '��'�� �����ؼ� �Լ��� �Ķ���� ������ ����ϴ� ��
// Call By Reference : ������ �����ϴ� �ּҰ�(������)�� �Ķ���ͷ� �����ϴ� ��

public class PMain5 {
	public static void test(int a, int[] b, int[] c ) {
		System.out.println("b(green)" + b);	// ������
		System.out.println("c(green)" + c);	// ������
		System.out.println(a + "a(green)");		
		System.out.println(b[0] + "b(green)");
		System.out.println(c[0] + "c(green)");
		a = 100;
		b[0] = 100; // main�ʿ� ������ ��(������)
					// �⺻���� �������� ����!
		c = new int[] { 100, 200};  // ���ο� �迭�� �������
									// �� �״�� ���ο� �� (new)
									// new int[] �� ����� -> ����� �� ���� ����(���Խ��� �ƴ϶�/ �� �״�� ���)
									// new int[] �� ���Խ�
		System.out.println("b(green)" + b);
		System.out.println("c(green)" + c);
		System.out.println("a(green)" + a);		// 20000
		System.out.println(b[0] + "b(green)");
		System.out.println(c[0] + "c(green)");
		
	}
	
	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		System.out.println("b(red)" + b); // ������
		System.out.println("c(red)" + c); // ������
		test(a, b, c); // test �Լ� ���� �ö�,,
		System.out.println(a + "a(red)");
		System.out.println(b[0] + "b(red)");	// *** �� ���濡 ������ �޾���
		System.out.println(c[0] + "c(red)");	// *** �� ���濡 ������ ���� �ʾ���
												// test �Լ��� ����� c�ʹ� �ٵ帯 ������
	
	}
}
		
	

