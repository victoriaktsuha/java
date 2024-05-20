package entities;

public class Employee {
	
	//atributos
	public String name;
	public double grossSalary;
	public double tax;
	
	//funções
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increasySalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}	
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	

}
