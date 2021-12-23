package com.ddargiratte.dec221.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class EncodingMain {
	
	/* Encoding : ������ ���³� ������ ��ȯ�ϴ� ó���� ó�����
	 * ��ǻ�� : ���ڱ�� (���Ⱑ �帣�ų� ���帣�ų�)
	 * �� -> ������ �帧���� ǥ�� (�𸣽� ��ȣ) -> encoding
	 *
	 * Decoding : ���ڵ��� ������ ��� ���� �� ������ ���� ���·� ��ȯ
	 * ������ �帧 -> '��' -> decoding
	 *
	 * encoding ����� ���������� ����!
	 * 		ũ�������� -A-> 1010 -A-> ũ��������
	 * 		ũ�������� -B-> 0101 -C-> ����
	 * 		ũ�������� -C-> 0001 -???
	 * 
	 *  ������������ �ַ� : UTF-8 (Unicode Transform Format)
	 *  �ѱ��� Ÿ�� : EUC-KR
	 *  MS���� : MS949
	 *  9ȣ�� - UTF-8-> 1011 -MS949 -> ??
	 */

// <1> ����� Ǯ����� ��� , <2> ����� �����س��� ��� 
	public static void main(String[] args) {
// <1> ���		
		FileOutputStream fos =  null;														// ����� ��θ� ���ؼ� �ؽ�Ʈ ������ �����
		try {
		fos = new FileOutputStream("C:\\Users\\wtime\\Desktop\\test\\ja.txt", true);		// (����) -> ��ȣ �� ������ ������ �ϳ� ������ְ� �׿� ���� ���
		} catch (Exception e) {																// + \\������� �ؽ�Ʈ �̸�
			e.printStackTrace();
		}
		
		OutputStreamWriter osw = null;														// ����� ���� �ȿ� ���� ����� ���� ���.?
		try {																				// �̰� �־�� ���� �� �� �ִ�!
			osw = new OutputStreamWriter(fos, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw = new BufferedWriter(osw);										// �����ϰ� ���� �� �� �ִ� �ɷ��� ��� �۾�����!
		
		try {															
			bw.write("����ȭ����~");							// append : �̾������								
			bw.append("\r\n");								// write�� ����ϸ� 2��° ������ 1��°�� ������ 
			bw.append("�����ְ�~" + "\r");						// �׷��� append�� �Ἥ �̾� �����°ž�!
			bw.append("���� ¯~" + "\n");						// �ϴ� write�� �� ���� ������ �̰���!
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ������ ������ ������, ���� �� �ְ� �Ʒ� ���� ����
// <2> ���		
		BufferedReader br = null;							// bw�� ����� �Ⱦ��� ����
		try {												// br�̶�� ������ ���� ���� �� �ִ� ȯ�� ����� ��
			FileInputStream fis = new FileInputStream("C:\\Users\\wtime\\Desktop\\test\\ja.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);					// �׷��� �� ȯ�濡 ��� �־ �۽������ ���� �� �ְ���!
			String line = null;		// ���� ���� ���������� �׸� ��������
			while ((line = br.readLine() ) != null) {		// �������� �ݺ��� �����ų� -> line ��ü�� null�� �ƴҶ�����!
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			br.close();		// �ݾ��ִ� ����� �� �־���Ѵ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
