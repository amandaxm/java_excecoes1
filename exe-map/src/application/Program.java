package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Map;
import java.util.Scanner;

import java.util.TreeMap;

public class Program {
public static void main(String[] args) {
	Map<String, Integer> eleicao = new TreeMap<>();

Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo:");
		String path = sc.nextLine();
		try(BufferedReader br= new BufferedReader(new FileReader(path))){
			
			String line =br.readLine();
			while(line != null) {
				//recortar string 
				String[] fields = line.split(",");
				String name = fields[0];
				
				int votos = Integer.parseInt(fields[1]);
				//se ja tem esse nome
				if(eleicao.containsKey(name)) {
					//pega o numero de votos
					votos = eleicao.get(name)+ votos;
					eleicao.put(name,votos);
					
				}else {
					eleicao.put(name,votos);
					
				}
							
				//le a proxima linha
				line = br.readLine();
			}
			
			
			
		}catch(IOException e){
			System.out.println("Erro, "+e.getMessage());
		}
		System.out.println("All candidatos");
		//keySey retor um Set<K>
		for(String key: eleicao.keySet()) {
			//chave e o valor da chave
			System.out.println(key + " votos "+ eleicao.get(key));
		}
		sc.close();
	}

}
