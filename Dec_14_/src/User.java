import java.util.Scanner;

public class User {
	
	Scanner mouth = new Scanner(System.in);
	int count;
	String answer;
	String result;

// ��� ���� : �Ӽ� (�Ұ��� �� ����� ���� ��)
// ���� ���� : �� �ൿ�� �ϴ� ���ȸ� �ǹ��ִ� ��
// �Ķ���� : �� �ൿ�� �ϴµ� �ʿ��� ���
// ���� : �� �ൿ�� �����
	
	public void printUser() {
		System.out.println("< �̿��� >");
		System.out.println("-----------------");
	}

	// ��� ����
	public int answerCount() {
		return mouth.nextInt();
	} 
	// ©©��
	public String answerAnswer() {
		return mouth.next();
	}
	
	
	
}
