
public class PMain2 {
	public static void main(String[] args) {
		// 1. Escape Sequence (�̽������� ����)
		//	  : Ư���� ���ڳ� Ư���� ����� ǥ���� �� �������� \�� ����ؼ�
		
		//	\t : TabŰ -> �� ���ߴ� �뵵
		//  \n : New Line -> �ٸ� ���ߴ� �뵵
		//  \r : Carriage Return -> Ŀ���� �� ������
		//  \r\n : EnterŰ
		//  \b : BackspaceŰ (1Byte�� ����) -> Java������ ���x
		//			C��� - �� ���� : 1byte
		//			Java - �� ���� : 2byte
		//  \0 : ��ĭ(spaceŰ) 
		
		System.out.println("\0�������ô� �� �ȳ�Ÿ���ִ��ų�");
		System.out.println("\tã�ƺ��� �Է��ϴϱ�");
		System.out.println("\nŸ�� ġ���� ���� �������ڳ�");
		System.out.println("\r������ �˾Ҵµ� ��Ծ���ȳ�");
		System.out.println("  ���� 3�� 11���̴�,,, �ð� ¯ ������");
		
		
		// ���� : ������ Ȯ�ο뵵�� ����ִ� �ܼ�â�̶�
		// 		  \r�̳� \n �ϳ��� �־ enterŰ ó���� ������
		// ����ó���� / ��� : \n�̳� \r �ϳ��� ���� �Ǹ�,, �� ��������!!!
		// -> ��Ŭ���� �ȿ����� \r �� \n �����ϱⰡ �������
		// -> \n���� ����ó���� �ϰ�, ���� ����ó������ \r, \n�� �ٷ��ƿ�~
	
		// \(^_^)/ , (".")
		
		// \\ : \�� ���ڷ�! -> ��θ� ������ ��!
		// \" : "�� ���ڷ�! -> 
		
		
		System.out.println("\\(^_^)/");
		System.out.println("\\*^_^*/");
		System.out.println("(\".\")");		
	}
	
	
	
	
}
