package com.ddargiratte.dec221.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadMain {
	public static void main(String[] args) {
		// Windows는 경로에 대소문자 구별안함
		// Linux는 대소문자를 구별함
		
		// fr 위에 br을 덧씌운 상태
		// 연관된 것들 중에서 하나만 닫으면 다 처리
		BufferedReader br = null;
		try {
			// 파일 -> 프로그램 (InputStreamReader 개조 - 2byte씩만 들어갈 수 있음)
			FileReader fr = new FileReader("C:\\Users\\wtime\\Desktop\\test\\ja1.txt");
			br = new BufferedReader(fr);	// 한번에 쫙 불러오기 위해 BufferReader씀
			
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
