import java.util.Scanner;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class KMain1 {
	public static void main(String[] args) throws InterruptedException {
		
		// Scanner : Java의 내장되어있는 기능 중 하나!
		// 이 기능을 불러오기 위해 Import라는 것이 사용됨
		// 이 Scanner라는걸 사용하려면 조건이 하나 필요한데,,
		
		
		// new ~~ : 객체 
		
		// Scanner는 화면(이클립스의 콘솔창)으로부터 데이터를 입력 받는 기능
		
		// 입력을 준비를 해서 keyboard라는 변수에 저장
		Scanner Keyboard = new Scanner(System.in);
		
		// 이름을 콘솔창에 출력할건데,,
		System.out.print("이름 : ");
		String name = Keyboard.next();
		System.out.println(name);
		
		// 키, 사는 곳, 신발사이즈, 좋아하는 숫자, 식사 유무
		
		System.out.print("키 :");
		int height = Keyboard.nextInt();
		System.out.println(height);
		
		System.out.print("사는 곳 :");
		String address = Keyboard.next();
		System.out.println(address);
		
		
		System.out.print("신발사이즈 :");
		int shoesize = Keyboard.nextInt();
		System.out.println(shoesize);
		
		System.out.print("좋아하는 숫자 :");
		int likeyNum = Keyboard.nextInt();
		System.out.println(likeyNum);
		
		System.out.println("식사 유무 :");
		boolean meal = Keyboard.nextBoolean();
		System.out.println(meal);
		
		
		System.out.printf("이름\t: %s\n", name);
		System.out.printf("키\t: %dcm\n", height);
		System.out.printf("사는곳\t: %s\n", address);
		System.out.printf("좋아하는 숫자\t: %d\n", likeyNum);
		System.out.printf("식사 유무\t: %b\n", meal);
		
		System.out.print("끄고 싶으면 아무거나 입력 : ");
		String quit = Keyboard.next();
		Keyboard.close();
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("프로그램을 종료합니다!");
		
		
		Thread.sleep(5000);
		System.out.print("여전히 반복중~");
		Thread.sleep(5000);
		System.out.print("끝난줄 알아찌~~");
		
		
		
		
		
		
	}
}
