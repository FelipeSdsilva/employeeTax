package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char cont;
		List<Employee> employeers = new ArrayList<>();
			
		do {
			System.out.println("------- Welcome the System Pay of tax for employeers --------");
			
			
			cont = sc.next().charAt(0);
		} while (cont != 'n' && cont != 'N');
		
		System.out.println("------- Thanks for using until next time --------");

		sc.close();
	}

}
