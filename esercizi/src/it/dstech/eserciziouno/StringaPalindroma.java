package it.dstech.eserciziouno;

import java.util.Scanner;

public class StringaPalindroma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringa = new String();
	
		do {
			System.out.println("Inserisci una parola");
			stringa = scanner.nextLine();
			stringa = stringa.replaceAll("\\s", "");
			String reverse = "";
			 int length = stringa.length();
		    for (int i = length - 1; i >= 0; i--)
			      reverse = reverse + stringa.charAt(i);

			    if (stringa.equals(reverse)) {
				System.out.println("La parola � palindroma");
			}
			else {
				System.out.println("La parola NON � palindroma");
			}
			    System.out.println("Vuoi continuare? Scrivi s�");
		} while (scanner.nextLine().equals("si")); {
	} 
	}
}
