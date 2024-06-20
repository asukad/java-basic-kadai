package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		// インスタンス化
		Dictionary_Chapter20 fruitsdictionary = new Dictionary_Chapter20();
		// 配列	
		 String[] lookUp = {"apple", "banana", "grape", "orange"};
		
		 
		// 検索したい英単語が辞書に含まれているか	
			for(String word : lookUp) {
				if(fruitsdictionary.wordList.containsKey(word)) {
					System.out.println(word + "の意味は" + fruitsdictionary.wordList.get(word));				
				} else {
					System.out.println(word + "は辞書に存在しません");
				}
									
				}
		}

	}



	