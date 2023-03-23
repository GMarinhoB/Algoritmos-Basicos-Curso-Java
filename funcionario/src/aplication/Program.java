package aplication;
import java.util.Scanner;
import employee.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		double perc;
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: "+employee);
		
		System.out.print("Which percentage to increase salary?" );
		perc = sc.nextDouble();
		employee.increaseSalary(perc);
		
		System.out.println("Updated data: " +employee);
		
		
		
		sc.close();
	}

}
