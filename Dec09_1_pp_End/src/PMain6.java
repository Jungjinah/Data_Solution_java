import java.util.Scanner;

// Bubble Sort : ������ �� �׸��� ���� ���ؼ�
//				 ���ؿ� �����ϸ� ������ ���� ��ȯ�ϴ� ���Ĺ��

// ���ڸ� �Է¹޾Ƽ� �迭�� ���� �� ( ���ڴ� 5��)
// ���� �� ���� ���
// ����
// ���� �� ���� ���
// ���� �Լ� ���� !

public class PMain6 {
		
	
	
			 
		public static void main(String[] args) {
			
			Scanner key = new Scanner(System.in);
			System.out.println("----------------");
			int[] num = new int[5];
			for (int i = 0; i < num.length; i++) {
				System.out.printf("%d��° ���� �Է� : ", i + 1);
				num[i] = key.nextInt();
					//if (num[i]> num[i + 1]) {
					//	System.out.print(num[i]);
					//}else if (num[i] <= num[i + 1]){
					//	System.out.print("�ٽ� �Է� : ");
					
				//	}
			}
			System.out.println("----------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.println("\n----------------");
			
			System.out.printf("�迭�� ���� : %d\n", num.length);
			
			System.out.println("----------------");

			for (int i = 1; i < num.length; i++) {
					System.out.printf("%d��\n", num[i]);
					if (i > i + 1) {
						System.out.printf("%d %d", num[i+1], num[i]);
					}
					System.out.printf("���� �� �� : %d %d %d %d %d", 
							num[i + 1], num[i], num[i+2], num[i+3], num[i+4]);		
			
			
			
					
					
					
					
			}
			System.out.println("----------------");
			
			
		}			 
					 
}





















