package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoDiretorios {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um caminho: ");
		String qualCaminho = scan.nextLine();
		
		File caminho = new File(qualCaminho);
		
		File[] diretorios = caminho.listFiles(File::isDirectory);
		System.out.print("Diretórios: ");
		
		for (File diretorio : diretorios) {
			System.out.println(diretorio);
		}
		
		scan.close();
	}
}
