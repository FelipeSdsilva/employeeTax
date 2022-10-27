package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Menu {

	Scanner in = new Scanner(System.in);

	public int cont;
	public Long id;
	public String name, lastName, office;
	public double salary;

	List<Employee> employeers = new ArrayList<>();

	public void initialMenu() {

		System.out.println("------- Welcome the System Pay of tax for employeers --------"
				+ "\n------------- What do you have for me today? ----------------"
				+ "\n----------------- 1-) Employee registration -----------------"
				+ "\n----------------- 2-) Income tax ----------------------------"
				+ "\n----------------- 3-) Encrease salary -----------------------"
				+ "\n----------------- 4-) Employeers list -----------------------"
				+ "\n----------------- 9-) End System ----------------------------");
		System.out.print("------------------------ ");
		cont = in.nextInt();
		if(cont == 1) {
			registerEmployee(cont);
		}
	}

	public void registerEmployee(int menuMove) {

		if (menuMove == 1) {
			System.out.println("----------------- 1-) Employee registration -----------------");
			System.out.print("How many employees be register? ");
			cont = in.nextInt();
			for (int i = 0; i < cont; i++) {
				System.out.print("\n-------- Id: ");
				id = in.nextLong();
				System.out.print("\n-------- Name: ");
				in.nextLine();
				name = in.nextLine();
				System.out.print("\n-------- LastName: ");
				lastName = in.nextLine();
				System.out.print("\n-------- Office: ");
				office = in.nextLine();
				System.out.print("\n------- Salary: R$");
				salary = in.nextDouble();

				Employee emp = new Employee();
				emp.setId(id);
				emp.setName(name);
				emp.setLastName(lastName);
				emp.setOffice(office);
				emp.setSalary(salary);

				employeers.add(emp);

			}
			System.out.print("You have exit ?( 0=y/ 1=n) \n");
			cont = in.nextInt();
			if (cont == 0) {
				initialMenu();
			} else {
				registerEmployee(cont);
			}
		} else if (menuMove == 2)

		{
			incomeTax();
		} else if (menuMove == 3) {
			System.out.println("----------------- 3-) Encrease salary -----------------------");
		}

	}

	public static void incomeTax() {
		System.out.println("----------------- 2-) Income tax ----------------------------");
	}

	public static void mensageEnd() {
		System.out.println("------------- Thanks for using until next time! -------------");
	}

}
