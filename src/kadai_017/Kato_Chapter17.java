package kadai_017;

abstract public class Kato_Chapter17 {
	
	//姓を表す
	public String familyName = "加藤";
	//名を表す
	public String givenName;
	//住所を表す
	public String address ="住所は東京都中野区〇xです";
	
	Kato_Chapter17(){
	}
	
		
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {		
		System.out.println("名前は" + this.familyName + this.givenName + "です" );
		System.out.println(address);
	}
	
	//各サブクラスで個別に実装
	public abstract void eachIntroduce();
	
	//出力
	public void execIntroduce() {	
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}

}