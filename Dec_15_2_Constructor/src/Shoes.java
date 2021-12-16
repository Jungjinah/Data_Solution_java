// 생성자(Constructor)
//	 객체가 만들어질때 뭔가 작업을 더 해야하는데...
//		-> 생성자 만들기!
//		리턴이 아예 없고, 메소드명이 클래스명과 같은 메소드
//		생성자를 만들지 않으면 
//		 -> 자바 컴파일러가 기본 생성자를 만들어버림
//		생성자를 건드리면,,
//		 -> 자바 컴파일러가 기본 생성자를 만들어주지 않음
//		 -> 시스템이 자동으로 객체를 만들때가 있는데...
//			-> 기본 생성자를 씀 -> 에러 발생! (그래서 생성자를 만들때는 조심해야함.)

// 객체를 만들 때 속성값까지 다 세팅
//

public class Shoes {
	
	String name;
	int size;
	int price;
	static String brand = "나이키"; // = static final String BRAND = "나이키";
	// 기본 생성자 (Ctrl + Space)
	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	
	// 생성자 오버로딩 (Ctrl + Shift + Space)
	public Shoes(String name, int size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		
	}
	
	public void shoesNike(String name) {
		this.size = 230;
		this.price = 179100;
		
		this.name = name;
	}
	
	public void shoesNike2(String name) {
		this.size = 230;
		this.price = 129000;
		
		this.name = name;
	}
	
	public void printInfo() {
		System.out.printf("모델명 : %s\n", name);
		System.out.printf("사이즈 : %dmm\n", size);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("브랜드 : %s\n", brand);
	}
	
	public static void printBrandInfo() {
		System.out.println(brand);
		System.out.println("지나화이팅");
		System.out.println("강남");
	}
	
	public void test() { // 파라미터 값에 String name 넣었다면, 멤버변수명과 파라미터명이 같은 상황..
		// this.을 붙이게 되면 무조건 멤버변수
		// this를 안쓰면 가장 가까이 있는 것을 가져오게됨
		System.out.println(name);
		System.out.println(this.name);
	}
	
}
	
