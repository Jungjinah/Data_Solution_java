import java.util.Scanner;

// �񸸵� �˻� ���α׷�(�Լ� ����)

// Ű, �����Դ� �Է¹��� ��
// ǥ��ü�� = (Ű - 100) * 0.9
// �񸸵� = (���� ü�� / ǥ��ü��) * 100
// �񸸵��� 120�� ������ '��', �ƴϸ� '�Ⱥ�'

// �Լ� : main�Լ����� java�� �𸣴� ����� ���� �� �Ѱ��� �˾ƺ� �� �ְ�,,, / + ���� 

// ���࿡,,, ǥ��ü���� ���ϴ� ���� 0.8�� �ٲ����..
// �پ��� ����� �Լ� �ϳ��� �����ϰ�, ��������� �����ϰ� ���� ��,, (��������)
// �� ���� �� ���� �� ã�� �� �������..?
// �׷��� ����� �� �з��ؼ� �Լ��� ǥ���� �����..!
// 		-> ���������� �������� ������,,

// ctrl + shift + /(numpad)
// ctrl + shift + *(numpad)
// �޸𸮸� �Ƴ� ���ΰ� vs ������ ���� �� ���ΰ�
public class FMain2 {
	

	// �񸸵� �˻� ����
	public static void startBimando( ) {
		System.out.println("�񸸵� �˻� ����!");
	}
	
	
	// Ű�� �Է¹޴� �Լ�
	public static double getHeight() {
		Scanner key = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = key.nextDouble();
		return height; 
		}
	 
	// �����Ը� �Է¹޴� �Լ�
		public static double getWeight() {
		//  1) Scanner key = new Scanner(System.in);
			System.out.print("������ : ");
		//  2) double weight = key.nextDouble();
		//  3) return weight;
			// return key.nextDouble(); // 2 + 3
			return new Scanner(System.in).nextDouble();
			// -> 1 + 2 + 3
		}
		
	// Ű�� ������ ǥ��ü���� �����ִ� �Լ�
		public static double calcStdWeight(double height) {
			double stdWeight = (height -100) * 0.9;
			return stdWeight;
			// return (height - 100) * 0.9; // ���� ���� ��ħ
		}
		
	// ����ü�߰� ǥ��ü���� ������ �񸸵��� ����ؼ� ���� �����ִ� �Լ�
		public static double calcBimando(double weight, double stdWeight) {
			double bimando = (weight / stdWeight) * 100;
			return bimando;
		}
		
	// ������ �Ⱥ����� ������ ���ִ� �Լ�
		public static String judgeBimando(double bimando) {
			String result = (bimando > 120)? "��" : "�Ⱥ�";
			return result;
		}
		
	// ����� ������ִ� �Լ�
		public static void printResult(double h, double w, double sw, double b, String r) {
			System.out.println("------------------");
			System.out.printf("Ű : %.1fcm\n", h);
			System.out.printf("������ : %.1fkg\n", w);
			System.out.printf("ǥ��ü�� : %.1fkg\n", sw);
			System.out.printf("�񸸵� : %.1f\n", b);
			System.out.printf("����� [%s] �Դϴ�.\n", r);
			System.out.println("------------------");
			
		}
	
	public static void main(String[] args) {
		
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = calcStdWeight(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judgeBimando(bimando);
		printResult(height, weight, stdWeight, bimando, result);
	}

}
