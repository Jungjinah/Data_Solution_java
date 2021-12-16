// A is a B : 상속관계
// 개는 동물 '이다'

// Overloading : 메소드를 만들 때 같은 기능이라면 메도스명 같게
//				 (파라미터의 자료형이 다르거나, 파라미터의 개수가 달라야함)
// Overriding : 상속받는 Class에서의 method명과 같아야함.


public class Lion extends Animal { 	// Animal의 기능을 받아옴
	// Animal 안에 Lion이 '상속' 되어있다
	// 상속 : inheritance
	// 확장 : extends
	
	String inhabit;
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}

	public Lion(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}
	
	// @xxx : Annotation -> 어떤 기능을 자동으로 연결해준다.
	@Override	// 상속받아온 method의 기능을 바꾸는 것
	public void printInfo() {
		// override를 사용하려면..
		//	상속받는 Class에서의 method명과 같아야!
		// TODO Auto-generated method stub
		super.printInfo(); // 상위클래스.printInfo();
		System.out.println(inhabit);
	}
	
}
