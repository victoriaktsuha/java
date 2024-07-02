package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilesAndScanner {

	public static void main(String[] args) {
		
		//215. Lendo arquivos de etxtos com as classes File e Scanner
		
//		File file = new File("c:\\tmp\\in.txt");		
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		}
//		catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		finally {
//			if(sc != null) {				
//				sc.close();
//			}
//		}
		
		//216. FileReader e BufferedReader (classes)
		
		/*
		 * FileReader (stream (sequência) de leitura de caracteres a partir de arquivos)
		 * 
		 * BufferedReader (mais rápido)
		 */
		
		
		//Implementação manual
//		String path = "c:\\tmp\\in.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String line = br.readLine();
//			
//			while (line != null){
//				System.out.println(line);
//				line = br.readLine();
//			}
//		}
//		catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		finally {			
//			try {
//				
//				if(br != null) {				
//					br.close();
//				}
//				if(fr != null) {				
//					fr.close();
//				}
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//		}		
		
		//217. Bloco try-with-resources
		
		/*
		 * É um bloco try que declara um ou mais recursos, e garante que esses recursos serão
		 * fechados ao final do bloco - Disponível no Java 7 em diante
		 */
		
		String path = "c:\\tmp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			
			while (line != null){
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}
	
}
