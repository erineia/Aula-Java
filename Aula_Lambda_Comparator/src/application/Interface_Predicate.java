package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Interface_Predicate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		//list.removeIf(new ProductPredicate());
		//Versão com predicado com o método staticProductPredicate dentro da classe de produto
		
			//list.removeIf(Product :: staticProductPredicate);
		
		//versão com método não statico
			//list.removeIf(Product :: nonstaticProductPredicate);
		
		//Versão lambda declarada sem referencia de método
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
		

	}

}
