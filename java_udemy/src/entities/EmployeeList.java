package entities;

public class EmployeeList {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeList() {
	}

	public EmployeeList(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percent) {
		salary *= percent + salary;
	}

//	@Override
//	public String toString() {
//		return "EmployeeList [id=" + id + ", name=" + name + ", salary=" + salary + ", getId()=" + getId()
//				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	

}
