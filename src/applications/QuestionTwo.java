package applications;

import java.util.Scanner;

import entities.KeyQuestionTwo;

public class QuestionTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Key (You need six characters): ");
		String key = sc.nextLine();

		//Instancia um novo objeto de senha segundo o construtor da classe KeyQuestionTwo
		
		KeyQuestionTwo keys = new KeyQuestionTwo(key);

		//Chama o metodo que testará se a string passada pelo usuário atende aos requisitos
		
		System.out.println(keys.strongKey());
		
		sc.close();

	}

}
