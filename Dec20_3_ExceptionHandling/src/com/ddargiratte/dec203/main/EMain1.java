package com.ddargiratte.dec203.main;

import java.util.Scanner;

import jdk.nashorn.internal.ir.CatchNode;

public class EMain1 {

	// 廃厩嬢 - 腰蝕 -> 慎嬢

	// 紫引 apple
	// 駒艇 ???? -> error

	// error : Java税 庚狛拭 照限惟 潤辞 陳督析戚 災亜管廃 雌殿
	// 鯵降切 設公
	// 陳督析精 娃生馬艦 刃失沙精 蟹身 (叔楳馬澗汽 庚薦 蒸製 o)
	// 戚適験什亜 接社軒敗

	// warning : 走煽歳廃 坪球
	// 鯵降切 設公
	// 陳督析精 亜管馬艦 刃失沙精 蟹身 (叔楳馬澗汽 庚薦 蒸製 o)
	// 戚適験什亜 接社軒敗

	// exception : 覗稽益轡精 100% 刃失
	// 叔楳拝 凶 杭亜 須採旋昔 推昔拭 税背辞 拙疑戚 薦企稽 照鞠澗..
	// 鯵降切 設公精 焼還
	// 紫遂切 脊舌 -> 鯵降切亜 雌伐聖 森著背辞 企奪精 室趨兜切

	public static void main(String[] args) {
		// x : ?, y : ? 脊径 閤焼辞
		// 希廃葵, 捌 葵, 咽廃 葵, 蟹勧 葵聖 窒径

		Scanner key = new Scanner(System.in);

		System.out.print("x : ");
		int x = key.nextInt();

		System.out.print("y : ");
		int y = key.nextInt();

		System.out.println("-----------");

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println((double) x / y);
		
		
//		try {
//			析舘 食奄 叔楳背辞 鎧遂戚 級嬢神壱~
//		} catch (森須政莫誤 痕呪誤) {
//			try楕聖 叔楳馬陥亜 背雁 政莫税 森須亜 降持馬檎 食奄亜 叔楳
//			幻鉦, 森須蒸戚 舛雌旋生稽 叔楳菊聖 井酔, catch採歳精 益撹 走蟹帖壱
//			益 陥製 社什研 叔楳
//		}catch (Exception e) {
//			...		
//		}finally {
//			舛雌旋生稽 覗稽益轡戚 呪楳菊揮走,
//			森須亜 斗然揮走 雌淫蒸戚 叔楳
//			return左陥 胡煽 叔楳
//		}
		
		// 幻鉦拭 y葵拭陥 0聖 隔生檎..?
		// 砧亜走 庚薦亜 疑獣拭 斗遭 井酔, 胡煽 蟹紳 catch税 鎧遂幻 窒径
		// Java税 脊舌拭辞 湛腰属 森須亜 斗然聖 凶
		// 聡獣 叔楳 掻走馬壱, 背雁 森須坦軒 採歳生稽 角嬢亜奄 凶庚脊艦陥.
		
		// x : 10, y : 0 -> 72 - 73 (Arith) - 77 - 78		
		// x : 10, y : 1 -> 72 - 73 - 74 - 75 -76(array) - 79 - 80
		// x : 2, y : 1 -> 72 - 73 - 74 - 75 - 76
														// 72腰匝拭辞 try研 獣拙梅生糠稽 獣拙腰硲亜 72
//		try {											// 0生稽 蟹干聖凶澗 arith拭 杏形辞 77 78 窒径	
//			int d = x / y;								// 蟹干澗汽 壕伸 骨是 角嬢亜檎 array稽 角嬢人辞 79 80 窒径
//			System.out.println(d);						// 舛雌旋生稽 菊聖凶澗 arith櫛 array稽 照角嬢亜壱 益 穿猿走幻 窒径
//			int [] ar = {1, 2, 3};
//			System.out.println(ar[x]);
//		} catch (ArithmeticException e) {
//			System.out.println("0生稽 嬢胸惟 蟹刊劃壱~~");
//		}catch (ArrayIndexOutOfBoundsException aoe) {		// 是焼掘 砧鯵 杏軒檎 湛腰属 雌伐幻 蟹身.
//			System.out.println("壕伸 昔畿什 骨是亜 角醸陥壱推~");
//		}
		
				
		try {
			int d = x / y;
			System.out.println(d);
			int [] ar = {1, 2, 3};
			System.out.println(ar[x]);
		} catch (Exception e) {
			System.out.println("亀走 怯瞬ぞ");
			e.printStackTrace();	// 雌伐 窒径 (鯵降切遂)
		}finally {
			System.out.println("常せせせせせせせせせせせ");
		}
		
		
	}
}
