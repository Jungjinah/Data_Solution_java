import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// �ǻ� (�̸�, ����)
		Doctor d = new Doctor();
		d.name = "�����";
		d.age = 53;
		
		// �մ� (�̸�, ����)
		Patient p = new Patient();
		p.name = "������";
		p.age = 34;
		p.printPatient();
		d.Start();
		
	}
	
}
