import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		
		// ����
		// (�ڷ��� ������ = ��;)
		// =(���Կ�����)
		// A = B
		// ���׿� �ִ� ���� ���׿� �־��.
		// ������ ���� ���� �� ���
		
		// ��Ģ���� (Scanner + ���)
		// ���ڴ� 2���� �Է¹��� (x, y)
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = key.nextInt();
		
		System.out.print("y = ");
		int y = key.nextInt();
		
		//System.out.printf("ù��° ���� : %.2f\n", x + y);
		//System.out.printf("�ι�° ���� : %.2f\n", x * y);
		//System.out.printf("����° ���� : %.2f\n", x / y);
		//System.out.printf("�׹�° ���� : %.2f\n", (x - y)/3);
		//System.out.printf("�ټ���° ���� : %.2f\n", x * y * ( x - y ));
		
		 int plus = x + y;
		 int minus = x - y;
		 int multiply = x * y;
		 int divide = x / y;
		
		System.out.printf("%d + %d = %d\n" , x, y, plus);
		System.out.printf("%d - %d = %d\n" , x, y, minus);
		System.out.printf("%d * %d = %d\n" , x, y, multiply);
		System.out.printf("%d / %d = %d\n" , x, y, divide);
			// int / int = int (Java ����) ex)  10 /  4 = 2 (o), 2.5 (x)
			// double / int = double
			// int / double = double
			// double / double = double
		double divide2 = (double) x / y; // �� ��ȯ
		System.out.println(divide2);
		
		int remainder = x % y; // ������ �� ������ �� ���� ��
							   // ex) 10 % 4 = 2 (o)
		System.out.println(remainder);
		
		// �ٽ� �����ε�!!
		// x = 10, y = 4
		// A = B �� ���ٴ� �ǹ̰� �ƴ϶�, <A�� B�� �־��!>
		System.out.println("-------------------");
		System.out.printf("x�� %d\n", x);
		System.out.printf("y�� %d\n", y);
		
		x = y;
		
		System.out.printf("x�� %d\n", x);
		System.out.printf("y�� %d\n", y);
		System.out.println("-------------------");
		
		// ���Կ����� Ȱ��
		// [+=, -=, *=, /=, %=]
		// �� ���ڴ� 2byte -> �� ���ڶ� �� ġ��... bset~
		x += 1; //x = x + 1;
		System.out.println(x);
		x -= 1; //x = x - 1;
		System.out.println(x);
		x *= 2; //x =  x * 2;
		System.out.println(x);
		x /= 2; //x = x / 2;
		System.out.println(x);
		
		x %= 2; //x = x % 2;
		System.out.println(x);
		
		System.out.println("-------------------");
		x++; //x += 1; //x = x + 1;
		System.out.println(x);
		
		x --; //x -= 1;//x = x - 1;
		System.out.println(x);
		System.out.println("�÷����� ���̳ʽ��� �ٿ��� �����ؿ�!");
		System.out.println("-------------------");
		
		
		
		
		
		
	}
}
