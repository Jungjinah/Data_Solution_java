
public class IMain3 {
	public static void main(String[] args) { 
		// ȫ�浿, 17��, ��������б�, 1�г� -> ���
		// ��浿, 21��, �������б�, 2�г� -> ���
		// ��浿, 22��, �ǰ�, ���� -> ���
		
		Hong h = new Hong("ȫ�浿", 17, "��������б�", 1);
		h.printInfo();
		
		System.out.println("----------------");
		Kim k = new Kim("��浿", 21, "�������б�", 2);
		k.printInfo();
		
		System.out.println("----------------");
		Go g = new Go("��浿", 22, "�ǰ�", "����");
		g.printInfo();
		
		System.out.println("----------------");
		Pen p = new Pen();
		System.out.println("----------------");
		Pen p2= new Pen("����");
		System.out.println("----------------");
		Pen p3 = new Pen("�𳪹�", 300, "����");
		System.out.println("----------------");
		
		// �̸��� �мǸ���ũ, ������ 1000���� ����ũ
		
		Mask m = new Mask("�мǸ���ũ", 1000);
		System.out.println(m.name);
		System.out.println(m.price);
	
		
		
	}
}
