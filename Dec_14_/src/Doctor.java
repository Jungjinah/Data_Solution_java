import java.util.Iterator;
import java.util.Scanner;

// ��������(Local Variable)
//		�޼ҵ� �ӿ��� ���� ����
//		�� �ൿ�� �ϴ� ���ȸ� �ʿ��� �ӽú�����
// �޼ҵ� �Ķ����(Parameter)
//		�� �ൿ�� �ϴµ� �ʿ��� ���
// ���ϵǴ� ��
//		�� �ൿ�� �ϰ� �� �����
// �������(Member Variable)
//		�� ��ü�� �Ӽ�


public class Doctor {
	String name;
	
	int age;

	public void printDoctor() {
		System.out.println("< �ǻ� >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("---------------");
	}
	
	public void Start() {
		Patient p = callPatient();
		p.name = askName(p);
		p.height = askHeight(p);
		p.weight = askWeight(p);
		p.bmi = calBMI(p);
		System.out.println(p.bmi);
		p.bmiResult = judgeBMI(p);
		tellResult(p);
	}
	public Patient callPatient() {
		Patient p = new Patient();
		return p;
	}
	
	// �մ� �θ���
	public String askName(Patient p) {
		System.out.print("�̸� : ");
		String n = p.answerName();
		return n;
	}	
	// Ű ����(cm)
	// ��� : ��� ���
	// ��� : �մ��� Ű
	public double askHeight(Patient p) {
		System.out.print("Ű(cm) : ");
		double h = p.answerHeight();
		if (h >= 1 && h <= 300) {
			System.out.println("==========");
			System.out.println("�׷�����!");
			System.out.println("==========");
		}else if ( h < 1 || h > 300) {
			System.out.println("==========");
			System.out.println("�ٽ� �Է��ϼ���");
			System.out.println("==========");
		}
		return(h >= 1 && h <= 300) ? h / 100 : askHeight(p);
	}
	
	// ������ ����
	public double askWeight(Patient p) {
		System.out.print("������(kg) : ");
		double w = p.answerWeight();
		if (w >= 1) {
			System.out.println("==========");
			System.out.println("�׷�����!");
			System.out.println("==========");
		}else if (w < 1) {
			System.out.println("==========");
			System.out.println("�ٽ� �Է��ϼ���");
			System.out.println("==========");
		}
		return(w >= 1) ? w : askWeight(p);
	}
	
	// BMI ���
	// ��� : �մ�����(Ű, ������)
	// ��� : BMI��
	public double calBMI(Patient p) {
		return p.weight / (p.height * p.height);
		
	}
		
	// �����ؼ� �������
	public String judgeBMI(Patient p) {
		if (p.bmi >= 40) {
			return "����";
		}else if (p.bmi >= 35) {
			return "��������";
		}else if (p.bmi >= 30) {
			return "�浵";
		}else if (p.bmi >= 25) {
			return "��ü��";
		}else if (p.bmi >= 18.5) {
			return "����";
		}else {
			return "��ü��";
		}
	}
	
	// ��� ����ϱ�(�˷��ֱ�)
	public void tellResult(Patient p) {
		System.out.printf("ü��������(BMI) : %.1f\n", p.bmi);
		System.out.printf("����� ...%s�̴ϱ�...NAGA!", p.bmiResult);
	
	}
	// ���� ������ ������ �κ�
		
//		Patient p = callPatient();
//		p.height = askHeight(p);
//		p.weight = askWeight(p);
//		p.bmi = calBMI(p);
//		p.bmiResult = judgeBMI(p);
//		tellResult(p);
	
}