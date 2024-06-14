package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		boolean[] num = new boolean[101];
		
		// 配列をtrueで初期化
		for(int k = 1; k < num.length ; k++ ) {
			num[k] = true;
		}
		
		// 素数の判定			
		for (int i = 2; i < num.length; i++) {
			for (int r= 2; r*r <=i; r++) {
				if(i % r == 0) {
					num[i] = false;
					break;
				}
			}
		}
		// 素数の出力
		for (int j = 2; j < num.length; j++) {
			if(num[j] ) {
				System.out.println(j);
			}
		 }		
	}
}
