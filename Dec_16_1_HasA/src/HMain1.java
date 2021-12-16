
// 객체간의 관계
// A has a B : 사람 has a 핸드폰
// A is a B :개 is a 동물

public class HMain1 {
	public static void main(String[] args) {
		// 이름이 Kim Andrew, 남자, 핸드폰 번호가 010-1234-5678인 사람
		
		Man m = new Man();
		m.name = "Kim Andrew";
		m.gender = "남자";
		m.phoneNum = "010-1234-5678";
		m.printInfo();
		
		System.out.println("----------");
		// 선릉포차, 대치동, 02-1222-3444, Kim Andrew의 식당
		
		Store s = new Store();
		s.name = "선릉포차";
		s.location = "대치동";
		s.phoneNumber = "02-1222-3444";
		s.printStore();
		
		// Man.s.printStore();
		
		System.out.println("----------");
		// 계란말이, 22000원, 선릉포차에서 파는 메뉴
		// 이 메뉴에 대한 전체 정보를 출력
		Egg e = new Egg("계란말이", 22000, s);
		e.printEggInfo();
		
		System.out.println("----------");
		// 석쇠불고기, 25000원, 선릉포차에서 파는 메뉴
		// 이 메뉴에 대한 전체 정보를 출력
		Bulgogi b = new Bulgogi("석쇠불고기", 25000, s);
		b.printBulgogiInfo();
		
		System.out.println("----------");
		// 이름이 석쇠, 가격이 5000원, 석쇠불고기를 담은 접시
		// 전체 정보 출력
		Dish d = new Dish("석쇠", 5000, b);
		d.printDish();
		
		System.out.println("----------");
		// 가락시장, 송파구, 석쇠를 구매한 시장
		// 전체 정보 출력
		Market mk = new Market("가락시장", "송파구", d);
		mk.printMarket();
		
		System.out.println("----------");
		// 곽두팔, 가락시장을 좋아하는 상인
		// 전체 정보 출력
		Dealer dl = new Dealer("곽두팔", mk);
		dl.printDealer();
		
		System.out.println("----------");
		// 곽두팔의 전체 정보 출력
		dl.printDealer();
		
		System.out.println("----------");
		// 곽두팔의 이름만 출력
		System.out.println(dl.name);
		
		System.out.println("----------");
		// 곽두팔이 좋아하는 시장 정보 전체 출력
		dl.dealer.printMarketInfo();
		
		System.out.println("----------");
		// 곽두팔이 좋아하는 시장 어디에? 출력
		System.out.println(mk.location);
		
		System.out.println("----------");
		// 곽두팔이 좋아하는 시장에서 산 접시 전체정보
		dl.dealer.market.printDishInfo();
		
		System.out.println("----------");
		// 곽두팔이 좋아하는 시장에서 산 접시 가격
		System.out.println(dl.dealer.market.price);
		
		System.out.println("---------");
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴 정보
		dl.dealer.market.dish.printBulgogiInfo();
		
		System.out.println("---------");
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴 가격
		System.out.println(dl.dealer.market.dish.price);
		
		System.out.println("---------");
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 연락처
		System.out.println(dl.dealer.market.dish);
		
		System.out.println("---------");
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 주인 연락처
		System.out.println(dl.dealer.);
		
		System.out.println("---------");
		// 계란말이 파는 사람 연락처
		System.out.println(e.Where.who.phoneNum);
	}
}

