package com.ddargiratte.dec202.frame;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 숫자를 여러개 뽑을때 >> 반복문
// array []

// 배경색도 바꿔보고..
// 글자색도 바꿔보고..
// Color.xxx -> 종류는 제한적

// 숫자를 1부터 30까지 랜덤한 위치에 나오게



public class NumberFrame extends JFrame{
	JPanel p = new JPanel();
	JLabel[] l = new JLabel[30];
	
	public NumberFrame() {
		p.setLayout(null);
		p.setBackground(Color.pink);
		Random r = new Random();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 30; i++) {
			l[i] = new JLabel("" + i);
			x = r.nextInt(500) + 1;
			y = r.nextInt(500) + 1;
			l[i].setForeground(Color.DARK_GRAY);
			l[i].setLocation(x, y);
			l[i].setSize(50,50);
		
			p.add(l[i]);
		}
		add(p);
		setTitle("뒤죽박죽 숫자");
		setSize(500,500);
		setVisible(true);
		
		
	}
}
