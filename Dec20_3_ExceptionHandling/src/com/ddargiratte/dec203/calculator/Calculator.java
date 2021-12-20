package com.ddargiratte.dec203.calculator;

public class Calculator {
	// 1. 食奄辞 焼森 魁舌聖 左切!! : try - catch - finally
	// 舛雌旋生稽 宜焼穐陥檎 : 7 - 8 - 9 - [14 - 15 - 16] - 10	([finally]澗 retrun左陥 察軒 吉陥!)
	// 幻鉦拭 y拭 0聖 隔嬢辞 Arithmetic戚 杏軒檎 : 7 - 8 - 9(Arith) - 11 - 12 - [14 - 15 - 16] - 13
	public static double divide(int x, double y) {
		try {
			double d = x / y;
			return d;
		} catch (Exception e) {
			System.out.println("生植!");
			return -9999;
		}finally {
			System.out.println("常せせせせせせせ");
		}
	}
	
	// 2. 耕欠奄 : throws -> try左陥 希 爽径
	// divide2研 叔楳馬陥亜 Arithmetic..亜 斗走檎
	// divide2研 硲窒廃 楕拭辞 背衣背虞!
	public static double divide2(int x, double y) throws /* Arithmetic*/ Exception {
		double d = x / y;
		return d;
	}
	
	
}
