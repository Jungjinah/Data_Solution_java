import java.util.Scanner;

public class YMain1 {
	// 평일 스케줄 출력해주는 프로그램
	
	// 시간을 입력 받아서 -> 해당시간에 속하는 내용을 출력 -> 시간 범위가 아니면 다시 입력
	// 오전 9시 - 오후 6시 : 학원에서 공부
	// 오전 9시, 오후 6시  : QR찍기
	// 오후 1시 : 점심시간
	// 오후 6시 ~ 오후 8시 : 집에가는 시간
	// 오전 6시 - 오전 9시 전까지 : "기상 + 씻기 + 학원가기"
	// 오후 8시 - 오전 6시 : "여가시간  + 취침"
	public static int inTime ( ) {		
		System.out.print("<평일 스케줄>\n");
		Scanner key = new Scanner(System.in);
		System.out.print("시간 : ");
		int time = key.nextInt();
		return (0 <= time && time <= 24) ? time : inTime() ;
	}
	public static void main(String[] args) {
		
		
		int time = inTime();
		//System.out.println(time);
		
		if (time > 9 && time < 13 || time < 18 && time > 13) {
			System.out.println("학원에서 공부");
		}else if (time == 9 || time == 18) {
			System.out.println("QR찍기");
		}else if (time == 13) {
			System.out.println("점심시간");
		}else if (time > 18 && time < 20) {
			System.out.println("집에 가는 시간");
		}else if (time > 6 && time < 9 ) {
			System.err.println("기상 + 씻기 + 학원가기");
		}else if (time >= 20 || time <= 6) {
			System.out.println("여가시간 + 취침");
		}
		
		
		
		
	}
	
	

}
