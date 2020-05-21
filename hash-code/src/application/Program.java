package application;

import entities.Client;

public class Program {
	public static void main(String[] name) {
	Client c1 = new Client("Maria","maria@maria");
	Client c2 = new Client("Maria", "maria@maria");

	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.equals(c2));
	
	
	}
}
