import java.util.Random;
import java.util.Scanner;

// for, while, do-while

public class CMain2 {
	public static void main(String[] args) {
		// �ݺ��� 10�� -> �ݺ��� 1���� �������� �ȳ��ϼ��� x 3����
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 3) {
				continue;
			}
			System.out.println("�ȳ��ϼ��� 1");
			System.out.println("�ȳ��ϼ��� 2");
			System.out.println("�ȳ��ϼ��� 3");
			
		}
		System.out.println("----------------");
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("��");
			}else {
				//continue;	// �����ݺ�(������) -> Ȧ���϶��� �����ϰ�, �������� �Ѿ
				break; 		// (������), �ݺ����� ��!
				//return;		// (�������). �Լ��� ��, ��¶�簣�� �ݺ����� ����
				
			}
		}
		System.out.println("--------------");
		// �ڸ�Ʈ������ �Է� �����ǵ�, ������ ��� �޾ƿ� ��
		// ������ "����"�� �ݺ��� ��!
		
		Scanner key = new Scanner(System.in);
		String c = null;
		
		while (true) { // () �ȿ� ���� ���� �ָ��Ѱ� true������ -> break�� ������ ���ѹݺ�!
				System.out.println("���� : ");
				c = key.next();
				System.out.println("----------");
				System.out.println(c);
				System.out.println("----------");
				if (c.equals("����")) {
					System.out.println("�ݺ��� ��!");
					break;	// �ݺ��� �ڻ�!
				}
			}
		}	
	}







