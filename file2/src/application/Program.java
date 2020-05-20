package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		//vetor de string
	String[] linhas= new String[] {"nao", "naoaoo", "dshd"};
	String caminho = "C:\\Users\\Eclipse\\eclipse-workspace\\file\\saida.txt";
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
		//gravar no arquivo
		for (String linha : linhas ) {
			bw.write(linha);
			bw.newLine();//descer linha
		}
		
	}catch(IOException e) {
		e.printStackTrace();
	}
		
}
}