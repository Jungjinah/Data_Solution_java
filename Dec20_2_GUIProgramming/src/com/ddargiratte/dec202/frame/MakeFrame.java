package com.ddargiratte.dec202.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame : Swing에서 윈도우를 나타내는 Class
//		JPanel, JButton, Jlabel, JTextField,...
// layout : flowLayout - 가운데 정렬
//			BorderLayout - Frame 형식
//			GridLayout - 격차 형태
//			setLocation, setBounds - 위치 임의 지정

public class MakeFrame extends JFrame{
	JPanel pl;
	
	public MakeFrame() {
		setSize(500,500);	// Frame size
		setTitle("GUI연습");	// Frame title
		pl = new JPanel();	// 패널 하나 생성
		pl.setLayout(new FlowLayout());	// 가운데 정렬하겠다
		for (int i = 1; i < 11; i++) {	// 반복횟수 10번
			pl.add(new JButton("버튼" + i)); // 
		}
		add(pl); // JPanel을 JFrame
		setVisible(true);
	}
	
}
