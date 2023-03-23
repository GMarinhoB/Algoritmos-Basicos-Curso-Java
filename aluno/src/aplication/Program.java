package aplication;

import java.util.Scanner;
import studant.Studant;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Studant s1 = new Studant();
		
		s1.name = sc.nextLine();
		s1.note1 = sc.nextDouble();
		s1.note2 = sc.nextDouble();
		s1.note3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = "+ String.format("%.2f", s1.finalNote())) ;
		System.out.println(s1.result());
		
		sc.close();
	}

}
