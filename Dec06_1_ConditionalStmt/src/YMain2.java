import java.util.Scanner;

public class YMain2 {

	// 정수 2개를 입력받아서 (각각의 함수에)
	// 그 정수 2개를 더했을 때 짝수면 결과 리턴, 아니면 값을 재입력

	public static int getA() {

		Scanner key = new Scanner(System.in);
		System.out.print("a : ");
		int a = key.nextInt();
		return a;
	}

	public static int getB() {
		Scanner key = new Scanner(System.in);
		System.out.print("b : ");
		int b = key.nextInt();
		return b;
	}

	public static int add(int a, int b) {
		Scanner key = new Scanner(System.in);
		int sum = a + b;
		//return (sum % 2 == 0) ? sum : add(a, b);		// 원하는 값이 들어오지 않으면 무한 루프가 돌아감
														// -> 처음 입력한 값이 계속 계산됨
		return(sum % 2 ==0)? sum : add(getA(), getB());
	}

	public static void main(String[] args) {
		int a = getA();
		int b = getB();
		int addNum = add(a, b);
		System.out.println(addNum);
		System.out.println("--------------");

	}
}
