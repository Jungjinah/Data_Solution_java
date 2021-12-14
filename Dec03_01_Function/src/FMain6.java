import java.util.Random;
import java.util.Scanner;

// ����� ȣ�� (recursive call)
// �Լ� �ӿ��� �ڱ� �ڽ�(�� �Լ�)�� �� ȣ�� -> �ݺ�

// �Լ��� �θ��� -> �����۾�


public class FMain6 {
	
	// 1) ��������
	// ������ �ϳ� ������
	// 1 + 2 + 3 + ... + �� ���ڱ���
	// �� ���ϴ� ���� �����ִ� �Լ�
	
	// add(1) = 1
	// add(2) = 3 add(1) + 2
	// add(3) = 6 add(2) + 3 = add(1) + 2 + 3
	
	public static int add(int x) {
		
		int answer = (x == 1) ? 1 : (x + add(x - 1));
		return answer;
	}
	
	// 2) ������ �ϳ� ������ factorial �� ���ϴ� �Լ�
	public static int multiply(int a) {
		int result = (a == 1) ? 1 : (a * multiply(a - 1));
		return result;
	}
	
	// 3) 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ... -�Ǻ���ġ����
	public static int pbnchi(int b) {
		int result = (b < 3) ? 1 : (pbnchi(b-1) + pbnchi(b-2  ));
		return result;
		
	}
	
	public static void main(String[] args) {
	int i = add(10);
	System.out.println(i);
	System.out.println("-----------");
	int a = multiply(4);
	System.out.println(a);
	
	int b = pbnchi(3);
	System.out.println(b);
	
}
}
