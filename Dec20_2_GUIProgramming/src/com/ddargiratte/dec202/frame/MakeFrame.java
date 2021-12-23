package com.ddargiratte.dec202.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame : Swing���� �����츦 ��Ÿ���� Class
//		JPanel, JButton, Jlabel, JTextField,...
// layout : flowLayout - ��� ����
//			BorderLayout - Frame ����
//			GridLayout - ���� ����
//			setLocation, setBounds - ��ġ ���� ����

public class MakeFrame extends JFrame{
	JPanel pl;
	
	public MakeFrame() {
		setSize(500,500);	// Frame size
		setTitle("GUI����");	// Frame title
		pl = new JPanel();	// �г� �ϳ� ����
		pl.setLayout(new FlowLayout());	// ��� �����ϰڴ�
		for (int i = 1; i < 11; i++) {	// �ݺ�Ƚ�� 10��
			pl.add(new JButton("��ư" + i)); // 
		}
		add(pl); // JPanel�� JFrame
		setVisible(true);
	}
	
}