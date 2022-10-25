package entities;

public class Employee {

	private Long id;
	private String name;
	private String lastName;
	private String office;
	private Double salary;
	private Double newSalary;

	public Employee() {
	}

	public Employee(Long id, String name, String lastName, String office, Double salary, Double newSalary) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.office = office;
		this.salary = salary;
		this.newSalary = newSalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getNewSalary() {
		return newSalary;
	}

	public void setNewSalary(Double newSalary) {
		this.newSalary = newSalary;
	}

	@Override
	public String toString() {
		return "Employee [ id=" + id 
				+ ", name=" + name 
				+ ", lastName=" + lastName 
				+ ", office=" + office 
				+ ", salary="+ salary 
				+ ", newSalary=" + newSalary + "]";
	}

}
