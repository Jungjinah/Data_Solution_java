
public class Samsung {

	

	String cpu;	// final�� �빮�ڷθ� ���Ƿ�, ������ ������ϱ� ������ ������ �ҹ���,,
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
