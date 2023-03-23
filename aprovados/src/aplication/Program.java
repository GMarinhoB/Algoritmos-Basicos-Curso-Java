package aplication;

import java.util.Scanner;
import studants.Studant;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("How many studant will be registered?");
		n = sc.nextInt();
		Studant[] vet = new Studant[n];
		
		for(int i=0; i<vet.length; i++)
		{
			clearBuffer(sc);
			System.out.print("Write the name of the " +(i+1)+ " studant: ");
			String name = sc.nextLine();
			System.out.print("Write the 1st note of the " +(i+1)+ " studant: ");
			double note1 = sc.nextDouble();
			System.out.print("Write the 2nd note of the " +(i+1)+ " studant: ");
			double note2 = sc.nextDouble();
			vet[i] = new Studant(name,note1,note2);
			vet[i].calcAvg();
		}
		
		System.out.println("Studants approved:");
		
		for(int i=0; i<vet.length; i++)
		{
			if(vet[i].getAvg()>=6)
			{
				System.out.println(vet[i].getName());
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
