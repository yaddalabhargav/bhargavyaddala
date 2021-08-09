package aug3;

public class Laptop implements Comparable<Laptop> {
	private int id;
	private int cost;
	private String name;
	private double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", cost=" + cost + ", name=" + name + ", rating=" + rating + ", quantity="
				+ quantity + "]";
	}
	public Laptop(int id, int cost, String name, double rating, int quantity) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.rating = rating;
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private int quantity;
	@Override
	public int compareTo(Laptop lap2) {
		if(this.id>lap2.id)
		return 2;
		else
			return -2;
	}
	

}
