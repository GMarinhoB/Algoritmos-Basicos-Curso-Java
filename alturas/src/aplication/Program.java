package aplication;

import java.util.Scanner;
import persons.Persons;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double hSum, hAvg, percentage;
		
		System.out.print("How many persons will be registered? ");
		n = sc.nextInt();
		Persons [] vet = new Persons[n];
		
		for(int i=0; i<vet.length; i++) {
			clearBuffer(sc);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			vet[i] = new Persons(name, age, height);
		}
		
		hSum = 0;
		percentage =0;
		for(int i=0; i<vet.length; i++) {
			hSum += vet[i].getHeight(); 
			if(vet[i].getAge()<16)
			{
				percentage++;
			}
		}
		
		hAvg = hSum/n;
		percentage = (percentage*100)/n;
		System.out.println("Average of heights: " +String.format("%.2f", hAvg));
		System.out.println("Percentage of people younger than 16: " +String.format("%.2f", percentage));
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getAge()<16)
			{
				System.out.println(vet[i].toString());
			}
		}
		
		sc.close();
	}

	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
