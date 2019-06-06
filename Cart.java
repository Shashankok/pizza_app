package in.ac.sharda.PizzaApp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> products=new ArrayList<>();
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
}
