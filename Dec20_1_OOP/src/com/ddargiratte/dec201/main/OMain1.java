package com.ddargiratte.dec201.main;

import com.ddargiratte.dec201.avengers.Ironman;
import com.ddargiratte.dec201.person.Person;
import com.ddargiratte.dec201.planet.Planet;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class OMain1 {
	public static void main(String[] args) {

		// 이름이 지구인 행성 생성 (행성이름, 크기)
		Planet pl = new Planet("지구");
		
		// 이름이 딸기라떼인 사람 (사람 이름)
		Person p = new Person("딸기라떼");	//1
		
		// 이 별에 이 사람을 입주
		pl.add(p);
		
		// 사수 : interface
		// interface는 부사수 제어용
		// attack()를 반드시 구현하게..
		// 아이언맨 - attack()이 반드시 필요!
		
		// 이 사람이 아이언맨을 자기 전담 영웅으로 픽!
		Ironman i = new Ironman();
		p.pick(i);
		
		// 이 사람이 도와달라고 소리침!
		p.helpAaaa();
		
		// 이 행성 사이즈를 1000으로 수정
		pl.setSize(1000);
		
		// 이 행성을 보이게 수정
		pl.setVisible(true);
		
	}
	
}

/*<정리>
 * OMain1과 OMain2는 다른방식의 표현이다.
 * OMain1에서는 person, planet, ironman
 * OMain2에서는 person, planet, hulk
 * Ironman에서 implements를 써서 Avengers를 쓴 이유
 *  -> 선생님이 보내주신 파일로 attak를 구현하기 위해서이다.
 * Hulk에서 ActionListener를 쓴 이유
 *  -> 이벤트를 쓸 수 있게 하기 위해서이다.
 *  -> actionPerformed와 JFrame 같은 J시리즈 등 actionPerformed 쓸 수 있다.
 * OMain1의 13 = OMina2의 26 
 * OMain1의 16 = OMina2의 27 
 * OMain1의 19 = OMina2의 28 
 * OMain1의 27 = OMina2의 34 
 * OMain1의 28,31 = OMina2의  
 * OMain1의 34,37 = OMina2의 42,43 
 *  
 *  
 */



