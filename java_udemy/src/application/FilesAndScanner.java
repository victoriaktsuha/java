package application;

import java.io.File;
import java.time.format.DateTimeFormatter;
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
		 * BufferedWriter (mais rápido)
		 * 
		 */
		
//		String[] lines = new String[] {"Good Morning", "Good Evening", "Good Night"};
//		//vetor com conteudo que será inseridos no arquivo
//		
//		String path = "c:\\tmp\\out.txt"; //arquivo que será criado e caminho
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
//			//parametro 'true' acrescenta o conteudo no arquivo sem recriá-lo
//			for(String line : lines) {
//				bw.write(line);
//				bw.newLine();//quebra de linha
//			}
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		//219. Manipulando pastas com File
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a folder path: ");
//		String strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		
//		//vetor contendo endereço das pastas dentro do caminho indicado
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("FOLDERS:");
//		for(File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		
//		//vetor contendo endereço dos arquivos dentro do caminho indicado
//		File[] files = path.listFiles(File::isFile);
//		System.out.println("FILES:");
//		for(File file : files) {
//			System.out.println(file);
//		}
//		
//		//criando subpasta
//		boolean success = new File(strPath + "\\subdir").mkdir();
//		System.out.println("Directory created successfully: " + success);
//		
//		sc.close();
		
		
		//220. Informações do caminho do arquivo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: "); // c:\tmp\nome_arquivo.ext
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//recuperar nome do arquivo
		System.out.println("getName: " + path.getName());
		
		//recuperar caminho do arquivo (sem o nome)
		System.out.println("getParent: " + path.getParent());
		
		//recuperar caminho do arquivo + o nome do arquivo
		System.out.println("getPath: " + path.getPath());
		
		//recuperar caminho do arquivo + o nome do arquivo
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		
	
		System.out.println("getTotalSpace: " + path.getTotalSpace());
		

		System.out.println("lastModified: " + path.lastModified());
		
		
		
		sc.close();

	}
	
}
