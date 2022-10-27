package application;

import java.util.Locale;
import java.util.Scanner;

import views.Menu;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Menu mn = new Menu();

		mn.initialMenu();
		

		sc.close();
	}

}
