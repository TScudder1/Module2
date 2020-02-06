package Mod2;

/**
 * @author Teresa Scudder
 * @date 2/5/2020
 */

import java.util.*;
import java.util.Map;


public class TextAnalyzer {

	public static void main(String[] args) {
		// variables
		String inputString;
		int count;

		// Read in the file
		URLReader obj = new URLReader();

		// string from URLReader
		inputString = obj.fileString;

		try {
			// word array
			String[] wordsArray = inputString.split("\\s+");

			// mapping the array
			Map<String, Integer> map = new HashMap<>();

			//count words
			for (String word : wordsArray) {
				//
				if (map.containsKey(word)) {
					count = map.get(word);
					map.put(word, count + 1);
				} else {
					map.put(word, 1);
				}
			}

			// output
			System.out.println("Word   : Count");
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		

	}
}
