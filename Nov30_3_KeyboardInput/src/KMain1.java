import java.util.Scanner;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class KMain1 {
	public static void main(String[] args) throws InterruptedException {
		
		// Scanner : Java�� ����Ǿ��ִ� ��� �� �ϳ�!
		// �� ����� �ҷ����� ���� Import��� ���� ����
		// �� Scanner��°� ����Ϸ��� ������ �ϳ� �ʿ��ѵ�,,
		
		
		// new ~~ : ��ü 
		
		// Scanner�� ȭ��(��Ŭ������ �ܼ�â)���κ��� �����͸� �Է� �޴� ���
		
		// �Է��� �غ� �ؼ� keyboard��� ������ ����
		Scanner Keyboard = new Scanner(System.in);
		
		// �̸��� �ܼ�â�� ����Ұǵ�,,
		System.out.print("�̸� : ");
		String name = Keyboard.next();
		System.out.println(name);
		
		// Ű, ��� ��, �Ź߻�����, �����ϴ� ����, �Ļ� ����
		
		System.out.print("Ű :");
		int height = Keyboard.nextInt();
		System.out.println(height);
		
		System.out.print("��� �� :");
		String address = Keyboard.next();
		System.out.println(address);
		
		
		System.out.print("�Ź߻����� :");
		int shoesize = Keyboard.nextInt();
		System.out.println(shoesize);
		
		System.out.print("�����ϴ� ���� :");
		int likeyNum = Keyboard.nextInt();
		System.out.println(likeyNum);
		
		System.out.println("�Ļ� ���� :");
		boolean meal = Keyboard.nextBoolean();
		System.out.println(meal);
		
		
		System.out.printf("�̸�\t: %s\n", name);
		System.out.printf("Ű\t: %dcm\n", height);
		System.out.printf("��°�\t: %s\n", address);
		System.out.printf("�����ϴ� ����\t: %d\n", likeyNum);
		System.out.printf("�Ļ� ����\t: %b\n", meal);
		
		System.out.print("���� ������ �ƹ��ų� �Է� : ");
		String quit = Keyboard.next();
		Keyboard.close();
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("���α׷��� �����մϴ�!");
		
		
		Thread.sleep(5000);
		System.out.print("������ �ݺ���~");
		Thread.sleep(5000);
		System.out.print("������ �˾���~~");
		
		
		
		
		
		
	}
}
