package com.ddargiratte.dec221.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class EncodingMain {
	
	/* Encoding : 정보의 형태나 형식을 변환하는 처리나 처리방식
	 * 컴퓨터 : 전자기계 (전기가 흐르거나 안흐르거나)
	 * ㅋ -> 전기의 흐름으로 표현 (모르스 부호) -> encoding
	 *
	 * Decoding : 인코딩된 데이터 통신 전송 및 파일을 원래 상태로 변환
	 * 전기의 흐름 -> 'ㅋ' -> decoding
	 *
	 * encoding 방식은 여러종류가 있음!
	 * 		크리스마스 -A-> 1010 -A-> 크리스마스
	 * 		크리스마스 -B-> 0101 -C-> 설날
	 * 		크리스마스 -C-> 0001 -???
	 * 
	 *  전세계적으로 주력 : UTF-8 (Unicode Transform Format)
	 *  한국만 타겟 : EUC-KR
	 *  MS전용 : MS949
	 *  9호선 - UTF-8-> 1011 -MS949 -> ??
	 */

// <1> 방식은 풀어놓은 방식 , <2> 방식은 함축해놓은 방식 
	public static void main(String[] args) {
// <1> 방식		
		FileOutputStream fos =  null;														// 여기는 경로를 통해서 텍스트 빈파일 만들기
		try {
		fos = new FileOutputStream("C:\\Users\\wtime\\Desktop\\test\\ja.txt", true);		// (내용) -> 괄호 안 내용은 빈파일 하나 만들어주고 그에 대한 경로
		} catch (Exception e) {																// + \\만들어질 텍스트 이름
			e.printStackTrace();
		}
		
		OutputStreamWriter osw = null;														// 여기는 파일 안에 글을 써놓기 위한 경로.?
		try {																				// 이게 있어야 글을 쓸 수 있다!
			osw = new OutputStreamWriter(fos, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw = new BufferedWriter(osw);										// 빈파일과 글을 쓸 수 있는 능력을 얻어 작업시작!
		
		try {															
			bw.write("지나화이팅~");							// append : 이어붙히기								
			bw.append("\r\n");								// write를 계속하면 2번째 쓰고나면 1번째가 없어짐 
			bw.append("진아최고~" + "\r");						// 그래서 append를 써서 이어 붙히는거야!
			bw.append("진아 짱~" + "\n");						// 싹다 write를 안 쓰는 이유가 이거임!
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 위에는 파일을 썼으니, 읽을 수 있게 아래 문장 실행
// <2> 방식		
		BufferedReader br = null;							// bw를 여기다 안쓰는 이유
		try {												// br이라는 공간을 만들어서 읽을 수 있는 환경 만들어 줌
			FileInputStream fis = new FileInputStream("C:\\Users\\wtime\\Desktop\\test\\ja.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);					// 그래서 그 환경에 경로 넣어서 글써놓은거 읽을 수 있게함!
			String line = null;		// 한줄 한줄 가져오려구 그릇 만들어놓음
			while ((line = br.readLine() ) != null) {		// 언제까지 반복문 돌릴거냐 -> line 자체가 null이 아닐때까지!
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			br.close();		// 닫아주는 기능을 꼭 넣어야한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
