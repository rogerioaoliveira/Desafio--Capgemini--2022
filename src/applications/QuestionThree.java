package applications;

import java.util.Scanner;
import entities.AnagramQuestionThree;

public class QuestionThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = sc.next();
		
		//Instancia um novo objeto de senha segundo o construtor da classe AnagramQuestionThree
		
		AnagramQuestionThree anagram = new AnagramQuestionThree(word);

		//Chama o metodo que contará o número de amangramas possíveis, passando como parametro a palavra que o usuário digitou
		
		anagram.countOfAnagrams(word);

		sc.close();

	}

}