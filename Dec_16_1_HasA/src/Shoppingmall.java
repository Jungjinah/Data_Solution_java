// 아무대도 상속을 안받으면 extends Object
// Shoppingmall is a Object(자바 객체)


public class Shoppingmall /* extends Object */ {
	
	String name;
	int price;
	
	
	
	public Shoppingmall() {
		// TODO Auto-generated constructor stub
	}

	public Shoppingmall(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
	
}
