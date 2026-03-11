package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
	public static void main(String[] args) {
		String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		String caminho = "D:\\IDEs\\ProjetosEclipse\\cursoJava\\src\\txtWrite.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}
