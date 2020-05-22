package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//MAP so FUCNIONA COM STREAM, coverter list para stream
		//List<String> names=list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//converter essa stream para list
//com referencia
		
		//List<String> names=list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
		//expressao lambda
		//Function<Product, String> fun = p-> p.getName().toUpperCase();
	//	List<String> names=list.stream().map(fun).collect(Collectors.toList());
		List<String> names=list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());

		//names.forEach(p->p.setPrice(p.getPrice() * 1.1));
		names.forEach(System.out::println);
	}

}
