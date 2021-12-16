
// 계산기
//	정수 2개를 넣으면 그 합을 출력하는 기능

public class SMain2 {
	public static void main(String[] args) {

		Calculation c = new Calculation();
		
		c.printSum(10, 20);  // static o
		c.sum(60, 50, 40);	 // static x

		Calculation.printSum(30, 50); // static o -> 메모리를 덜 쓰고 해결, 위에보다 메모리를 덜 씀
//		Calculation.sum(10, 20, 39); // static x 그래서 에러뜸!
		
		// 같은 맥락으로 Java의 내장 클래스 중 하나인 Math
		// 이거 또한 객체를 만들지 않고 사용한 경우!
		System.out.println(Math.PI);
		double s = Math.sqrt(10);
		System.out.println(s);
		
		
		
	}
}
