import java.util.Random;
import java.util.Scanner;

public class FMain5 {
	
	// B : �Լ��� / ����� �����̶� ���̱�,, ���簰�� �۸�
	// 			  ��Ÿü , ��ü Ȱ��
	// C : �Ķ���� / �Լ��� ȣ���ϴ� �ʿ���(Main �Լ�)���� �ش� �Լ� ������ �����͸� ���� ��
	//				( �ڷ��� ������, �ڷ��� ������, ...)
	// A : ����Ÿ�� / �ش� �Լ����� �۾��� ����� ȣ���� ��(Main �Լ�)���� ���� ��
	//				
	// public static A B ( C ) {
	//		����	
	//		 return
	// }
	
	// ���� ������ ���ϴ� �Լ�
	public static String getWeather() {
		//���� ���� ���� -> blue
		String weather = "����";
		return weather;
		
	}
	
	// 1. ������ ������ �ϳ� ���ϴ� �Լ�
	public static int get() {
		Random r = new Random();
		int i = r.nextInt();
		return i;
		
	}
	
	// 3. �� ������ ���� ���� ����ϴ� �Լ�
	public static void plus(int a, int b) {
	System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		
		String weather = getWeather();
		System.out.println(weather + "^^7");
		System.out.println("------------");

		get();
		
		// 2. ������ ���� 2�� ���ؼ�,,
		int a = get(); 
		int b = get();
		System.out.println(a);
		System.out.println(b);
		
		// 4. ������ ���� 2�� ���� ���� ��� (3�� �̿��ؼ�)
		plus(a, b);
	}
	
}
