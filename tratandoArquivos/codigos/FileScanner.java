package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) {
		File arquivo = new File("D:\\IDEs\\ProjetosEclipse\\cursoJava\\src\\txt.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch(IOException e){
			System.out.println(e.getMessage());
		} finally {
			if (sc != null)
				sc.close();
		}
		
		File arquivoFoda = new File("D:\\IDEs\\Codigos\\pooJava\\tratandoArquivos\\fileScanner.txt");
		Scanner scFile = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Deseja ler um arquivo muito fodastico (S/N)?");
		char resposta = scan.next().toUpperCase().charAt(0);
		scan.nextLine();
		
		if(resposta == 'S') {
			try {
				scFile = new Scanner(arquivoFoda);
				while (scFile.hasNextLine())
					System.out.println(scFile.nextLine());
			} catch(IOException e) {
				System.out.println(e.getMessage());
			} finally {
				scFile.close();
			}
		}
	}
}	


