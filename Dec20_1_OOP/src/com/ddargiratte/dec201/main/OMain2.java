// Java GUI���α׷� (Graphic User Interface)
// AWT, Swing, JavaFX

// AWT : �ڹ� ��â�⿡ ���� GUI ���̺귯��
//		�ü��(OS)�� ���� ����� �� �޶��� ������, ������ ����� �������̾���.
// Swing : AWT �������� ���� ���̺귯��
//			������ ���α׷� - �ڹٷ� x : ������ ������ , �� ����ȭ�� c�������� �����Ƿ�!
//			������ ���α׷� �� �ȸ����... -> ��/�������� �Ѿ�� �߼�!
//			- ��������δ� ����!, �����ε� ����!
//			- android App ���� ���ؿ��� ������ ��
// JavaFX : Swing�� ���� ó���ӵ��� �����ؼ� ��õ�
//			�پ��� ��ɵ鵵 �߰� + ���� �ܰ��ٹ̴� �͵� ��������
//			������ ��/�� �ʿ��� �����ϸ� �Ǳ� ������.. �״�..!



package com.ddargiratte.dec201.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.ddargiratte.dec201.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("����");	// jframe�� jbutton �ڵ��ϼ�
		JButton jb = new JButton("�����");
		jf.add(jb);						// ����󶼸� ������ ����
		
		// ��ũ - actionPerformed()�� �ݵ�� �ʿ�
		// 		(�̿ϼ��� �޼ҵ��̹Ƿ�)
		
		// ��ũ ����
		Hulk h = new Hulk();
		
		// ������ ���㿵������ ��ũ�� �����
		// (addActionListner)
		jb.addActionListener(h);
		
		// ������ ��û
		// ũ��, ���� ���̰�
		jf.setSize(500, 500);
		jf.setVisible(true);
		
	}

}
