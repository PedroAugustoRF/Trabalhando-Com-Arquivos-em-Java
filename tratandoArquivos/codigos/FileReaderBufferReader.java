package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderBufferReader {
	public static void main(String[] args) {
		String caminho = "D:\\IDEs\\ProjetosEclipse\\cursoJava\\src\\txt.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);

			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		String caminhoFoda = "D:\\IDEs\\Codigos\\pooJava\\tratandoArquivos\\fileBufferedReader.txt";
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		System.out.println("Deseja ler um arquivo muito fodastico (S/N)?");
		char resposta = sc.next().toUpperCase().charAt(0);
		sc.nextLine();
		
		if(resposta == 'S') {
			try {
				fileReader = new FileReader(caminhoFoda);
				bufferedReader = new BufferedReader(fileReader);
				
				String linhaFoda = bufferedReader.readLine();
				
				while(linhaFoda != null){
					System.out.println(linhaFoda);
					linhaFoda = bufferedReader.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			} finally {
				try {
					if (bufferedReader != null)
						bufferedReader.close();
					if (fileReader != null)
						fileReader.close();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
}
