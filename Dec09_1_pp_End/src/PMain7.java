import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain7 {
	
	
	
	
	public static void main(String[] args) {
//		int[] num = {12, 30, 45, 85, 1, 3, 9, 100, 77, 54};
//		for (int i : num) {
//			System.out.print(i +" ");
//		}
		
		// 10���� ���ڸ� �������� �̾Ƽ� (1-100)
		// �迭�� ������! -> ���
		
		
		Random r = new Random();	// �����ؾ���
		
//		int[] num = new int[10];
//		for (int i : num) {
//			int a = r.nextInt(100) + 1;
//			num[i] = a;
//			System.out.println(num[i] + " ");
//		}
		
		int[] num = new int[10]; // �迭 �����
		for (int i = 0; i < num.length; i++) { // for�� ����ϴ� ������ �ݺ��ϱ����ؼ�,,
			int a = r.nextInt(100) + 1;		// 1-100 ���� �߿��� 10���� ���ڸ� �̱� ���� ����������
			num[i] = a;						// num[i] => �׸�, a�� 100���� ���������߿��� 10���� ���ڸ� �ϳ��� 10���� �׸��� �־�.
			System.out.print(num[i] + " ");	// ���� ����(������ ���� �ϱ� ���� ���� ����)
		}
		
		
		// 10���� ���ڸ� ���� �Է��ؼ�
		 //�迭�� ��� -> ���
		System.out.println("\n----------------");   
		Scanner key = new Scanner(System.in);
		int[] nuM = new int[10];
		int a = 0;
		for (int i = 0; i < nuM.length; i++) {			// for�� �� ������ 10���� �Է��� �޾Ƽ� �迭���� �־��ش�.
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i + 1);
			a = key.nextInt();
			nuM[i] = a;
		}											
		for (int i = 0; i < nuM.length; i++) {			// for�� �� ������ �迭�� ���� ���� ���� ���ؼ�.
			System.out.print(nuM[i] + " ");
		}														
//		for (int i : nuM) {
//			System.out.println(i + " ");
//		}
		
		// �迭 num�� (Random���� �޾ƿ�) �ִ밪, �ּҰ� ���ϱ�
			
			int max = num[0];	// �迭�� 0��° ���ڰ� �ִ밪�̶�� ����
			int min = num[0];	// �迭�� 0��° ���ڰ� �ּҰ��̶�� ����
			for (int j = 0; j < nuM.length; j++) {
				if(min > num[j]) {	// min�� �ִ� ���ں��� num[j]�� ���ڰ� �� �۴ٸ�
					min = num[j];	// num[j]�� ���ڰ��� min�� �Ű� ���
				}else if (max < num[j]) {	// max�� �ִ� ���ں��� num[i]�� ���ڰ� �� ũ�ٸ�
					max = num[j];		// num[j]�� ���ڰ��� max�� �Ű� ���
					
				}
			}
		
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);
		
	}		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
}
