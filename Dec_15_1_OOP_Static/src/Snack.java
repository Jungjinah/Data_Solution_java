
// 멤버변수 : 객체의 속성 -> (객체.속성)으로 표현
//					this : 이 객체를 뜻함(생략가능 o)

// 이 세상의 모든 과자를 'DDargiratte'가 만든다고 한다면?
//		-> 이 때 사용하는게 *** 'static' 멤버변수
//			- 객체가 없어도 쓸 수 있는 정보
//	     	  -> 클래스명.xxx
//			- 객체들의 공통속성을 나타낼 때 사용
//			  -> 객체를 여러개 찍어내도 static 멤버변수는 하나만!
//			  -> 메모리 절약 o

// static을 사용하는 방법 중에 고정시켜버리기.가 있음 ->  상수화 시키는 방법
// -> static final 멤버변수
// 		-> 수정 불가능 -> 상수화,, (값을 변경하지 않겠다.)
//		static final 자료형 변수명(모두 대문자 -> 문화야,,) = 내용;

// static 메소드
//		메모리가 절약 됨 -> 아무튼 됨 (설명 노노,,,)
//		객체가 없어도 사용이 가능 o
//			static이 아닌 다른 멤버변수에는 접근이 불가능 o


public class Snack {

	String name;
	double weight;
	int price;
	static final String MANUFACTURE = "DDargiratte";
	
	
	// 이 과자의 정보를 출력하는 메소드
	public void printInfo() {
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("중량 : %.1fg\n", this.weight);
		System.out.printf("가격 : %d원\n", this.price);
		System.out.printf("생산자 : %s\n", MANUFACTURE);
		System.out.println("-----------------------");
	}
	
	
	public static void printTaste() {
		System.out.println(MANUFACTURE);
	  //System.out.println(name); // name만 쓰면 static이 아닌 다른 멤버변수여서 에러 발생..
		System.out.println("최고야~~ 짱 맛있여~~");
		System.out.println("-----------------");
		
	}
	
	
	public void snackInfo(String name) {
		this.name = "홈런볼";
		this.weight = 90;
		this.price = 1500;
		
	
	
	}
	
	
		
		
		
	
}
