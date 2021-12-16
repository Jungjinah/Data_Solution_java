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
	
	// 친구 불러
	public Friend callFriend() {
		Friend f  = new Friend();
		return f;
	}
	
	// 나 불러
	public Me callMe() {
		Me m  = new Me();
		return m;
	}
	
	// 친구 숫자 제시
	public int askFriendNumber(Friend f) {
		System.out.print("1 - 100 숫자 제시 : ");
		friendGiveNum = f.answerNumber();
		return friendGiveNum;
	}
		
	// 나는 숫자 부름
	public int askMeNumber(Me m) {
		System.out.println("1 - 100 사이 넣어 : ");
		meMatchNum = m.matchNumber();
		if(meMatchNum < 1 || meMatchNum > 100 ) {
			System.out.println("어허!!!");
		}
		return (meMatchNum >= 1 && meMatchNum <= 100) ? meMatchNum : askMeNumber(m);
	}
	
	// 판정
	public boolean judge(friendNum, meMatchNum) {
		if(friendNum == meMatchNum) {
			System.out.println("정답!");
		}else if (friendNum > meMatchNum) {
			System.out.println("Up!");
			
		}else if (friendNum < meMatchNum) {
			System.out.println("Down!");
		}
	}
	
	
	// 시도 횟수
	public void countTry(int turn) {
		System.out.println("=============");
		System.out.printf("%d번째 시도에 정답!\n", turn);
		System.out.println("=============");
	}
	
}