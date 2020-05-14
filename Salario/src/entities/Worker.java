package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departamento department;//o trabalhador tem um departamento
	
	private List<HourContract> contracts= new ArrayList<>();//tem varios contratos
	public Worker() {}

	
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departamento department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public WorkerLevel getLevel() {
		return level;
	}



	public void setLevel(WorkerLevel level) {
		this.level = level;
	}



	public Double getBaseSalary() {
		return baseSalary;
	}



	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}



	public Departamento getDepartment() {
		return department;
	}



	public void setDepartment(Departamento department) {
		this.department = department;
	}



	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {//adicionar um contrato
		//pegar a lista e adiionar um contrato
		contracts.add(contract);
		
		
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
		
	}
	public double income(int year, int month) {
		//salario base mais os contratos do mes
		double soma= baseSalary;
		//percorrer a lista
		Calendar cal= Calendar.getInstance();
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year= cal.get(Calendar.YEAR);
			int c_month= 1+cal.get(Calendar.MONTH);//mes comeca com zero
			if((c_year == year)&&(c_month==month)) {
				soma=soma+c.totalValue();
			}
		}
	
		
		
	//return soma;
		return soma;
	}
	
}
