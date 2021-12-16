import java.util.Iterator;
import java.util.Scanner;

// 지역변수(Local Variable)
//		메소드 속에서 만든 변수
//		그 행동을 하는 동안만 필요한 임시변수로
// 메소드 파라미터(Parameter)
//		그 행동을 하는데 필요한 재료
// 리턴되는 값
//		그 행동을 하고 난 결과물
// 멤버변수(Member Variable)
//		그 객체의 속성


public class Doctor {
	String name;
	
	int age;

	public void printDoctor() {
		System.out.println("< 의사 >");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("---------------");
	}
	
	public void Start() {
		Patient p = callPatient();
		p.name = askName(p);
		p.height = askHeight(p);
		p.weight = askWeight(p);
		p.bmi = calBMI(p);
		System.out.println(p.bmi);
		p.bmiResult = judgeBMI(p);
		tellResult(p);
	}
	public Patient callPatient() {
		Patient p = new Patient();
		return p;
	}
	
	// 손님 부르기
	public String askName(Patient p) {
		System.out.print("이름 : ");
		String n = p.answerName();
		return n;
	}	
	// 키 묻기(cm)
	// 재료 : 물어볼 대상
	// 결과 : 손님의 키
	public double askHeight(Patient p) {
		System.out.print("키(cm) : ");
		double h = p.answerHeight();
		if (h >= 1 && h <= 300) {
			System.out.println("==========");
			System.out.println("그렇군요!");
			System.out.println("==========");
		}else if ( h < 1 || h > 300) {
			System.out.println("==========");
			System.out.println("다시 입력하세요");
			System.out.println("==========");
		}
		return(h >= 1 && h <= 300) ? h / 100 : askHeight(p);
	}
	
	// 몸무게 묻기
	public double askWeight(Patient p) {
		System.out.print("몸무게(kg) : ");
		double w = p.answerWeight();
		if (w >= 1) {
			System.out.println("==========");
			System.out.println("그렇군요!");
			System.out.println("==========");
		}else if (w < 1) {
			System.out.println("==========");
			System.out.println("다시 입력하세요");
			System.out.println("==========");
		}
		return(w >= 1) ? w : askWeight(p);
	}
	
	// BMI 계산
	// 재료 : 손님정보(키, 몸무게)
	// 결과 : BMI값
	public double calBMI(Patient p) {
		return p.weight / (p.height * p.height);
		
	}
		
	// 판정해서 결과내기
	public String judgeBMI(Patient p) {
		if (p.bmi >= 40) {
			return "고도비만";
		}else if (p.bmi >= 35) {
			return "중증도비만";
		}else if (p.bmi >= 30) {
			return "경도";
		}else if (p.bmi >= 25) {
			return "과체중";
		}else if (p.bmi >= 18.5) {
			return "정상";
		}else {
			return "저체중";
		}
	}
	
	// 결과 출력하기(알려주기)
	public void tellResult(Patient p) {
		System.out.printf("체질량지수(BMI) : %.1f\n", p.bmi);
		System.out.printf("당신은 ...%s이니까...NAGA!", p.bmiResult);
	
	}
	// 위의 과정을 실행할 부분
		
//		Patient p = callPatient();
//		p.height = askHeight(p);
//		p.weight = askWeight(p);
//		p.bmi = calBMI(p);
//		p.bmiResult = judgeBMI(p);
//		tellResult(p);
	
}