import java.util.Iterator;
import java.util.Scanner;

public class PMain6_1 {
	
	// ���ڸ� �Է¹޾Ƽ� �迭�� ���� �� (���ڴ� 5��)
	public static int[] getNum() {
		Scanner key = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1); // �迭�� 0���� �����̶� +1dksgkaus 0��° ����,,
			num[i]= key.nextInt();
		}
		System.out.println();
		System.out.println("-----------------");
		return num;
	}
// ���� �� ���� ���
	public static void printNum(int[] num) {
		System.out.println("<< �Է��� �� >>");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
// ����
	public static int[] getResult(int[] num) {
		int b = 0; // ���� ���� �׸�
		System.out.printf("�迭�� ���� : ", +num.length);
		System.out.println("-----------------");
		for (int turn = 1; turn < num.length; turn++) {
			System.out.println(turn + "��");
			for (int i = 0; i < num.length - 1 ; i++) {
			// num.length -1 �� �� ���� :	
			// if�� �ȿ��� ����� �� ��, ���� �迭���� ���ϱ� ���ؼ�
			// +1�� ����ߴµ�
			// length ���� �״�� ����ϸ� ������ �߻���!
				if (num[i] > num[i +1]) {
					b = num[i];
					num[i] = num[i +1];
					num[i + 1] = b;
				}
				System.out.print(num[i] + " ");
			}
			System.out.println(num[4]);
			System.out.println("���ĵ� �� : " + b);
			System.out.println("----------------");
		}
		return num;
	}
// ���� �� ���� ���
	public static void printResult(int[] result){
		System.out.println("<< ���� �� �� >>");
		for( int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
// ���� �Լ� ����!
	public static void main(String[] args) {
		int[] num = getNum();
		printNum(num);
		int[] result = getResult(num);
	}
	

}

// ��ǻ� ũ�� �ǹ̰� ����..!
// ���ɿ��� ȿ���� ���� ������..
// ���׿����θ� ���,,,,,,,,,,,,,,,,,
// ��������, ��������, ������, �պ�����, .....




