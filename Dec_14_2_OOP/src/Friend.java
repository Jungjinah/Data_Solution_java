import java.util.Random;
import java.util.Scanner;

public class Friend {
	
	int friendNum;
	Random r = new Random();
	
	// ���� ���
	public int answerNumber() {
		int friendNum = r.nextInt(100) + 1; // �̱�
		// �Ӹ������� ���� �ϳ� << ���� >> �ؼ�
		// ���̿� �Ἥ �� ����
		return friendNum;
	}
	
	
	
	
}
