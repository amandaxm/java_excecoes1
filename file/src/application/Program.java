package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Eclipse\\eclipse-workspace\\file\\doc.txt");
		Scanner sc = null;
		// instanciar o scanner a partir desse arquivo
		try {
			sc = new Scanner(file);
			// enquanto tiver uma nova linha
			while (sc.hasNextLine()) {
				// imprimir linha do arquivo
				System.out.println(sc.nextLine());

			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		} finally {
			if(sc != null)
			sc.close();
		}
	}

}
