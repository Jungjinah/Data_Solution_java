import java.util.Iterator;

// ���� for�� >> for���ȿ� for�� >> (��ø for��)

public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i�� : %d-----\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j�� : %d\n", j);
				
			}
			
		}
		System.out.println("---------------");
		// ������
		for (int j = 1; j < 10 ; j++) {
			System.out.printf("--%d�� ���--\n", j);
			
			for (int i = 2; i < 10; i++) {
				//System.out.printf("%d x %d = ", i, j);
				//System.out.printf("%d\n", i * j);
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
		}
		
		// ����� -> ���� ��������..!
		
		/* ��
		 * ����
		 * ������
		 * ��������
		 * ����������
		 */
		System.out.println("\n------------------");

	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		/*	��
		 *   �� 
		 *    ��
		 *     ��
		 *      ��
		 */
	
		System.out.println("\n----------------");
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <= i ; j++) {
				 if (j == i) {
					System.out.print("��");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// if�� �Ⱦ��� �ϴ� ���!
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" "); 		// j�� i���� ���� ������
											// ����� �޲���
				
			}								// �� �̿��� ������ "��"���� �޲���
			System.out.println("��");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "��" : " ");
				
			}
			System.out.println();
		}
		
		// ���������� 
		// ��������
		// ������
		// ����
		// ��
		
		System.out.println("-----------");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 1) ? "��" : "��");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		// ��
		// ������
  		// ����������
		// ��������������
		// ����������������
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 2*i; j++) {
				System.out.print((i % 2 == 0)? "��" : "��");
			}
			System.out.println();
		}
		
		/*			*		
		 * 		   ***
		 * 		  *****	
		 * 		 *******
		 * 		*********
		 */
		System.out.println("-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-(i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i +1; j++) {
				System.out.print("*");
			}
			
				System.out.println();
		}
		
		
	}
	
}










