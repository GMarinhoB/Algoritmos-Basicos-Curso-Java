package aplication;

import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.println("Area X: " +areaX);
		System.out.println("Area Y: "+areaY);
		
		if(areaX > areaY) 
		{
			System.out.println("Area X is larger");
		}else
		{
			System.out.println("Area Y is larger");
		}
		
		sc.close();
	}

}
