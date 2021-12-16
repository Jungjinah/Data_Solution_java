// A is a B : 상속관계
// 쇼핑몰
public class IMain2 {
	
	public static void main(String[] args) {
		
		// 신발 (이름, 가격, 사이즈)
		// 컴퓨터 (이름, 가격, CPU, RAM, HDD)
		// 출력
		
		Shoes s = new Shoes();
		s.name = "나이키";
		s.price = 129000;
		s.size = 230;
		
		s.printInfo();
		System.out.println("------------");
		Computer c = new Computer("삼성", 2000000, "i7-1234", 32, 500);
//		c.name = "삼성";
//		c.price = 2000000;
//		c.cpu = "i7-1234";
//		c.ram = 32;
//		c.hdd = 500;
		c.printInfo();
		
		// 노트북(이름, 가격, cpu, ram, hdd, 무게, 배터리 지속시간)
		
		System.out.println("---------------");
		Notebook n = new Notebook();
		n.name = "펜s";
		n.price = 2000000;
		n.cpu = "i5-1234";
		n.ram = 32;
		n.hdd = 500;
		n.weight = 1.5;
		n.battery = 8.5;
		
		n.printInfo();
		
		
		
	}
	
	
}
