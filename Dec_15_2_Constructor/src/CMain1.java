
public class CMain1 {
	public static void main(String[] args) {
		
		// 신발
		// 나이키 홈페이지
		// 이름 : 
		// 사이즈 : 
		// 가격 : 
		// 브랜드 : 나이키
		// -----------------
		// 이름 : 
		// 사이즈 : 
		// 가격 : 
		// 브랜드 : 나이키
		
		Shoes n = new Shoes();
		n.name = "에어맥스97";
		n.size = 230;
		n.price = 179100;
		n.printInfo();
		System.out.println("---------");
		Shoes n1 = new Shoes();
		n1.name = "에어포스";
		n1.size = 230;
		n1.price = 129000;
		n1.printInfo();
		System.out.println("---------");
		
		Shoes.printBrandInfo();
		
	}
}
