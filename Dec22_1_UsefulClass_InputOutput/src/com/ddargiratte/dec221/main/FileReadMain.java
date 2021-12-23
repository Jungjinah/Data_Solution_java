package com.ddargiratte.dec221.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadMain {
	public static void main(String[] args) {
		// Windows�� ��ο� ��ҹ��� ��������
		// Linux�� ��ҹ��ڸ� ������
		
		// fr ���� br�� ������ ����
		// ������ �͵� �߿��� �ϳ��� ������ �� ó��
		BufferedReader br = null;
		try {
			// ���� -> ���α׷� (InputStreamReader ���� - 2byte���� �� �� ����)
			FileReader fr = new FileReader("C:\\Users\\wtime\\Desktop\\test\\ja1.txt");
			br = new BufferedReader(fr);	// �ѹ��� �� �ҷ����� ���� BufferReader��
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
