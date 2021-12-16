import java.util.Iterator;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

public class User {
	
	int friendGiveNum; 
	int meMatchNum;
	
	// start
	public void start(Friend f, Me m) {
		Friend friend= callFriend();
		Me me = callMe();
		//int answer = askFrians(f);
		//int myAnswer;
		f.friendNum = f.answerNumber();
		m.meNum = m.matchNumber();
		for (int turn = 1; true; turn++) {
			meMatchNum = askMeNumber(me);
			endGame = judge(friendNum, meMatchNum);
			if (endGame) {
				countTry(turn);
				break;
			}
		}
	}
	
	// ģ�� �ҷ�
	public Friend callFriend() {
		Friend f  = new Friend();
		return f;
	}
	
	// �� �ҷ�
	public Me callMe() {
		Me m  = new Me();
		return m;
	}
	
	// ģ�� ���� ����
	public int askFriendNumber(Friend f) {
		System.out.print("1 - 100 ���� ���� : ");
		friendGiveNum = f.answerNumber();
		return friendGiveNum;
	}
		
	// ���� ���� �θ�
	public int askMeNumber(Me m) {
		System.out.println("1 - 100 ���� �־� : ");
		meMatchNum = m.matchNumber();
		if(meMatchNum < 1 || meMatchNum > 100 ) {
			System.out.println("����!!!");
		}
		return (meMatchNum >= 1 && meMatchNum <= 100) ? meMatchNum : askMeNumber(m);
	}
	
	// ����
	public boolean judge(friendNum, meMatchNum) {
		if(friendNum == meMatchNum) {
			System.out.println("����!");
		}else if (friendNum > meMatchNum) {
			System.out.println("Up!");
			
		}else if (friendNum < meMatchNum) {
			System.out.println("Down!");
		}
	}
	
	
	// �õ� Ƚ��
	public void countTry(int turn) {
		System.out.println("=============");
		System.out.printf("%d��° �õ��� ����!\n", turn);
		System.out.println("=============");
	}
	
}