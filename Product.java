package in.ac.sharda.PizzaApp.domain;

public class Product {
	
	private String name, description;
	private int id;
	private int price;
	public String getName() {
		return name;
	}
	
	public Product(String name, String description, int id, int price) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Product)
		return ((Product)obj).getId()== id;
		return false;
	
	
	}
}
