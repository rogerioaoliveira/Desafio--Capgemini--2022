package applications;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println();

		//L�gica para a produ��o da escada, a partir do n�mero digitado pelo usu�rio
		
		for (int i = 0; i < n; i++) {
			int aux = n - i;
			System.out.println(" ".repeat(aux - 1) + "*".repeat(i + 1));
		}
		
		sc.close();
	}
}
