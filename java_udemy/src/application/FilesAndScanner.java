package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesAndScanner {

	public static void main(String[] args) {
		
		//215. Lendo arquivos de etxtos com as classes File e Scanner
		
		File file = new File("c:\\tmp\\in.txt");		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {				
				sc.close();
			}
		}
		
	}
	
}
