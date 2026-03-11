package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResouces {
	public static void main(String[] args) {
		String caminho = "D:\\IDEs\\ProjetosEclipse\\cursoJava\\src\\txt.txt";
	
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		Scanner sc = new Scanner(System.in);
		String caminhoFoda = "D:\\IDEs\\Codigos\\pooJava\\tratandoArquivos\\tryWithResouces.txt";
		
		System.out.println("Quer ler um arquivo muito pika? (S/N)");
		char resposta = sc.next().toUpperCase().charAt(0);
		sc.close();
		
		if(resposta == 'S') {
			try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoFoda))){
				String linha = bufferedReader.readLine();
				while(linha != null) {
					System.out.println(linha);
					linha = bufferedReader.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		}
	}
}
