package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Menu {

	Scanner in = new Scanner(System.in);

	String menuInitial = """
			------- Welcome the System Pay of tax for employeers --------
			------------- What do you have for me today? ----------------
			----------------- 1-) Employee registration -----------------
			----------------- 2-) Income tax ----------------------------
			----------------- 3-) Encrease salary -----------------------
			----------------- 4-) Employeers list -----------------------
			----------------- 9-) End System ----------------------------
			------------------------ """;
	String empRegis = """

			------------------- Employee registration -------------------
			            How many employees be register? """;

	String listEmployee = """
			------------------- Employeers list -------------------------
			1-) List all employeers:
			""";
	String notRegister = """

			You not have employee register !
			Register firsth a new Employee !
			""";

	String thisEnd = """

			Do you want to go back to the inital menu ?
			(0 = Initial Menu/1 = Exit program) :
			""";

	public int cont;
	public Long id;
	Integer idPos;
	public String name, lastName, office;
	public double salary;

	List<Employee> employeers = new ArrayList<>();

	public void initialMenu() {

		System.out.print(menuInitial);
		cont = in.nextInt();
		moveInMenu(cont);

	}

	private void registerEmployee() {

		System.out.print(empRegis);
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

		optionPane();
		cont = in.nextInt();
		backToMenuOrExitSysytem(cont);
	}

	private void incomeTax() {
		System.out.println("\n------------------ Income tax ------------------------------");
		listNull();

		System.out.print("Enter the discont: ");
		
		double discount = in.nextDouble();
		
		employeers.get(idPos).setTax(discount);
		
		System.out.println("Update discount the salary sucessfull!");
		
		optionPane();
		cont = in.nextInt();
		backToMenuOrExitSysytem(cont);

	}

	private void increaseSalary() {
		System.out.println("\n------------------- Encrease salary -------------------------");

		listNull();

		System.out.print("Enter the percentage: ");

		double percentage = in.nextDouble();

		employeers.get(idPos).increaseSalary(percentage);

		System.out.println("Update salary sucessfull!");

		optionPane();
		cont = in.nextInt();
		backToMenuOrExitSysytem(cont);
	}

	private void listEmployee() {
		System.out.println(listEmployee);
		cont = in.nextInt();
		if (cont == 1) {
			for (Employee employee : employeers) {
				System.out.println(employee.toString() + "\n");
			}
		}

		optionPane();
		cont = in.nextInt();
		backToMenuOrExitSysytem(cont);
	}

	private void mensageEnd() {
		System.out.println("\n------------- Thanks for using until next time! -------------");
	}

	private void optionPane() {
		System.out.print(thisEnd);
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
		if (cont == 0) {
			initialMenu();
		} else if (cont == 1) {
			mensageEnd();
		} else {
			System.out.println("Error in input!");
			initialMenu();
		}
	}

	private Integer findById(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	private void listNull() {
		if (employeers.isEmpty()) {
			System.out.println(empRegis);
			registerEmployee();
		} else {
			System.out.print("How id: ");
			cont = in.nextInt();
			idPos = findById(employeers, cont);
			if (id == null) {
				System.out.println("It's id not excsiti, pleas register id and employee");
			}
		}
	}
}