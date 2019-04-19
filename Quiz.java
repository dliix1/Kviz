package Mathquiz;

public class Quiz {

	double broj1;
	double broj2;

	public double getBroj1() {
		return broj1;
	}

	public void setBroj1(double broj1) {
		this.broj1 = broj1;
	}

	public double getBroj2() {
		return broj2;
	}

	public void setBroj2(double broj2) {
		this.broj2 = broj2;
	}

	double rezultat;

	public double getRezultat() {
		return rezultat;
	}

	Quiz() {

	}

	public void sabiranje() {
		broj1 = (int) (Math.random() * 10);
		broj2 = (int) (Math.random() * 10);

		System.out.println("Koliko je " + broj1 + " + " + broj2 + "?");

		rezultat = broj1 + broj2;

	}

	public void oduzimanje() {
		broj1 = (int) (Math.random() * 10);
		broj2 = (int) (Math.random() * 10);

		System.out.println("Koliko je " + broj1 + " - " + broj2 + "?");

		rezultat = broj1 - broj2;

		if (broj1 < broj2) {
			System.out.println("Koliko je " + broj2 + " - " + broj1 + "?");
			rezultat = broj2 - broj1;

		}

	}

	public void mnozenje() {
		broj1 = (int) (Math.random() * 10);
		broj2 = (int) (Math.random() * 10);

		System.out.println("Koliko je " + broj1 + " * " + broj2 + "?");

		rezultat = broj1 * broj2;
	}

	public void dijeljenje() {
		broj1 = (int) (Math.random() * 10);
		broj2 = (int) (Math.random() * 10);

		if (broj1 % broj2 == 0) {
			System.out.println("Koliko je " + broj1 + " / " + broj2 + "?");

			rezultat = broj1 / broj2;
		}
	}

	public void korjenovanje() {
		broj1 = (int) (Math.random() * 10);
		broj2 = Math.pow(broj1, 2);

		System.out.println("Koji je korijen iz " + broj2 + "?");

		rezultat = Math.sqrt(broj2);

	}

	public void kvadriranje() {
		broj1 = (int) (Math.random() * 10);

		System.out.println("Koji je kvadrat broja " + broj1 + "?");

		rezultat = Math.pow(broj1, 2);

	}
}
