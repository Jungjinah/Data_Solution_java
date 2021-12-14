
public class FMain3 {

	public static void test(int q) {	// q (blue) : 파라미터
		System.out.println(q); // 10 2) q (blue)
		q = 20;				   // q (blue) 20으로
		System.out.println(q); // 20 3) q (blue)
		// 이쪽 영역으로 넘어온 이상 다 끝내고 main 영역으로 다시 돌아간다.
	
	}
	public static void main(String[] args) {
		int q = 10;		// q (red) : 지역변수
		System.out.println(q); //10  1) q (red)
		test(q);			// test 함수 호출, q (blue)
							// q (blue)에 q (red)에 있는 값을 복사해서 넣어주기
		System.out.println(q); //10  4) q (red)
		// 더이상 내용이 없으니 프로그램 종료!
		
	}
	
}
