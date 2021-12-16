
public class Candy {

	
	String name;
	String taste;
	Company brand;	// Á¦Á¶»ç¸¦ ³Ö±â À§ÇØ¼­ company²¨ ²ø°í¿È,,
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	public void printCandy() {
		System.out.printf("»çÅÁ ÀÌ¸§ : %s\n", name);
		System.out.printf("»çÅÁ ¸À : %s\n", taste);
	}
	

	
	
	
}
