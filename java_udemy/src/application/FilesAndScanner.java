package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class FilesAndScanner {

	public static void main(String[] args) throws ParseException{
		
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
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a file path: "); // c:\tmp\nome_arquivo.ext
//		String strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		
//		//recuperar nome do arquivo
//		System.out.println("getName: " + path.getName());
//		
//		//recuperar caminho do arquivo (sem o nome)
//		System.out.println("getParent: " + path.getParent());
//		
//		//recuperar caminho do arquivo + o nome do arquivo
//		System.out.println("getPath: " + path.getPath());
//		
//		//recuperar caminho do arquivo + o nome do arquivo
//		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
//			
//		System.out.println("getTotalSpace: " + path.getTotalSpace());
//		
//		System.out.println("lastModified: " + path.lastModified());		
//		
//		sc.close();
		
		
		//221. Exercicio (https://github.com/acenelio/files1-java)
		
		/* Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos.
		 * Cada item possui um nome, preço unitario e quantidade, separados por vírgula.
		 * Você deve gerar um novo aquivo chamado "summary.csv", localizado em uma subpasta chamada "out"
		 * a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para
		 * aquele item (preço unitário multiplicado pela quantidade).
		 * 
		 */
		
		//minha solução (criei um .csv do zero)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many product will be registered: ");
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
				
		for(int i = 0; i < products.length; i++) {
			sc.nextLine();
			String productName = sc.nextLine();
			double productPrice = sc.nextDouble();
			int productAmount = sc.nextInt();			
			products[i] = new Product(productName, productPrice, productAmount);
		}						
		
		String[] productsFile = new String[products.length];
		
		for(int i = 0; i < products.length; i++) {
			productsFile[i] = products[i].getName() + ", " +String.format("%.2f",products[i].totalValueInStock());
		}
		
		
		File path = new File("c:\\tmp");
		
		boolean sub = new File(path + "\\out").mkdir();
		System.out.println("Directory created successfully: " + sub);
		
		if(sub == true) {
			String pathFile = "c:\\tmp\\out\\summary.csv"; //arquivo que será criado e caminho
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile))) {
				//parametro 'true' acrescenta o conteudo no arquivo sem recriá-lo
				for(String productFile : productsFile) {
					bw.write(productFile);
					bw.newLine();//quebra de linha
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("File created successfully");
		
		sc.close();
		
		
		//solução do instrutor (lê um arquivo csv)
		
//		Scanner sc = new Scanner(System.in);
//
//		List<Product> list = new ArrayList<>();
//
//		System.out.println("Enter file path: ");
//		String sourceFileStr = sc.nextLine();
//
//		File sourceFile = new File(sourceFileStr);
//		String sourceFolderStr = sourceFile.getParent();
//		
//		boolean success = new File(sourceFolderStr + "\\out").mkdir();
//		
//		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
//
//		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
//
//			String itemCsv = br.readLine();
//			while (itemCsv != null) {
//
//				String[] fields = itemCsv.split(",");
//				String name = fields[0];
//				double price = Double.parseDouble(fields[1]);
//				int quantity = Integer.parseInt(fields[2]);
//
//				list.add(new Product(name, price, quantity));
//
//				itemCsv = br.readLine();
//			}
//
//			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
//
//				for (Product item : list) {
//					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
//					bw.newLine();
//				}
//
//				System.out.println(targetFileStr + " CREATED!");
//				
//			} catch (IOException e) {
//				System.out.println("Error writing file: " + e.getMessage());
//			}
//
//		} catch (IOException e) {
//			System.out.println("Error reading file: " + e.getMessage());
//		}
//
//		sc.close();
		

	}
	
}
