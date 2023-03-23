package aplication;

import java.util.Scanner;
import products.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		int N;
		
		System.out.println("Enter with the product: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Value: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quant = sc.nextInt();
		
		System.out.println("You have " +product.quant+ " " +product.name+ "s in stock. Each one coasts R$" +product.price);
		System.out.println("Total value in stock: " +product.totalValueInStock());
		
		System.out.print("How many products will be added? ");
		N = sc.nextInt();
		product.AddProduct(N);
		System.out.println("New quantity in strock: " +product.quant);
		System.out.println("New total value in stock: " +product.totalValueInStock());
		
		System.out.print("How many products will be removed? ");
		N = sc.nextInt();
		product.RemoveProduct(N);
		System.out.println("New quantity in strock: " +product.quant);
		System.out.println("N total value in stock: " +product.totalValueInStock());
		
		
		sc.close();
	}

}
