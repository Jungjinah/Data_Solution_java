import java.util.Scanner;

// ��������
//		����� boolean (true / false)
//		>, >=, ==, !=, <, <=
//	 �ʰ�, �̻�, ����, �ٸ�, �̸�, ���� 
public class OMain3 {
	public static void main(String[] args) {
		
	// ���̰������� ���̱ⱸ�� Ÿ�� �ǳ� �������ִ� ���α׷�
	// Ű(cm),  ����
	// Ű�� xxxcm, ���̴� xx��
		
		
	Scanner key = new Scanner(System.in);	
		
	System.out.print("Ű :");
	double Height = key.nextDouble();
	
	System.out.print("���� :");
	int age = key.nextInt();
	
	System.out.printf("Ű�� %.1fm , ���̴� %d��\n", Height, age);
	
	System.out.println("--------------------------------");
	
	// ���̰� 10���� �Ѵ� ����� Ż �� ����
	boolean agee = (age > 10);
	System.out.printf(">10 ž�� ���� ? : %b\n", agee);
		
	// ���̰� 5�� �̸��� Ż �� ����
	boolean age1 = (age <5);
	System.out.printf("<5 ž�� ���� ? : %b\n", age1);
	
	// ���� 20�츸 Ż �� ����!
	boolean age2 = (age == 20);
	System.out.printf("==20 ž�� ���� ? : %b\n", age2);
	
	// ���� 1�츸 �ƴϸ� ��
	boolean age3 = (age != 1);
	System.out.printf("!=1 ž�� ���� ? : %b\n", age3);
	
	// ���̰� Ȧ���� ����� Ż �� ����!
	boolean age4 = (age % 2 == 1 );
	System.out.printf("=Ȧ�� ž�� ���� ? : %b\n", age4);
	
	System.out.println("--------------------------------");
	
	// ����������� ����!
	//	~�� (and) : &&
	//			 -> Ȯ�� ���� ���� ������ ��ġ
	//	~�ų� (or) : || (shift + \)
	//	XOR		  : ^  (eXclusive OR) => �� �Է��� ���� �ٸ� �� '1' ������� ���
	//	NOT		  : !  => ����� ������ ��
	
	// A && B : A�� ����, B�� ���� => ���� ok!
	//	-> Ȯ���� ���� ������ ������ ��ġ,, 
	// A || B : A�� �����ϰų�, B�� �����ϰų�, �� �� �����ϰų� => ���� ok!
	//	-> Ȯ���� ���� ������ ������ ��ġ,,
	
	// ���̰� 3���� �Ѱ�, Ű�� 2m �Ѿ�� Ż �� ����!
	//       95%              5%         => 95% �̻��� Ȯ���� 2�� �˻��ؾ�,,
	// Ű�� 2m�� �Ѿ�� 		���̰� 3���� �Ѿ�� �Ѵٸ�
	//		5%						95%  => 95%�� Ȯ���� 1���� �˻��ص� ����,, 
	// boolean age5 = (age > 3 && Height > 200);
	boolean age5 = ( Height * 0.01 > 2 && age > 3 );
	System.out.printf("�� ���Ե�? : %b\n", age5);
	
	// Ű�� 1.9m �Ѱų�, ���̰� 50�� �̸� ž��
	boolean mixx = (age < 50 || Height * 0.01 > 1.9 );
	System.out.printf("���߿� �ϳ� ���Ե�? : %b\n", mixx);
	
	// 10 < ���� < 40�̸� Ż �� ����	
	boolean ages = (10 < age && age < 40 );
	System.out.printf("���� ����? : %b\n", ages);
	
	
	// ���̰� 10�� �̻��̴���, Ű�� 1.5m �̻��̴��� �ϳ���
	boolean agess = (age >= 10) ^ (Height >= 1.5);		
	System.out.printf("����Ű ����? : %b\n", agess);
	
	// agess�� Ż �� �ִ� ����� ��Ÿ��,
	// agess�� Ż �� ���� ����� Ż �� ����
	boolean agesss = !((age >= 10) ^ (Height >= 1.5));		
	System.out.printf("����Ű ����?? : %b\n", agesss);
	
	// �� ���
	// 0(����), 1(��)
	
	
	
	
	
	
	
		
	}
}
