package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aplicação;

public class Program {

	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		try (Scanner entrada = new Scanner (System.in)) {
			Aplicação product = new Aplicação();
			System.out.println("Enter product data: ");
			System.out.println("Name: ");
			product.name = entrada.nextLine();
			System.out.print(" Price: ");
			product.price = entrada.nextDouble();
			System.out.print("Quantity in stock: ");
			product.quantity = entrada.nextInt();
			
			
			System.out.println();
			System.out.println("product data: " + product);
			
			System.out.println();
			System.out.print("Enter the number of products to be added in stock: ");
			int quantity = entrada.nextInt();
			product.addProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: " + product);
			
			System.out.println();
			System.out.print("Enter the number of products to be remove in stock: ");
			quantity = entrada.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Update data: " + product);
		}
		
		
	}
}
