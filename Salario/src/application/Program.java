package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import entities.Departamento;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program{
	public static void main(String[] args) throws ParseException {
		
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter depatment's name: ");
		String departmentName=sc.nextLine();
		
		System.out.println("Enter worker data");//dados do trabalhador
		
		System.out.print("Name: ");//nome
		String workerName=sc.nextLine();

		System.out.print("Level: ");//nivel do trabalhador
		String workerLevel=sc.nextLine();

		System.out.print("Base salary:");//salario base
		double baseSalary= sc.nextDouble();
        //departamento e uma composiao 
		//intanciar um novo e a instanciar
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Departamento(departmentName));
		
		//instanciamos um novo objeto do tipo worker
		//inserimos os dados e associado a ele temos um objeto do tipo departamento e nome dele o nome que foi digitado
		
		
		
		System.out.println("How many contracts to this worker? ");//quantos contratos tem esse trabalhador
			
		Integer n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter contract "+i+" data:");//salario base; 	
			
			System.out.print("Date (DD/MM/YYYY): ");//salario base;
			Date contractDate = sdf.parse(sc.next());
			
			System.out.println("Value per hour:");//salario base;
			double valuePerHour= sc.nextDouble();
	        
			System.out.println("Duration hours:");//salario base;
			int hours= sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
	        //associar o contato com o trabalhadr
			worker.addContract(contract);
			
		}
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/yyyy)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));//tres em diante
		
		System.out.println("Name: "+ worker.getName());
		System.out.println("Department: "+ worker.getDepartment().getDepartmentName());
		System.out.println("Income for "+ monthAndYear+ ": "+ String.format("%.2f",worker.income(year, month)));

		
		//for se repete ate instanciar todos contratos
		sc.close();
	}
	
	
	
}