package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
		 * FileReader (stream (sequ�ncia) de leitura de caracteres a partir de arquivos)
		 * 
		 * BufferedReader (mais r�pido)
		 */
		
		
		//Implementa��o manual
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
		 * � um bloco try que declara um ou mais recursos, e garante que esses recursos ser�o
		 * fechados ao final do bloco - Dispon�vel no Java 7 em diante
		 */
		
//		String path = "c:\\tmp\\in.txt";
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
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
		
		//218. FileWriter e BufferedWriter (classes)
		
		/* File Writer (stream de escrita de caracteres de arquivos)
		 * - Cria/recria o arquivo: new FileWriter(path)
		 * - Acrescenta ao arquivo existente: new FileWriter(path, true)
		 * 
		 * BufferedWriter (mais r�pido)
		 * 
		 */
		
		String[] lines = new String[] {"Good Morning", "Good Evening", "Good Night"};
		//vetor com conteudo que ser� inseridos no arquivo
		
		String path = "c:\\tmp\\out.txt"; //arquivo que ser� criado e caminho
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			//parametro 'true' acrescenta o conteudo no arquivo sem recri�-lo
			for(String line : lines) {
				bw.write(line);
				bw.newLine();//quebra de linha
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
	
}
