package com.ddargiratte.dec202.frame;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class BmiFrame implements ActionListener{

	// �����!!

	private JTextField printHeight;
	private JTextField printweight;
	private JLabel result;

	
	public BmiFrame() {
		// TODO Auto-generated constructor stub
	}


	public BmiFrame(JTextField printHeight, JTextField printweight, JLabel result) {
		super();
		this.printHeight = printHeight;
		this.printweight = printweight;
		this.result = result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// ���
	 	// String -> double
		
		System.out.println("���");
		double h = Double.parseDouble(printHeight.getText());
		double w = Double.parseDouble(printweight.getText());
		h /= 100;
		double bmi = w / (h*h);
		String result2 = "��ü��";
		if (bmi >= 40) {
			result2 = "����";
		}else if (bmi >= 35) {
			result2 = "�ߵ ��";
		}else if (bmi >= 30) {
			result2 = "�浵��";
		}else if (bmi >= 25) {
			result2 = "��ü��";
		}else if (bmi >= 18.5) {
			result2 = "����";
		}
		
	// System.out.printf(); = String.format();
	// String�� ���� ��Ƽ� �����
	
		
	String finalResult = String.format("BMI : %.2f, ����� %s�Դϴ�.\n", bmi, result2);
	result.setText(finalResult);		// set�� ������ �ְų� ������ �� ���̴� �ִ�!
										// �׷��� ÷���� '��� : ' �̷��� �����µ�
										// �˻縦 �����鼭 'BMI : ~~' �̷��� ���´�!
	
	}
	
	
	
	
	
}
