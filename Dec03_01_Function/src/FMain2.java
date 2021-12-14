import java.util.Scanner;

// 비만도 검사 프로그램(함수 버전)

// 키, 몸무게는 입력받을 것
// 표준체중 = (키 - 100) * 0.9
// 비만도 = (실제 체중 / 표준체중) * 100
// 비만도가 120이 넘은면 '비만', 아니면 '안비만'

// 함수 : main함수에서 java를 모르는 사람이 봐도 뭘 한건지 알아볼 수 있게,,, / + 간결 

// 만약에,,, 표준체중을 구하는 공식 0.8로 바뀌었다..
// 다양한 기능을 함수 하나에 구현하고, 변경사항을 수정하게 됐을 때,, (유지보수)
// 그 때는 한 번에 잘 찾을 수 있을까요..?
// 그래서 기능을 잘 분류해서 함수로 표현을 해줘야..!
// 		-> 유지보수가 편해지기 때문에,,

// ctrl + shift + /(numpad)
// ctrl + shift + *(numpad)
// 메모리를 아낄 것인가 vs 가독성 좋게 할 것인가
public class FMain2 {
	

	// 비만도 검사 시작
	public static void startBimando( ) {
		System.out.println("비만도 검사 시작!");
	}
	
	
	// 키를 입력받는 함수
	public static double getHeight() {
		Scanner key = new Scanner(System.in);
		System.out.print("키 : ");
		double height = key.nextDouble();
		return height; 
		}
	 
	// 몸무게를 입력받는 함수
		public static double getWeight() {
		//  1) Scanner key = new Scanner(System.in);
			System.out.print("몸무게 : ");
		//  2) double weight = key.nextDouble();
		//  3) return weight;
			// return key.nextDouble(); // 2 + 3
			return new Scanner(System.in).nextDouble();
			// -> 1 + 2 + 3
		}
		
	// 키를 넣으면 표준체중을 구해주는 함수
		public static double calcStdWeight(double height) {
			double stdWeight = (height -100) * 0.9;
			return stdWeight;
			// return (height - 100) * 0.9; // 위에 두줄 합침
		}
		
	// 실제체중과 표준체중을 넣으면 비만도를 계산해서 값을 구해주는 함수
		public static double calcBimando(double weight, double stdWeight) {
			double bimando = (weight / stdWeight) * 100;
			return bimando;
		}
		
	// 비만인지 안비만인지 판정을 해주는 함수
		public static String judgeBimando(double bimando) {
			String result = (bimando > 120)? "비만" : "안비만";
			return result;
		}
		
	// 결과를 출력해주는 함수
		public static void printResult(double h, double w, double sw, double b, String r) {
			System.out.println("------------------");
			System.out.printf("키 : %.1fcm\n", h);
			System.out.printf("몸무게 : %.1fkg\n", w);
			System.out.printf("표준체중 : %.1fkg\n", sw);
			System.out.printf("비만도 : %.1f\n", b);
			System.out.printf("당신은 [%s] 입니다.\n", r);
			System.out.println("------------------");
			
		}
	
	public static void main(String[] args) {
		
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = calcStdWeight(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judgeBimando(bimando);
		printResult(height, weight, stdWeight, bimando, result);
	}

}
