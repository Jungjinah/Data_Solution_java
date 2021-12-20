package com.ddargiratte.dec202.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


	public class TempFrame implements ActionListener {
		private JPanel panel;
		private JLabel label1;
		private JLabel label2;
		private JTextField field1;
		private JTextField field2;
		private JButton button;
		
		
		public TempFrame() {
			// TODO Auto-generated constructor stub
		}
		
		
		public TempFrame(JPanel panel, JLabel label1, JLabel label2, JTextField field1, JTextField field2,
				JButton button, double fahrenheit) {
			super();
			this.panel = panel;
			this.label1 = label1;
			this.label2 = label2;
			this.field1 = field1;
			this.field2 = field2;
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			double fahrenheit = Double.parseDouble(field1.getText());
			double celcius = (double)5 / 9 * (fahrenheit - 32);
			
			String c = new DecimalFormat("##.####").format(celcius);
			field2.setText(c);
			
			
		}

		





}	