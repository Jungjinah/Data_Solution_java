// JavaDoc
// � ����� �����޶�� �䱸 -> ����µ� ����
//		�ǳ��ִ� ���?
// ��� : .java���� ���� .jar���Ϸ� �ǳ����!
//		 .java : �ҽ����� ����!
//		 .jar : �ҽ��� �������� �ʰ� + ��ɸ��� ����
//	JAR(Java Archive, �ڹ� ��ī�̺�) ����
//				: ���� ���·� �ٲ㼭 ������ �س��� ����

// �ѱ��� - ����(����) -> .java���Ϸ� ����
// (������ ��) .java���� - ����(Compile) -> .class����(��Ծ� / ����Ʈ�ڵ�)�� �ڵ����� ����
// .class���� -����-> 

// �츮�� ����� �ڵ�� .java���Ϸ� ����ǰ�,
// �� �� compile�̶�� �۾��� ���� .class����, �� ����� ��ȯ�Ǿ� �ڵ����� ����
// ����� ���� .class������ ���·� JVM���� �����Ǵ� ����

// .java���� : ����� ������ ���� ��
// .class���� : ������ �ڹٿ��� �����ϴ� ��

// �� ����? ���� / ����Ʈ�ڵ�� ��ȯ�ؼ� �����°ɱ�..?
//		- ����Ʈ�ڵ带 ����ϸ� ������ ������!
//		- �ҽ��� �����ϰ� �Ǹ� �̰� ���� ���α׷����� �� �� �ֱ� ������ '����'���� ������!
//	-> �ٸ� ������� ����� �Ѱ��� �� �ҽ��� �˷����� ���� �� ��ɸ��� ����ϰ� ����!
//  -> .java���� ���� .jar���Ϸ�!!!

// JavaDoc�� ���� : ��ǰ ����!
//	�츮�� ���� ���α׷��� ���� ����~~ HTML����, �츮�� �˰��ִ� WEB��������
// 	���� ���� ���ϰ�~~ ����ȭ ��Ų��!

// JavaDoc�� Ư¡
// - �ּ��� /** (����) */
// - �ּ����� ũ�� 2������ ����
//		����
//			�ּ��� ���ۿ��� ù��° �±� ���Ǳ����� �κ�
//			������ HTML�� ����ǹǷ� �ܼ��� �ּ� �ۼ���ÿ�
//			���͸� �ļ� ���� �ٲ㼭 �Է��ߴٰ� �ϴ���!
//			�״�� �̾����� ��µ�
//			�ٹٲ� ó���� �ϰ� �ʹٸ� <p>�� �ۼ��ϸ� ��!
//		�±� ����
//			ù��° ���ڰ� '@'�� �����Ѵ�.
//			 - @author : �� ���α׷��� �ۼ���, �⺻������ Window ���� ID
//			 - @version : �� �״�� �� ���α׷��� ����
//			 - @param : ��� ������ ���� ������ �� �� ��� / ex) @param ��������� ����
//			 - throws : ����ó���� ���� ����
// 			 - @return : �޼ҵ尡 void�� �ƴ� ��ȯ ���� ���� �� �װͿ� ���� ����


/*	
 *	@DDargiratte
 *	@version 1.1.14
 *	<p>
 *  ���� ĳ������ ������ ������ �ִ� Ŭ����
 */

public class GameCharacter {
	
	String nickname;
	int level;
	String job;
	String weapon;
	
/*
 * 	���� ĳ���͸� �����մϴ�.
 * 	<p> �⺻ ����� ���, �⺻ ������ �ʺ����Դϴ�.
 * 	@param nickname ĳ������ �̸�; ���̴� 3�� �̻� 12�� �����̾�� �մϴ�.
 *  @throws IllegalArgumentException ĳ������ nickname ���̰� ������ ������ �����,
 *  �� ({@code nickname < 3 || nickname > 10}) �̸� �߻��մϴ�.
 */
	
	public GameCharacter(String nickname) {
		this.level = 1;
		this.job = "�ʺ���";
		this.weapon = "���";
		if (nickname.length() < 3 || nickname.length() > 12) {
			throw new IllegalArgumentException("ĳ���� �̸��� 3�� �̻� 12�� �����Դϴ�.");
		}
		
		this.nickname = nickname;
	}
	
	/*
	 * ĳ������ ������ �÷��ִ� �޼ҵ��Դϴ�.
	 */
	
	public void levelup() {
		this.level++;
	}
	
	/*
	 * ĳ������ ������ �����մϴ�.
	 * @param job ĳ������ ������ ����
	 * @throws IllegalArgumentException ĳ������ ������ 10�� ���� �ʾҴٸ� �߻��մϴ�.
	 */
	
	public void setJob(String job) {
		if (this.level < 10) {
			throw new IllegalArgumentException("ĳ������ ������ 10�� ���� �ʽ��ϴ�.");
		}
		this.job = job;
	}
	
	/*
	 * ������ ĳ������ status���� �����ִ� �޼ҵ��Դϴ�.
	 */
		
	public void printInfo() {
		System.out.println("ĳ���� ���� ����!");
		System.out.printf("ĳ���� �г��� : %s\n", this.nickname);
		System.out.printf("ĳ���� ���� : %d\n", this.level);
		System.out.printf("ĳ���� ���� : %s\n", this.job);
		System.out.printf("ĳ���� ���� : %s\n", this.weapon);
		
	}
}
