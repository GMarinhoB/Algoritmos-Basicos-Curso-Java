package aplication;

import java.util.Scanner;

import student.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Student[] vet = new Student[10];
		
		System.out.print("How many rooms will be rented?(1-10) ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			clearBuffer(sc);
			System.out.println("Rent #" +(i+1)+ ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vet[room-1] = new Student(name, email, room);
		}
		
		for(int i=0; i<vet.length; i++)
		{
			if(vet[i]!= null)
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
