package kadai_020;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter20 {
	
	protected HashMap<String, String> wordList = new HashMap<>();
	
	public Dictionary_Chapter20() {
		wordList.put("apple", "りんご");
		wordList.put("peach", "桃");
		wordList.put("banana", "バナナ");
		wordList.put("lemon", "レモン");
		wordList.put("pear", "梨");
		wordList.put("kiwi", "キウィ");
		wordList.put("strawberry", "いちご");
		wordList.put("grape", "ぶどう");
		wordList.put("muscat", "マスカット");
		wordList.put("cherry", "さくらんぼ");
	
	}	

	 public void printAllEntries() {
	        for (Map.Entry<String, String> entry : wordList.entrySet()) {
	            System.out.println(entry.getKey() + "の意味は" + entry.getValue());
	        }	
	 }
}