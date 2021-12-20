// Java GUI프로그램 (Graphic User Interface)
// AWT, Swing, JavaFX

// AWT : 자바 초창기에 나온 GUI 라이브러리
//		운영체제(OS)에 따라서 모양이 다 달랐기 때문에, 종류도 상당히 제한적이었다.
// Swing : AWT 다음으로 나온 라이브러리
//			윈도우 프로그램 - 자바로 x : 느리기 때문에 , 더 최적화된 c언어라인이 있으므로!
//			윈도우 프로그램 잘 안만드는... -> 웹/앱쪽으로 넘어가는 추세!
//			- 결론적으로는 별로!, 디자인도 별로!
//			- android App 구조 이해에는 도움이 됨
// JavaFX : Swing의 느린 처리속도를 개선해서 출시됨
//			다양한 기능들도 추가 + 따로 외관꾸미는 것도 가능해짐
//			여전히 앱/웹 쪽에서 구현하면 되기 때문에.. 그닥..!



package com.ddargiratte.dec201.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.ddargiratte.dec201.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("지구");	// jframe과 jbutton 자동완성
		JButton jb = new JButton("딸기라떼");
		jf.add(jb);						// 딸기라떼를 지구에 착륙
		
		// 헐크 - actionPerformed()가 반드시 필요
		// 		(미완성된 메소드이므로)
		
		// 헐크 생성
		Hulk h = new Hulk();
		
		// 김비버가 전담영웅으로 헐크를 골랐음
		// (addActionListner)
		jb.addActionListener(h);
		
		// 도움을 요청
		// 크기, 눈에 보이게
		jf.setSize(500, 500);
		jf.setVisible(true);
		
	}

}
