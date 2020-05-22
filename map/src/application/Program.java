package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		//tree map ordena 
		Map<String, String> cookies = new TreeMap<>();
		//inserir um valor
		//chave e valor
		cookies.put("username", "Maria");
		cookies.put("email", "maroa@gmaikl");
		cookies.put("phone", "999");
		
		//remove
		cookies.remove("email");
		cookies.put("phone", "999543");
		//mp nao admite repeticoes da chave
		
		//verificar se existe uma determinada chave
		System.out.println("Contains'phone' key: "+cookies.containsKey("phone"));
		
		
		//pegar valor de uma chave
		System.out.println("Phone number: "+cookies.get("phone"));

		
		System.out.println("All cookies");
		//keySey retor um Set<K>
		for(String key: cookies.keySet()) {
			//chave e o valor da chave
			System.out.println(key + ": "+ cookies.get(key));
		}
	}
}
