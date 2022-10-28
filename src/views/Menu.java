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
		moveInMenu(cont);

	}

	private void registerEmployee() {

		System.out.println("\n------------------- Employee registration -------------------");
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

		System.out.print("Do you want to go back to the inital menu or register more employeers ?"
				+ "\n(0 = Initial Menu/1 = register new Employee/2 = Exit program)  \n");
		cont = in.nextInt();
		backToMenuOrExitSysytem(cont); 
	}

	private void incomeTax() {
		System.out.println("\n------------------ Income tax ------------------------------");
		System.out.print("How id ");
		System.out.print("Do you want to go back to the inital menu or register more employeers ?"
				+ "\n(0 = Initial Menu/1 = register new Employee/2 = Exit program)  \n");
	}

	private void increaseSalary() {
		System.out.println("\n------------------- Encrease salary -------------------------");
	}

	private void listEmployee() {
		System.out.println("\n------------------- Employeers list -------------------------");
	}

	private void mensageEnd() {
		System.out.println("\n------------- Thanks for using until next time! -------------");
	}

	private void moveInMenu(int moveMenu) {
		switch (moveMenu) {
		case 1:
			registerEmployee();
			break;
		case 2:
			incomeTax();
			break;
		case 3:
			increaseSalary();
			break;
		case 4:
			listEmployee();
			break;
		case 9:
			mensageEnd();
			break;

		}
	}
	private void backToMenuOrExitSysytem(int backMenu) {
		if (cont == 0)
			moveInMenu(cont);
		else if (cont == 1){
			initialMenu();
		}else if(cont == 2) {
			mensageEnd();
		}else {
			System.out.println("Error in input!");
		} 
	}
}
