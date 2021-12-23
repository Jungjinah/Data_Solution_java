package com.ddargiratte.dec221.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/* CPU		: 연산장치
 * RAM		: 저장장치(임시) - 재부팅하면 날아감
 * 			  static / stack - 프로그램을 끄면(종료하면) 날아감
 * 			  heap - 자동으로 날아감 X (GC 있으면 자동으로 날아감)
 * 
 * HDD(SDD) : 저장장치(영구) (파일 -> DB)
 * GPU		: 그래픽처리용 (CPU + RAM + HDD)
 * 
 * 프로그램에서는 데이터를 외부에서 읽고, 다시 외부로 출력하는 작업이 자주 일어나는데
 * 데이터는 사용자로부터 키보드를 통해서 입력될 수도 있고, (Scanner)
 * 파일.네트워크에서도 일어날 수 있다 (???)   (Input) 이제 이걸 Input이라고 한다.
 * 
 * 반대로 데이터는 모니터를 통해서 출력될 수도 있고, (System.out.println)
 * 파일.네트워크로도 출력될 수 있음 (???) (Output) 이제 이걸 Output이라 한다.
 * 
 * System.in -> InputStream
 * System.out -> PrintStream
 * 
 * 'Stream' : 빨대!
 *		기본형
 *			InputStream : 장치(키보드, 파일, 네트워크, ...) -> 프로그램으로 입력 (1byte씩)
 *			InputStreamReader : 장치 -> 프로그램 (2byte씩) (빨대 크기 Up!)
 *			BufferedReader : (1String - line) (빨대 크기 Up!)
 *
 *			OutputStream : 프로그램의 결과를 -> 장치(키보드, 파일, 네트워크, ...)로 출력 (1byte씩)-> 얇은 빨대
 *			OutputStreamWriter : 2byte씩
 *			BufferedWriter : 1String - line
 *
 *		개조형 (특수목적에 맞게)
 *			PrintStream (OutputStream 개조) - 쓰기 편하게 유용항 메소드를 추가
 *			FileReader (InputStreamReader 개조) - 파일에서 데이터를 읽어오기 편하게	
 *			FileWriter (OutputStreamWriter 개조) - 	
 *			...	
 */

public class FileWriteMain {
	public static void main(String[] args) {
		/* System.in : 콘솔창 -> 프로그램 InputStream
		 * JDK 1.5에 Scanner가 추가
		 * InputStream을 사용하게 편하게 서포트
		 */
		Scanner key = new Scanner(System.in);
		System.out.print("뭐 : ");
		String cmt = key.next();
		
		// System.out : 프로그램 -> 콘솔창 PrintStream
		System.out.println("---------------------------");
		
		// FileWriter
		// 프로그램 -> 픽업(OutputStreamWriter 개조형)
		// 파일이 없으면 만들어 주기도 함
		// 폴더는 안만들어줌
		// Linux의 경로 : C:/Uwsers/Dasktop/test/ja1.txt -> /경로 설정) 		-> /로 경로 설정
		// Windox의 경로 : C:\\Uwsers\\Dasktop\\test\\ja1.txt -> /경로 설정) -> \\로 경로 설정
																		// + /하나로도 가능
		// Java의 \는 : \t, \n, \r, \0, ...에 사용 (이스케이ㅡ 문자)
		// 권한, 폴더명 오타, ... -> 예외처리!
		
		// fw 위에 bw 덧씌운 상태
		// 연관된 것들 주에서 하나만 닫으면 다 처리
		BufferedWriter bw = null;
		try {
			// 지정된 파일이 이미 존재하면 내용을 덮어쓰므로
			// 기존에 있던 파일의 내용은 사라지게 됨
			// 기존의 내용 뒤에 덧붙이고 싶으면 (데이터를 추가하고 싶다면)
			// 두 번째 파라미터 값으로 true를 주면 됨
			FileWriter fw = new FileWriter("C:\\Users\\wtime\\Desktop\\test\\ja1.txt", true);
			
			// 한 바이트씩 입출력하기 보다는
			// '버퍼'를 이용해서 한번에 여러 바이트를 입출력하는 것이 빠름
			//		=> 대부분의 입출력 작업에서 사용
			// 버퍼 (RAM 안에 있음) : CPU와 HDD 사이에서 사용되는 임시 저장 공간
			// 		HDD(는 초당 3개의 파일을 전송) - > CPU(는 초당 100개의 데이터를 처리할 수 있음)
			// 		CPU 입장에서는 답답해서 효율성이 떨어짐
			//		그래서 이때 사용하는 것이 '버퍼'이다. (중간 다리 역할)
			//		HDD -> Buffer -> CPU
			// 버퍼링 : <데이터>를 버퍼로 저장하는 동작
			//		=> 실행성능 향상 시킬 수 있음 
			bw = new BufferedWriter(fw);
			// 파일, 네트워크 엔터처리 : \r\n
			bw.write(cmt + "\r\n");
			bw.write("지나화이팅");
			bw.flush(); // 용량이 다 안채워져도 강제적으로 내보내기 ( 모든 데이터 다 보내기)		
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
