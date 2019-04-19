package Mathquiz;

import java.util.Scanner;

public class QuizTest {

	public static void main(String[] args) {

		Quiz kviz = new Quiz();
		Ispis ispis = new Ispis();

		ispis.ispis();
		Scanner unos = new Scanner(System.in);

		int unosKorisnika = unos.nextInt();

		switch (unosKorisnika) {
		case 1:
			kviz.sabiranje();
			int rezultat = unos.nextInt();
			if (rezultat == kviz.getRezultat()) {
				System.out.println("Cestitamo, pogodili ste rezultat.");
			} else
				System.out.println("Nazalost niste pogodili rezultat.");

			break;
		case 2:
			kviz.oduzimanje();
			rezultat = unos.nextInt();
			if (rezultat == kviz.getRezultat()) {
				System.out.println("Cestitamo, pogodili ste rezultat.");
			} else
				System.out.println("Nazalost niste pogodili rezultat.");

			break;
		case 3:
			kviz.mnozenje();
			rezultat = unos.nextInt();
			if (rezultat == kviz.getRezultat()) {
				System.out.println("Cestitamo, pogodili ste rezultat.");
			} else
				System.out.println("Nazalost niste pogodili rezultat.");

			break;
		case 4:
			kviz.dijeljenje();
			rezultat = unos.nextInt();
			if (rezultat == kviz.getRezultat()) {
				System.out.println("Cestitamo, pogodili ste rezultat.");
			} else
				System.out.println("Nazalost niste pogodili rezultat.");

			break;
		case 5:
			kviz.korjenovanje();
			rezultat = unos.nextInt();
			if (rezultat == kviz.getRezultat()) {
				System.out.println("Cestitamo, pogodili ste rezultat.");
			} else
				System.out.println("Nazalost niste pogodili rezultat.");

			break;
		case 6:
			kviz.kvadriranje();
			rezultat = unos.nextInt();
			if (rezultat == kviz.getRezultat()) {
				System.out.println("Cestitamo, pogodili ste rezultat.");
			} else
				System.out.println("Nazalost niste pogodili rezultat.");

			break;

		}

		unos.close();
	}
}
