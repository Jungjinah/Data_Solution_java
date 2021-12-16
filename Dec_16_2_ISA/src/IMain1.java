// 객체간의 관계
// A is a B : Dog is a Animal

public class IMain1 {
	public static void main(String[] args) {

		// 동물(Animal)객체 -> sort, age
		Tiger t= new Tiger();
		t.printInfo();
		System.out.println("------------");
		
		Lion l = new Lion("레오", 3, "울집");
		l.printInfo();
		
		
	}
}
