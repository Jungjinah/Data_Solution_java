import java.util.Iterator;

// 戚掻 for庚 >> for庚照拭 for庚 >> (掻淡 for庚)

public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i葵 : %d-----\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j葵 : %d\n", j);
				
			}
			
		}
		System.out.println("---------------");
		// 姥姥舘
		for (int j = 1; j < 10 ; j++) {
			System.out.printf("--%d税 壕呪--\n", j);
			
			for (int i = 2; i < 10; i++) {
				//System.out.printf("%d x %d = ", i, j);
				//System.out.printf("%d\n", i * j);
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
		}
		
		// 紺啄奄 -> 植漆 汗界生稽..!
		
		/* せ
		 * せせ
		 * せせせ
		 * せせせせ
		 * せせせせせ
		 */
		System.out.println("\n------------------");

	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		
		/*	せ
		 *   せ 
		 *    せ
		 *     せ
		 *      せ
		 */
	
		System.out.println("\n----------------");
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <= i ; j++) {
				 if (j == i) {
					System.out.print("せ");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		// if庚 照床壱 馬澗 号狛!
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" "); 		// j亜 i左陥 拙精 因娃精
											// 句嬢床奄稽 五蚊捜
				
			}								// 益 戚須税 因娃精 "せ"生稽 五蚊捜
			System.out.println("せ");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "せ" : " ");
				
			}
			System.out.println();
		}
		
		// せせせせせ 
		// ぞぞぞぞ
		// せせせ
		// ぞぞ
		// せ
		
		System.out.println("-----------");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 1) ? "ぞ" : "せ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		// せ
		// ぞぞぞ
  		// せせせせせ
		// ぞぞぞぞぞぞぞ
		// せせせせせせせせ
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 2*i; j++) {
				System.out.print((i % 2 == 0)? "せ" : "ぞ");
			}
			System.out.println();
		}
		
		/*			*		
		 * 		   ***
		 * 		  *****	
		 * 		 *******
		 * 		*********
		 */
		System.out.println("-----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-(i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i +1; j++) {
				System.out.print("*");
			}
			
				System.out.println();
		}
		
		
	}
	
}










