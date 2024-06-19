package kadai_017;

public class KatoExec_Chapter17 {
	
	public static void main(String[] args) {
		
		//KatoTaro_Chapter17インスタンスを親クラスのKato_Chapter17へ代入
		Kato_Chapter17 taro = new KatoTaro_Chapter17();
		//KatoIchiro_Chapter17インスタンスを親クラスのKato_Chapter17へ代入
		Kato_Chapter17 ichiro = new KatoIchiro_Chapter17();
		//KatoHanako_Chapter17インスタンスを親クラスのKato_Chapter17へ代入
		Kato_Chapter17 hanako = new KatoHanako_Chapter17();
		
				
		taro.execIntroduce();	
		ichiro.execIntroduce();
		hanako.execIntroduce();	
	}
}
