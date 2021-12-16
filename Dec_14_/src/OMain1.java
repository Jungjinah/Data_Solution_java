import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// ÀÇ»ç (ÀÌ¸§, ³ªÀÌ)
		Doctor d = new Doctor();
		d.name = "±è´ÚÅÍ";
		d.age = 53;
		
		// ¼Õ´Ô (ÀÌ¸§, ³ªÀÌ)
		Patient p = new Patient();
		p.name = "°ûµÎÆÈ";
		p.age = 34;
		p.printPatient();
		d.Start();
		
	}
	
}
