package estudos;
import java.util.Scanner;
import java.util.Locale;

public class AulaScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//			String x;
//			int x;
//			double x;
//			char x;
		
//			String x;
//			int y;
//			double z;
			
//			x = sc.next();
//			x = sc.nextInt();
//			x = sc.nextDouble();
//			x = sc.next().charAt(0);
			
//			x = sc.next();
//			y = sc.nextInt();
//			z = sc.nextDouble();
			
//			System.out.println("Você digitou: " + x );
			
//			System.out.println("Dados digitados:");
//			System.out.println(x);
//			System.out.println(y);
//			System.out.println(z);
			
			int x;
			String s1, s2, s3;
			
			x = sc.nextInt();
			sc.nextLine();
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			s3 = sc.nextLine();
			
//			s1 = sc.next();
//			s2 = sc.next();
//			s3 = sc.next();
			
			System.out.println("Dados digitados:");
			System.out.println(x);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		
		sc.close();
	}
}
