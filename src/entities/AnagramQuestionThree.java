package entities;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramQuestionThree {
	
	private String word;
	
	//construtor da classe passando como parâmetro uma palavra 
	
	public AnagramQuestionThree(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	//Metodo que quebra a string em substrings analisa os possíveis anagramas e adiciona na contagem, passando uma palavra como parâmetro
	
	public void countOfAnagrams(String word) {
		HashMap<String, Integer> sub = new HashMap<>();
		int quantityOfAnagrams = 0;

		for (int i = 0; i < word.length(); i++) {
			
			for (int j = i; j < word.length(); j++) {				
				char[] newWordChar = word.substring(i, j + 1).toCharArray();
				Arrays.sort(newWordChar);
				String newWord = new String(newWordChar);
				
				if (sub.containsKey(newWord)) {
					sub.put(newWord, sub.get(newWord) + 1);
				} else {
					sub.put(newWord, 1);
				}
			}
		}
		
		//Percorre a lista de substrings e adiciona se houver correspondência 

		for (String newWord : sub.keySet()) {
			int value = sub.get(newWord);
			
			if (value == 1) {
				quantityOfAnagrams += 0;
			} else {
				System.out.print(newWord + " ");
				quantityOfAnagrams += 1;
			}
		}

		//imprime na tela o resultado final do algoritimo
		
		System.out.printf("In the word %s were found %d anagrams.", word,
				quantityOfAnagrams);
	}
}
