import java.util.Scanner;

public class ExercicioTerreno {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			double largura = sc.nextDouble();
			double comprimento = sc.nextDouble();
			double metroQd = sc.nextDouble();
			
			double area = largura * comprimento;
			double preco = area * metroQd;
			
			System.out.printf("AREA = %.2f%n", area);
			System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
		
	}
}
