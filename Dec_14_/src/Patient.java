import java.util.Scanner;

public class Patient {
	static String name;
	int age;
	Scanner mouth = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	String bmiResult;
	
	public void printPatient() {
		System.out.println("< �մ� >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("---------------");
	}
	// �̸��� ���� ���
	public String answerName( ) {
		return mouth.next();
	}

	// Ű�� ���� ���
	public double answerHeight() {
		return mouth.nextDouble();
	}
	// �����Կ� ���� ���
	public double answerWeight() {
		return mouth.nextDouble();
	}

}
