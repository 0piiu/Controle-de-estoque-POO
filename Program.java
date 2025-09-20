package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

			Product product = new Product();
			
			System.out.println("Entre com os dados do produto: ");
			
			System.out.print("Nome: ");
			product.name = sc.nextLine();  // ARMAZENA O DADO DIGITADO NA VARIAVEL NAME
			
			
			System.out.print("Price: ");
			product.price = sc.nextDouble(); // ARMAZENA O DADO DIGITADO NA VARIAVEL PRICE
			
			System.out.print("Quantity in stock: ");
			product.quantity = sc.nextInt(); // ARMAZENA O DADO DIGITADO NA VARIAVEL QUANTITY 
			 
			
			 System.out.println("product data: " + product);
			 
			 System.out.println("");
			 
			 System.out.println("Enter the number of product to be addesd in stock: "); // ADICIONANDO ITENS AO ESTOQUE
			 int quantity = sc.nextInt(); // DIGITANDO VALOR QUE ENTRARÁ A MAIS EM ESTOQUE 
			 product.addProducts(quantity); // USANDO O METODO addProducts
			 
			 System.out.println("");
			 
			 System.out.println("Update data: " + product); // ATUALIZAÇÃO DE PRODUTOS NA TELA
			 
			 System.out.println("");
			 
			 System.out.println("Enter the number of product to be removed in stock: ");
			 quantity = sc.nextInt();
			 product.removeProducts(quantity);
			 
			 System.out.println("");
			 
			 System.out.println("Update data: " + product); // ATUALIZAÇÃO DE PRODUTOS NA TELA
			 
			 
		sc.close();
		
	}
	


}
