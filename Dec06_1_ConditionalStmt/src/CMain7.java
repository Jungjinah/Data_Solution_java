import java.util.Scanner;

// BMI검사
// 이름, 키(cm), 몸무게(kg)
// BMI(체질량지수) : 몸무게 / (키*키) -> 키 : m단위
// 18.5미만이면 저체중
// 18.5이상이면 정상
// 25이상이면 과체중
// 30이상이면 경도비만
// 35이상이면 중증도비만
// 40이상이면 고도비만

// 결과값까지 출력

public class CMain7 {  
	// 이름 출력
	public static String getName ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = key.next();
		return name;
	}
	// 키 출력
	public static double getHeight ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("키 : ");
		double height = key.nextDouble();
		return height;
	}
	// 몸무게 출력
	public static double getWeight ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = key.nextDouble();
		return weight;
	}
	// BMI 출력
	public static double getBMI(double weight, double height) {
		double BMI = weight / ((height) * (height) / 10000);
        System.out.print("bmi : ");
		System.out.println(BMI);
		return BMI;
	}
	// 결과 판정해주는 함수
	// RAM을 덜 쓰려면 -> 변수를 줄이면 된다!
	// HDD를 덜 쓰려면 -> 코드를 줄이면 된다!
			public static String judgeBMI(double BMI) {
				String result = "저체중";
				if(BMI >= 40) {
					result = "고도비만";
				}else if(BMI >= 35) {
					result = "중증도비만";
				}else if(BMI >= 30) {
					result = "경도비만";
				}else if(BMI >= 25) {
					result = "과체중";
				}else if(BMI >= 18.5) {
					result = "정상";
				}
				return result;
			}
	// -> 바로 윗부분은 슨생님꺼
	
	// 결과 출력
	public static void bmiResult(double height, double weight, String name, double BMI) {
		System.out.println("--------------");
		System.out.printf("이름 : %s입니다.\n", name);
		System.out.printf("키 : %.1fcm입니다.\n", height);
		System.out.printf("몸무게 : %.1fkg입니다.\n", weight);
		System.out.printf("BMI : %.1f입니다.\n", BMI);
		System.out.println("--------------");
	
	try {
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	
	public static void main(String[] args) {
		
		String nameResult = getName();
		double heightResult = getHeight();
		double weightResult = getWeight();
		double BMI = getBMI(weightResult, heightResult);
			String result = judgeBMI(BMI); // -> 이거 슨생님꺼 결과
		bmiResult(heightResult, weightResult, nameResult, BMI);
				
		//double BMI = 0;
		
		 if (BMI >= 40) {
			 System.out.println("고도비만");
		}else if (BMI >= 35) {
			System.out.println("중증도비만");
		}else if (BMI >= 30) {
			System.out.println("경도비만");
		}else if (BMI >= 25) {
			System.out.println("과체중");
		}else if (BMI >= 18.5) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
	
		}
			
		
		
		
	}
}
