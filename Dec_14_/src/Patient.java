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
		System.out.println("< 손님 >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("---------------");
	}
	// 이름에 대해 대답
	public String answerName( ) {
		return mouth.next();
	}

	// 키에 대해 대답
	public double answerHeight() {
		return mouth.nextDouble();
	}
	// 몸무게에 대해 대답
	public double answerWeight() {
		return mouth.nextDouble();
	}

}
