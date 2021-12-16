
public class Coffee {

	String name;
	int price;
	
	public Coffee() {		// ctrl + space로 습관화
		// 객체의 값을 초기화하는데 목적!
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Coffee(String name, int price) {		// ctrl + shift + space
		super();		// <- method (상위를 뜻하는 것으로, 위에 있는 기본 생성자 뜻하는거임,,)		
		this.name = name;
		this.price = price;
	}

	public void printCoffee() {
		System.out.println(name);
		System.out.println(price);
	}
	

//	public void printCoffee() {
//		System.out.printf("커피이름 : %s\n", name);
//		System.out.printf("커피가격 : %d원\n", price);
//	}
	
	
	
}
