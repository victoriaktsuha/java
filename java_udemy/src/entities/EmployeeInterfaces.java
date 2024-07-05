package entities;

public class EmployeeInterfaces implements Comparable<EmployeeInterfaces>{
	
	private String name;
	private Double salary;
	
	public EmployeeInterfaces(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
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

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeInterfaces other) {
		//retorna um int -, 0 ou + se objeto for menor, igual ou maior que o objeto especificado
		//em relação a ordem alfabetica
		//ordenado por nome
//		return name.compareTo(other.getName());
		//ordenado por salario crescente
//		return salary.compareTo(other.getSalary());
		//ordenado por salario decrescente
		return -salary.compareTo(other.getSalary());
		
	}
	
}
