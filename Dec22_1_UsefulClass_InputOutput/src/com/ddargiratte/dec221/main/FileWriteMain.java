package com.ddargiratte.dec221.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/* CPU		: ������ġ
 * RAM		: ������ġ(�ӽ�) - ������ϸ� ���ư�
 * 			  static / stack - ���α׷��� ����(�����ϸ�) ���ư�
 * 			  heap - �ڵ����� ���ư� X (GC ������ �ڵ����� ���ư�)
 * 
 * HDD(SDD) : ������ġ(����) (���� -> DB)
 * GPU		: �׷���ó���� (CPU + RAM + HDD)
 * 
 * ���α׷������� �����͸� �ܺο��� �а�, �ٽ� �ܺη� ����ϴ� �۾��� ���� �Ͼ�µ�
 * �����ʹ� ����ڷκ��� Ű���带 ���ؼ� �Էµ� ���� �ְ�, (Scanner)
 * ����.��Ʈ��ũ������ �Ͼ �� �ִ� (???)   (Input) ���� �̰� Input�̶�� �Ѵ�.
 * 
 * �ݴ�� �����ʹ� ����͸� ���ؼ� ��µ� ���� �ְ�, (System.out.println)
 * ����.��Ʈ��ũ�ε� ��µ� �� ���� (???) (Output) ���� �̰� Output�̶� �Ѵ�.
 * 
 * System.in -> InputStream
 * System.out -> PrintStream
 * 
 * 'Stream' : ����!
 *		�⺻��
 *			InputStream : ��ġ(Ű����, ����, ��Ʈ��ũ, ...) -> ���α׷����� �Է� (1byte��)
 *			InputStreamReader : ��ġ -> ���α׷� (2byte��) (���� ũ�� Up!)
 *			BufferedReader : (1String - line) (���� ũ�� Up!)
 *
 *			OutputStream : ���α׷��� ����� -> ��ġ(Ű����, ����, ��Ʈ��ũ, ...)�� ��� (1byte��)-> ���� ����
 *			OutputStreamWriter : 2byte��
 *			BufferedWriter : 1String - line
 *
 *		������ (Ư�������� �°�)
 *			PrintStream (OutputStream ����) - ���� ���ϰ� ������ �޼ҵ带 �߰�
 *			FileReader (InputStreamReader ����) - ���Ͽ��� �����͸� �о���� ���ϰ�	
 *			FileWriter (OutputStreamWriter ����) - 	
 *			...	
 */

public class FileWriteMain {
	public static void main(String[] args) {
		/* System.in : �ܼ�â -> ���α׷� InputStream
		 * JDK 1.5�� Scanner�� �߰�
		 * InputStream�� ����ϰ� ���ϰ� ����Ʈ
		 */
		Scanner key = new Scanner(System.in);
		System.out.print("�� : ");
		String cmt = key.next();
		
		// System.out : ���α׷� -> �ܼ�â PrintStream
		System.out.println("---------------------------");
		
		// FileWriter
		// ���α׷� -> �Ⱦ�(OutputStreamWriter ������)
		// ������ ������ ����� �ֱ⵵ ��
		// ������ �ȸ������
		// Linux�� ��� : C:/Uwsers/Dasktop/test/ja1.txt -> /��� ����) 		-> /�� ��� ����
		// Windox�� ��� : C:\\Uwsers\\Dasktop\\test\\ja1.txt -> /��� ����) -> \\�� ��� ����
																		// + /�ϳ��ε� ����
		// Java�� \�� : \t, \n, \r, \0, ...�� ��� (�̽����̤� ����)
		// ����, ������ ��Ÿ, ... -> ����ó��!
		
		// fw ���� bw ������ ����
		// ������ �͵� �ֿ��� �ϳ��� ������ �� ó��
		BufferedWriter bw = null;
		try {
			// ������ ������ �̹� �����ϸ� ������ ����Ƿ�
			// ������ �ִ� ������ ������ ������� ��
			// ������ ���� �ڿ� �����̰� ������ (�����͸� �߰��ϰ� �ʹٸ�)
			// �� ��° �Ķ���� ������ true�� �ָ� ��
			FileWriter fw = new FileWriter("C:\\Users\\wtime\\Desktop\\test\\ja1.txt", true);
			
			// �� ����Ʈ�� ������ϱ� ���ٴ�
			// '����'�� �̿��ؼ� �ѹ��� ���� ����Ʈ�� ������ϴ� ���� ����
			//		=> ��κ��� ����� �۾����� ���
			// ���� (RAM �ȿ� ����) : CPU�� HDD ���̿��� ���Ǵ� �ӽ� ���� ����
			// 		HDD(�� �ʴ� 3���� ������ ����) - > CPU(�� �ʴ� 100���� �����͸� ó���� �� ����)
			// 		CPU ���忡���� ����ؼ� ȿ������ ������
			//		�׷��� �̶� ����ϴ� ���� '����'�̴�. (�߰� �ٸ� ����)
			//		HDD -> Buffer -> CPU
			// ���۸� : <������>�� ���۷� �����ϴ� ����
			//		=> ���༺�� ��� ��ų �� ���� 
			bw = new BufferedWriter(fw);
			// ����, ��Ʈ��ũ ����ó�� : \r\n
			bw.write(cmt + "\r\n");
			bw.write("����ȭ����");
			bw.flush(); // �뷮�� �� ��ä������ ���������� �������� ( ��� ������ �� ������)		
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
