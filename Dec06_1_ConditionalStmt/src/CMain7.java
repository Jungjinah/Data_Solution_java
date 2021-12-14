import java.util.Scanner;

// BMI�˻�
// �̸�, Ű(cm), ������(kg)
// BMI(ü��������) : ������ / (Ű*Ű) -> Ű : m����
// 18.5�̸��̸� ��ü��
// 18.5�̻��̸� ����
// 25�̻��̸� ��ü��
// 30�̻��̸� �浵��
// 35�̻��̸� ��������
// 40�̻��̸� ����

// ��������� ���

public class CMain7 {  
	// �̸� ���
	public static String getName ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = key.next();
		return name;
	}
	// Ű ���
	public static double getHeight ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = key.nextDouble();
		return height;
	}
	// ������ ���
	public static double getWeight ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ : ");
		double weight = key.nextDouble();
		return weight;
	}
	// BMI ���
	public static double getBMI(double weight, double height) {
		double BMI = weight / ((height) * (height) / 10000);
        System.out.print("bmi : ");
		System.out.println(BMI);
		return BMI;
	}
	// ��� �������ִ� �Լ�
	// RAM�� �� ������ -> ������ ���̸� �ȴ�!
	// HDD�� �� ������ -> �ڵ带 ���̸� �ȴ�!
			public static String judgeBMI(double BMI) {
				String result = "��ü��";
				if(BMI >= 40) {
					result = "����";
				}else if(BMI >= 35) {
					result = "��������";
				}else if(BMI >= 30) {
					result = "�浵��";
				}else if(BMI >= 25) {
					result = "��ü��";
				}else if(BMI >= 18.5) {
					result = "����";
				}
				return result;
			}
	// -> �ٷ� ���κ��� �����Բ�
	
	// ��� ���
	public static void bmiResult(double height, double weight, String name, double BMI) {
		System.out.println("--------------");
		System.out.printf("�̸� : %s�Դϴ�.\n", name);
		System.out.printf("Ű : %.1fcm�Դϴ�.\n", height);
		System.out.printf("������ : %.1fkg�Դϴ�.\n", weight);
		System.out.printf("BMI : %.1f�Դϴ�.\n", BMI);
		System.out.println("--------------");
	
	try {
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	
	public static void main(String[] args) {
		
		String nameResult = getName();
		double heightResult = getHeight();
		double weightResult = getWeight();
		double BMI = getBMI(weightResult, heightResult);
			String result = judgeBMI(BMI); // -> �̰� �����Բ� ���
		bmiResult(heightResult, weightResult, nameResult, BMI);
				
		//double BMI = 0;
		
		 if (BMI >= 40) {
			 System.out.println("����");
		}else if (BMI >= 35) {
			System.out.println("��������");
		}else if (BMI >= 30) {
			System.out.println("�浵��");
		}else if (BMI >= 25) {
			System.out.println("��ü��");
		}else if (BMI >= 18.5) {
			System.out.println("����");
		}else {
			System.out.println("��ü��");
	
		}
			
		
		
		
	}
}
