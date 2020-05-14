package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Main {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();// tem varios funcionarios

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o número de empregados");
		Integer nrEmpregados = sc.nextInt();

		for (int i = 1; i <= nrEmpregados; i++) {
			System.out.println("Employee " + i + " dados");
			System.out.print("Terceirizado? s/n");
			char outsource = sc.next().charAt(0);

			System.out.print("Nome");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Horas");
			int horas = sc.nextInt();

			System.out.print("Valor por Hora");
			double valorHora = sc.nextDouble();

			if (outsource == 's') {
				System.out.println("Despesa adicional");
				Double addtionalCharge = sc.nextDouble();
				Employee outs = new OutsourceEmployee(nome, horas, valorHora, addtionalCharge);
				list.add(outs);
			} else {

				list.add(new Employee(nome, horas, valorHora));

			}

		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp: list ) {
			System.out.println(emp.getNome() +" = $ "+ emp.valorReceber());
		}

		sc.close();
	}
}
