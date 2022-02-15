package applications;

import java.util.Scanner;

import entities.KeyQuestionTwo;

public class QuestionTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Key (You need six characters being at least one uppercase, lowercase, number and a special character): ");
		String key = sc.nextLine();

		KeyQuestionTwo keys = new KeyQuestionTwo(key);

		System.out.println(keys.strongKey());
		
		sc.close();

	}

}
