
// OOP
// static - 고오오오오오오급
// 생성자
// 객체간의 관계
//	A has a B : 사람이 has a 핸드폰
//	A is a B : 개 is a 동물

public class HMain1 {

	public static void main(String[] args) {
		// 이름이 청포도고, 맛이 청포도인 사탕
		// 정보출력
		
		Candy c = new Candy();
		c.name = "청포도";
		c.taste = "청포도맛";
		c.printCandy();
		// 이름이 롯데, 위치가 잠실, 직원수가 100명인 회사
		// 정보출력
		
		System.out.println("--------------");
		Company cp = new Company();
		cp.companyName = "롯데";
		cp.location = "잠실";
		cp.employee = 100;
		cp.printCompany();
		
		System.out.println("--------------");
		
		// Candy has a company : 이 사탕에 대한 제조사를 알 수 있음 (o)
		// Company has a Candy : 회사가 만드는 제품을 표현
		// -> 둘중에 제조사가 더 맞음..
		
		// 청포도를 롯데에서 만들었다.
		c.brand = cp;
		
		// 청포도 맛의 청포도 사탕의 제조사의 정보를 출력
		c.brand.printCompany();
		
		System.out.println("--------------");
		
		// 삼성, 수원, 300명이 다니는 회사의 정보를 출력
		
		Company cp1 = new Company("삼성","수원",300);
		//cp1.printCompany();
	
		
		// CPU가 i7-1234, RAM 32GB, HDD 500GB인 삼성 컴퓨터
		// 컴퓨터 / 회사 정보 출력
		
		Samsung ss = new Samsung("i7-1234", 32, 500, cp1);
//		ss.cpu = "i7-1234";
//		ss.ram = 32;
//		ss.hdd = 500;
	
		ss.printInfo();
		
		
		
		
		
		
	}
	
}
