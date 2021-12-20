package com.ddargiratte.dec202.frame;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class BmiFrame implements ActionListener{

	// 기능을!!

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
		
		// 계산
	 	// String -> double
		
		System.out.println("계산");
		double h = Double.parseDouble(printHeight.getText());
		double w = Double.parseDouble(printweight.getText());
		h /= 100;
		double bmi = w / (h*h);
		String result2 = "저체중";
		if (bmi >= 40) {
			result2 = "고도비만";
		}else if (bmi >= 35) {
			result2 = "중등도 비만";
		}else if (bmi >= 30) {
			result2 = "경도비만";
		}else if (bmi >= 25) {
			result2 = "과체중";
		}else if (bmi >= 18.5) {
			result2 = "정상";
		}
		
	// System.out.printf(); = String.format();
	// String을 형식 잡아서 만들기
	
		
	String finalResult = String.format("BMI : %.2f, 당신은 %s입니다.\n", bmi, result2);
	result.setText(finalResult);		// set은 뭔가를 넣거나 수정할 때 쓰이는 애당!
										// 그래서 첨에는 '결과 : ' 이렇게 나오는데
										// 검사를 누르면서 'BMI : ~~' 이렇게 나온다!
	
	}
	
	
	
	
	
}
