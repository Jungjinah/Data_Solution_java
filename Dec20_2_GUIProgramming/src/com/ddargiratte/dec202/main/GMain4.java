package com.ddargiratte.dec202.main;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.ddargiratte.dec202.frame.BmiFrame;

public class GMain4 {
	public static void main(String[] args) {
		// ������ BMI �˻��� JFrame
		JFrame jf = new JFrame("BMI �˻�");
		
		// 3�� 2��¥�� GridLayout
		GridLayout gl = new GridLayout(3, 2);
		
		// JFrame�� ���̾ƿ� �Ӽ��� gl�� ���
		jf.setLayout(gl);
		
		
		JLabel height = new JLabel("Ű : ");
		jf.add(height);
		
		JTextField printHeight = new JTextField();
		jf.add(printHeight);
		
		JLabel weight = new JLabel("������ : ");
		jf.add(weight);
		
		JTextField printweight = new JTextField();
		jf.add(printweight);
		
		JLabel result = new JLabel("��� : ");
		jf.add(result);
		
		JButton button = new JButton("BMI �˻�");
		jf.add(button);
		
		
		
		
		
		BmiFrame bFrame = new BmiFrame(printHeight, printweight, result);
		button.addActionListener(bFrame);
		
		
		// ������ ����
		jf.setSize(450, 300);
		
		// ���̰�
		jf.setVisible(true);
		
		
		
		
	}
}
