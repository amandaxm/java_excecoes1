package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,4,5,10,7);
	
		//Stream<Integer> st1 = list.stream();
		//to array, converte stream para vetor
		//map atribui a todos da lista
		Stream<Integer> st1 = list.stream().map(x-> x*10);
		
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<String> st2 = Stream.of("Maria", "Alex");
		System.out.println(Arrays.toString(st2.toArray()));
		//iterate geracao 
		//inicia do zero e o resto itera mais dois, potencialmente infinita
		Stream<Integer> st3 = Stream.iterate(0, x->x+2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L},p-> new Long[] {p[1],p[0]+p[1]}).map(p->p[0]);
	//fibonacci
		System.out.println(Arrays.toString(st4.limit(10).toArray()));

	
	
	}
	
	

}
