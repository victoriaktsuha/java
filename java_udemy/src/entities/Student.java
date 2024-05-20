package entities;

public class Student {
	
	//atributos
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	//funções
	public double media() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public double faltante() {
		if(media() < 60) {
			return 60.0 - media();
		}else {
			return 0.0;
		}
	}
}
