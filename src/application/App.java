package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import resources.Menu;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont;
		List<Employee> employeers = new ArrayList<>();
		
	
		
		
			Menu.initialMenu();
			
			
			
		

		sc.close();
	}

}
