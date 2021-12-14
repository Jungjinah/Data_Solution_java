import java.util.Scanner;

public class FMain5 {
	
	// 게임을 하고 있는데... 엄마가 심부름을 시켜요
	public static void doit () {
		System.out.println("참치랑 참기름 사다 남은 잔돈 가져와잇!");
		System.out.println("늦지말고");
		System.out.println("얼른 다녀와~");
		System.out.println("한눈 팔지말고");
		System.out.println("바로 와야한다잉~");
		System.out.println("---------------------------");
		
	}
	
	// 엄마가 돈을 주셨다! (돈 = 입력)
	
	public static int takeMoney () {
		Scanner key = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = key.nextInt();
		
		System.out.printf("엄마가 %d원 주심~\n", money);
		return money;
		// ->
		// 정수(int)에 대한 값을 main함수에 return, 반환활거니까
		// return 타입을 int로 선택!
	
	}
	
	
	// 심부름 중에.. (라면 : 3200, 참치 : 2170, 과자 : 1500)
	// 돈이 얼마나 남는지.. 생각을...
	
	public static void gusrumdon (int money) {
		
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		// 계산하는 함수
		//		계산이라는 작업을 하려며 '받아온 돈'이 필요
		//		그 돈을 파라미터로 가져올것!
		System.out.printf("거스름돈은 %d원 만큼 남아따~\n", money - (ramen + tuna + snack));
		System.out.println("--------------------");
		
		
	}

	// 계산하고, 잔돈을 엄마한테 주자..
	public static int takeMom (int money) { // 엄마한테 줄거 계산하기
		
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500; // 계산대에 계산할거 올리기
		
		int restMoney = money - (ramen + tuna + snack); // 엄마한테 돈 돌려줄거 정산
		
		//System.out.printf("거스름돈 %d원 나왔는데 엄마 줄겡,,\n", restMoney);
		return tuna;
	}
	
	
	public static void main(String[] args) {
		
		doit();
		//takeMoney();
		System.out.println("--------------");
		int money = takeMoney();
		// System.out.println(money);
		System.out.println("--------------");
		gusrumdon(money);
		int RestMoney = takeMom(money);
		System.out.println(RestMoney);
	}	
	// 함수를 표현하는 4가지 방식!
	// main에 소스를 최대한 짧게 구성하기 위해서
	// 기능들을 묶어서 함수라는걸 사용!
	// 기능을 나눠서 효율적으로 사용!
	
	// void -> 여기선 return할게 없다!
	// 여긴 함수파트야!
}
