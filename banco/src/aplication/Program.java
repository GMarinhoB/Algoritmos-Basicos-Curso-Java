package aplication;

import java.util.Scanner;
import account.Account;

public class Program {

	public static void main(String[] args) {
		
		int x=10;
		double balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with the name: ");
		String name = sc.nextLine();
		System.out.print("Enter with the account number: ");
		int number = sc.nextInt();
		clearBuffer(sc);
		
		System.out.print("You want to put a inicial deposit?(Y/N) ");
		char res = sc.next().charAt(0);
		clearBuffer(sc);
		if(res == 'Y')
		{
			System.out.print("Enter with the account inicial deposit: ");
			balance = sc.nextDouble();
		} 
		Account ac = new Account(number, name, balance);
		
		do
		{
			System.out.println("\n\n\n\n\n\nWelcome to your bank terminal "
					+ac.getName()
					+"!\nYou have $"
					+String.format("%.2f", ac.getBalance()) 
					+" in you count number "
					+ac.getNumber()
					+ "\nChose an option:\n"
					+ "0 - END PROGRAM;\n"
					+ "1 - DEPOSIT SOME VALUE;\n"
					+ "2 - WITHDRAW SOME VALUE;\n"
					+ "3 - CHANGE YOUR NAME;\n");
			x = sc.nextInt();
			clearBuffer(sc);
			
			switch (x)
			{
				case 0:
					break;
				case 1:
					System.out.print("Enter with the value to be added: ");
					double add = sc.nextDouble();
					ac.addValue(add);
					break;
				case 2:
					System.out.print("Enter with the value to be removed: ");
					double remove = sc.nextDouble();
					ac.removeValue(remove);
					break;
				case 3:
					System.out.print("Enter with the new name: ");
					name = sc.nextLine();
					ac.setName(name);
			}
			
		} while(x!=0);
		
		sc.close();
	}

	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
}
