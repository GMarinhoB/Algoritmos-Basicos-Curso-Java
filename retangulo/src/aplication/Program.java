package aplication;
import java.util.Scanner;
import rectangle.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rt = new Rectangle();
		
		System.out.println("Enter with the rectangle width and height: ");
		rt.width = sc.nextDouble();
		rt.height = sc.nextDouble();
		
		System.out.print(rt);
		
		sc.close();
	}

}
