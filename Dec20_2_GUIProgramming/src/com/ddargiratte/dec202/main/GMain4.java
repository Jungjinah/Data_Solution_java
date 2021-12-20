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
		// 제목이 BMI 검사인 JFrame
		JFrame jf = new JFrame("BMI 검사");
		
		// 3행 2열짜리 GridLayout
		GridLayout gl = new GridLayout(3, 2);
		
		// JFrame의 레이아웃 속성을 gl로 사용
		jf.setLayout(gl);
		
		
		JLabel height = new JLabel("키 : ");
		jf.add(height);
		
		JTextField printHeight = new JTextField();
		jf.add(printHeight);
		
		JLabel weight = new JLabel("몸무게 : ");
		jf.add(weight);
		
		JTextField printweight = new JTextField();
		jf.add(printweight);
		
		JLabel result = new JLabel("결과 : ");
		jf.add(result);
		
		JButton button = new JButton("BMI 검사");
		jf.add(button);
		
		
		
		
		
		BmiFrame bFrame = new BmiFrame(printHeight, printweight, result);
		button.addActionListener(bFrame);
		
		
		// 사이즈 조절
		jf.setSize(450, 300);
		
		// 보이게
		jf.setVisible(true);
		
		
		
		
	}
}
