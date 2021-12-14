
public class VMain2 {
	public static void main(String[] args) {
		
		// 섬유탈취제
		// 가격이 1000원
		// 용량이 80ml
		// 향균이 99.9%
		// 색깔은 무
		// 회사가 다이소
		// 재활용 해야함 (%b)
		
		
		// 내 답안
		String N = "제품 : ";
		String name = "섬유탈취제";
		String P = "가격 : ";
		int price = 1000;
		String price_p = "원";
		String M = "용량 : ";
		int ml = 80;
		String ml_ml = "ml";
		String C = "향균 : ";
		double clean = 99.9;
		String cleann = "%";
		String CL = "색깔 : ";
		String color = "무";
		String CP = "회사 : ";
		String company = "다이소";
		String R = "재활용 유무 : ";
		boolean recycle = true;
		
		System.out.println(N + name);
		System.out.println(P + price + price_p);
		System.out.println(M + ml + ml_ml);
		System.out.println(C + clean + cleann);
		System.out.println(CL + color);
		System.out.println(CP +company);
		System.out.println(R + recycle);
		
		 //슨생님 답안
		 //String name = "섬유탈취제";
		 //int price = 1000;
		 //int volume = 80;
		 //double antibacterial = 99.9;
		 //char color = '무';
		 //String company = "다이소";
		 //boolean recycle = true;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %d\n", price);
		System.out.printf("용량 : %dml\n", ml);
		System.out.printf("향균 : %.1f%%\n", clean);
		System.out.printf("색깔 : %s\n", color);
		System.out.printf("회사 : %s\n", company);
		System.out.printf("재활용 유무 :  %b\n", recycle);
		
		
		
		// 이름, 오늘 날짜(연도, 월, 일), 사는 곳, 시력, java경험의 유무
		
		String myname = "진아";
		int year = 2021;
		int month = 11;
		int day = 30;
		String home = "봉천동";
		double eye = 0.9;
		boolean java = false;
		
		System.out.printf("이름 = %s\n", myname);
		System.out.printf("연도 = %d년\n", year);
		System.out.printf("월 = %d월\n", month);
		System.out.printf("일 = %02d일\n", day);
		System.out.printf("날짜 = %d년 %d월 %02d일\n", year,  month,  day);
		System.out.printf("주거지 = %s\n", home);
		System.out.printf("시력 = %.1f\n", eye);
		System.out.printf("java경험의 유무 = %b\n", java);
		
		
	}
	
	
	
}
