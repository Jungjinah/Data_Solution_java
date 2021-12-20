package com.ddargiratte.dec201.main;

import com.ddargiratte.dec201.avengers.Ironman;
import com.ddargiratte.dec201.person.Person;
import com.ddargiratte.dec201.planet.Planet;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class OMain1 {
	public static void main(String[] args) {

		// �̸��� ������ �༺ ���� (�༺�̸�, ũ��)
		Planet pl = new Planet("����");
		
		// �̸��� ������� ��� (��� �̸�)
		Person p = new Person("�����");	//1
		
		// �� ���� �� ����� ����
		pl.add(p);
		
		// ��� : interface
		// interface�� �λ�� �����
		// attack()�� �ݵ�� �����ϰ�..
		// ���̾�� - attack()�� �ݵ�� �ʿ�!
		
		// �� ����� ���̾���� �ڱ� ���� �������� ��!
		Ironman i = new Ironman();
		p.pick(i);
		
		// �� ����� ���ʹ޶�� �Ҹ�ħ!
		p.helpAaaa();
		
		// �� �༺ ����� 1000���� ����
		pl.setSize(1000);
		
		// �� �༺�� ���̰� ����
		pl.setVisible(true);
		
	}
	
}

/*<����>
 * OMain1�� OMain2�� �ٸ������ ǥ���̴�.
 * OMain1������ person, planet, ironman
 * OMain2������ person, planet, hulk
 * Ironman���� implements�� �Ἥ Avengers�� �� ����
 *  -> �������� �����ֽ� ���Ϸ� attak�� �����ϱ� ���ؼ��̴�.
 * Hulk���� ActionListener�� �� ����
 *  -> �̺�Ʈ�� �� �� �ְ� �ϱ� ���ؼ��̴�.
 *  -> actionPerformed�� JFrame ���� J�ø��� �� actionPerformed �� �� �ִ�.
 * OMain1�� 13 = OMina2�� 26 
 * OMain1�� 16 = OMina2�� 27 
 * OMain1�� 19 = OMina2�� 28 
 * OMain1�� 27 = OMina2�� 34 
 * OMain1�� 28,31 = OMina2��  
 * OMain1�� 34,37 = OMina2�� 42,43 
 *  
 *  
 */



