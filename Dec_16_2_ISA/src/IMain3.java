
public class IMain3 {
	public static void main(String[] args) { 
		// 홍길동, 17살, 선릉고등학교, 1학년 -> 출력
		// 김길동, 21살, 강남대학교, 2학년 -> 출력
		// 고길동, 22살, 의경, 수경 -> 출력
		
		Hong h = new Hong("홍길동", 17, "선릉고등학교", 1);
		h.printInfo();
		
		System.out.println("----------------");
		Kim k = new Kim("김길동", 21, "강남대학교", 2);
		k.printInfo();
		
		System.out.println("----------------");
		Go g = new Go("고길동", 22, "의경", "수경");
		g.printInfo();
		
		System.out.println("----------------");
		Pen p = new Pen();
		System.out.println("----------------");
		Pen p2= new Pen("빨강");
		System.out.println("----------------");
		Pen p3 = new Pen("모나미", 300, "검정");
		System.out.println("----------------");
		
		// 이름이 패션마스크, 가격이 1000원인 마스크
		
		Mask m = new Mask("패션마스크", 1000);
		System.out.println(m.name);
		System.out.println(m.price);
	
		
		
	}
}
