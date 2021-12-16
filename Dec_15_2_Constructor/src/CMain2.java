
public class CMain2 {
	public static void main(String[] args) {
		// 삼선슬리퍼, 230, 3000 짜리 신발을 생성
		
//		Shoes s = new Shoes("삼선슬리퍼", 260, 3000);
//		s.printInfo();
		
		// 아래랑 같은 뜻,,
		
		Shoes three = new Shoes();
		three.name = "나이키 삼선슬리퍼";
		three.size = 260;
		three.price = 3000;
		three.printInfo();
		
		System.out.println("---------");
		
		// 커피 이름 / 가격
		// 아메리카노 / 3000
		
//		Coffee americano = new Coffee("아메리카노", 3000);
//		americano.printCoffee();
		
		// 아래랑 같은 뜻,,
		
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 3000;
		
		americano.printCoffee();
		
		
	}
}
