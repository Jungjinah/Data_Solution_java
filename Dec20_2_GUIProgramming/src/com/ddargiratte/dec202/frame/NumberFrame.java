package com.ddargiratte.dec202.frame;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ���ڸ� ������ ������ >> �ݺ���
// array []

// ������ �ٲ㺸��..
// ���ڻ��� �ٲ㺸��..
// Color.xxx -> ������ ������

// ���ڸ� 1���� 30���� ������ ��ġ�� ������



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
		setTitle("���׹��� ����");
		setSize(500,500);
		setVisible(true);
		
		
	}
}
