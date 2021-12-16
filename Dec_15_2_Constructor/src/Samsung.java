
public class Samsung {

	

	String cpu;	// final은 대문자로만 쓰므로, 구분을 해줘야하기 때문에 무조건 소문자,,
	int ram;
	int hdd;
	Company cp;
	
	public Samsung() {
		// TODO Auto-generated constructor stub
	}


	public Samsung(String cpu, int ram, int hdd, Company cp) {
	super();
	this.cpu = cpu;
	this.ram = ram;
	this.hdd = hdd;
	this.cp = cp;
}


	public void printInfo() {
		System.out.printf("CPU : %s\n", cpu);
		System.out.printf("RAM : %dGB\n", ram);
		System.out.printf("HDD : %dGB\n", hdd);
		cp.printCompany();
		//		System.out.println(brand.name);
//		System.out.println(brand.location);
//		System.out.println(brand.employee);
	}
	
}
